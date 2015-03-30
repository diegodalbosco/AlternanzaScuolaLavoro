package com.cadit.formazione.web.rest.render;

import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;
import com.thoughtworks.xstream.io.json.JsonWriter;

import java.io.Writer;

public class JsonDriver extends JsonHierarchicalStreamDriver {

    private final boolean _pretty;

    public JsonDriver(boolean pretty) {
        _pretty = pretty;
    }

    public HierarchicalStreamWriter createWriter(Writer writer) {
        char[] chars = {};
        JsonWriter.Format format = new JsonWriter.Format(chars, chars, 0);
        JsonWriter res;
        if (_pretty) {
            res = new JsonWriter(writer, JsonWriter.DROP_ROOT_MODE);
        } else {
            res = new JsonWriter(writer, JsonWriter.DROP_ROOT_MODE, format);
        }
        return res;
    }

}
