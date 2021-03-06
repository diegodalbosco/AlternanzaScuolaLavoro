package com.cadit.formazione.web.rest;

import com.cadit.formazione.api.ServiceApi;
import com.cadit.formazione.api.data.DataObject;
import com.cadit.formazione.api.eduard.Elemento;

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

   private EduardRestApi _eduardRestApi;
    
   /* public EduardRestApi() throws NamingException {
        InitialContext ic = new InitialContext();
        _eduardRestApi = (EduardRestApi) ic.lookup("java:global/esperimento01-ear/esperimento01-service-1.0-SNAPSHOT/EnterpriseService!com.cadit.formazione.api.EduardApi");
    }
    */
    @POST
    @Path("Element")
    public Elemento createElement( 
        @FormParam("name") String name,
        @FormParam("surname") String surname,
        @FormParam("age") String age
                )
            throws NamingException {
        //ServiceClient client = new ServiceClient();
          
        Elemento element=new Elemento();
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
      String dataObjects =  _eduardRestApi.getDataObjects();
      return dataObjects;
    }
    
    @GET
    @Path("add")
    public String addDataObject(
            @QueryParam("nome") String nome,
            @QueryParam("cognome") String cognome,
            @QueryParam("età") String età
    ) throws NamingException {
        //ServiceClient client = new ServiceClient();
       _eduardRestApi.addDataObject(nome, cognome, età);
       return "ok";
    }
    
}
