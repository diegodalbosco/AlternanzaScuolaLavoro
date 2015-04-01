package com.cadit.formazione.web.rest;

import com.cadit.formazione.api.ServiceApi;
import com.cadit.formazione.web.rest.render.Renderer;
import com.cadit.formazione.api.data.DataObject;
import com.cadit.formazione.api.eduard.Element;

import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import javax.naming.InitialContext;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.QueryParam;

@Path("/Eduard")
public class EduardRestApi {

    private final ServiceApi _serviceApi;
    
    public EduardRestApi() throws NamingException {
        InitialContext ic = new InitialContext();
        _serviceApi = (ServiceApi) ic.lookup("java:global/esperimento01-ear/esperimento01-service-1.0-SNAPSHOT/EnterpriseService!com.cadit.formazione.api.ServiceApi");
    }
    
    @POST
    @Path("Element")
    public Element createElement( 
        @FormParam("name") String name,
        @FormParam("surname") String surname,
        @FormParam("age") String age
                )
            throws NamingException {
        //ServiceClient client = new ServiceClient();
          
        Element element=new Element();
        element.setName(name);
        element.setSurname(surname);
        element.setAge(age);
        //EduardApi eduardApi=client.getEduardApi();
        //eduardApi.createElement(element);
        return element;
    }
    
    
    @GET
    @Path("service")
    @Produces(MediaType.APPLICATION_JSON)
    public String getDataObjects() throws NamingException {
        //ServiceClient client = new ServiceClient();
        List<DataObject> dataObjects =  _serviceApi.getDataObjects();
        return Renderer.getJson(dataObjects);
    }
    
    @GET
    @Path("add")
    public void addDataObject(
            @QueryParam("nome") String nome,
            @QueryParam("lingua") String lingua) throws NamingException {
        //ServiceClient client = new ServiceClient();
       _serviceApi.addDataObject(nome, lingua);
    }
    
}
