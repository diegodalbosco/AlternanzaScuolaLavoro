package com.cadit.formazione.web.rest.render;

import com.cadit.configuration.Configuration;
import com.thoughtworks.xstream.XStream;

public class Renderer {

    private static final Configuration CONF = Configuration.getConfiguration("rest", Renderer.class.getClassLoader());
    private static final String JSON_INDENT_PROP = "JSON_INDENT";
    private static final Boolean JSON_INDENT_DEFAULT = Boolean.FALSE;

    private static XStream XSTREAM = null;
    private static final Object XSTREAM_LOCK = new Object();

    private static XStream getXStream() {
        XStream res;
        if (XSTREAM == null) {
            synchronized (XSTREAM_LOCK) {
                if (XSTREAM == null) {
                    XSTREAM = new XStream(new JsonDriver(CONF.getBoolean(JSON_INDENT_PROP, JSON_INDENT_DEFAULT)));
                    XSTREAM.setMode(XStream.NO_REFERENCES);
                    //        Definizione dei converter e degli alias...
                    //        XSTREAM.registerConverter(...);
                    //        XSTREAM.alias(...);
                }
            }
        }
        res = XSTREAM;
        return res;
    }

    public static String getJson(Object response) {
        XStream xstream = getXStream();
        return xstream.toXML(response);
    }

}
