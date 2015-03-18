package com.cadit.formazione.web.rest;

import com.cadit.formazione.client.ServiceClient;
import com.cadit.formazione.web.rest.render.Renderer;
import com.cadit.formazione.api.data.DataObject;

import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
public class RestApi {

    @GET
    @Path("service")
    @Produces(MediaType.APPLICATION_JSON)
    public String getDataObjects() throws NamingException {
        ServiceClient client = new ServiceClient();
        List<DataObject> dataObjects = client.getDataObjects();
        return Renderer.getJson(dataObjects);
    }
    
}
