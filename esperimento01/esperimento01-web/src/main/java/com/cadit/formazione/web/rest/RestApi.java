package com.cadit.formazione.web.rest;

import com.cadit.formazione.api.ServiceApi;
import com.cadit.formazione.api.data.DataObject;

import javax.ejb.EJB;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import javax.ws.rs.QueryParam;

@Path("/api")
public class RestApi {

    @EJB
    ServiceApi _serviceApi;

    @GET
    @Path("service")
    @Produces(MediaType.APPLICATION_JSON)
    public List<DataObject> getDataObjects() throws NamingException {
        List<DataObject> dataObjects = _serviceApi.getDataObjects();
        return dataObjects;
    }
    
    @GET
    @Path("add")
    public void addDataObject(
            @QueryParam("nome") String nome,
            @QueryParam("lingua") String lingua) throws NamingException {
        _serviceApi.addDataObject(nome, lingua);
    }
    
}
