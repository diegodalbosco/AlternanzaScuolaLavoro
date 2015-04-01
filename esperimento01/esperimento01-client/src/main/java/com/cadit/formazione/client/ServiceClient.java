package com.cadit.formazione.client;

import com.cadit.configuration.Configuration;
import com.cadit.formazione.api.ServiceApi;
import com.cadit.formazione.api.data.DataObject;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class ServiceClient {

    // TODO: Estrarre in un'api ServiceLocator
    private static final Configuration CONF = Configuration.getConfiguration("client", ServiceClient.class.getClassLoader());
    private static final String SERVICE_LOCAL_PROP = "SERVICE_LOCAL";
    private static final Boolean SERVICE_LOCAL_DEFAULT = Boolean.TRUE;
    private static final String JNDI_PREFIX_PROP = "JNDI_PREFIX";
    private static final String JNDI_PREFIX_DEFAULT = "DEV.JNDI";
    private static final String CONTEXT_MAP_PREFIX_PROP = "SERVICE_CONTEXT_MAP_PREFIX";
    private static final String CONTEXT_MAP_PREFIX_DEFAULT = "DEV.CONTEXT";

    // JNDI dei singoli servizi
    private static final String SERVICE_API_JNDI_PROP = "SERVICE_API";
    private static final String TOBINI_API_JNDI_PROP = "TOBINI_API";
    //private static final String SERVICE_API_JNDI_DEFAULT = "java:global/esperimento01/esperimento01-service/ServiceApi";
	private static final String SERVICE_API_JNDI_DEFAULT = "java:global/esperimento01-ear/esperimento01-service-1.0-SNAPSHOT/EnterpriseService";
        private static final String TOBINI_API_JNDI_DEFAULT = "java:global/esperimento01-ear/esperimento01-service-1.0-SNAPSHOT/TobiniApiBean";
        
    private final ServiceApi _api;
    private final ServiceApi _tobiniApi;
    
    public ServiceClient() throws NamingException {
        Context c;
        boolean local = CONF.getBoolean(SERVICE_LOCAL_PROP, SERVICE_LOCAL_DEFAULT);
        if (local) {
            c = new InitialContext();
        } else {
            c = new InitialContext(getContextProperties());
        }
        String jndi = getServiceJndi(SERVICE_API_JNDI_PROP, SERVICE_API_JNDI_DEFAULT);
        _api = (ServiceApi) c.lookup(jndi);
        String tobiniJndi = getServiceJndi(TOBINI_API_JNDI_PROP, SERVICE_API_JNDI_DEFAULT);
        _tobiniApi = (ServiceApi) c.lookup(jndi);
    }

    private String getServiceJndi(String serviceApiJndiProp, String serviceApiJndiDefault) {
        StringBuilder res = new StringBuilder();
        res.append(CONF.getString(JNDI_PREFIX_PROP, JNDI_PREFIX_DEFAULT))
                .append(".")
                .append(serviceApiJndiProp);
        return CONF.getString(res.toString(), serviceApiJndiDefault);
    }

    private Properties getContextProperties() {
        Properties res = new Properties();

        String mapName = CONF.getString(CONTEXT_MAP_PREFIX_PROP, CONTEXT_MAP_PREFIX_DEFAULT);
        Map<String, String> map = CONF.getMap(mapName, new HashMap<String, String>());
        for (String key : map.keySet()) {
            res.put(key, map.get(key));
        }

        return res;
    }
    
    public ServiceApi getServiceApi() {
        return _api;
    }
    public ServiceApi getTobiniApi() {
        return _tobiniApi;
    }
    
}
