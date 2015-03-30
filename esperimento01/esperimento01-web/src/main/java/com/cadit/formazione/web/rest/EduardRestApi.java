package com.cadit.formazione.web.rest;

import com.cadit.formazione.client.ServiceClient;
import com.cadit.formazione.web.rest.render.Renderer;
import com.cadit.formazione.api.data.DataObject;
import com.cadit.formazione.api.eduard.EduardApi;
import com.cadit.formazione.api.eduard.Element;

import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import javax.ws.rs.FormParam;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.QueryParam;

@Path("/Eduard")
public class EduardRestApi {

    @POST
    @Path("Element")
    public String createElement( 
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
        return "ciao";
    }
    
    
    @GET
    @Path("service")
    @Produces(MediaType.APPLICATION_JSON)
    public String getDataObjects() throws NamingException {
        ServiceClient client = new ServiceClient();
        List<DataObject> dataObjects = client.getServiceApi().getDataObjects();
        return Renderer.getJson(dataObjects);
    }
    
    @GET
    @Path("add")
    public void addDataObject(
            @QueryParam("nome") String nome,
            @QueryParam("lingua") String lingua) throws NamingException {
        ServiceClient client = new ServiceClient();
        client.getServiceApi().addDataObject(nome, lingua);
    }
    
}
