package com.cadit.formazione.web.rest;


import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.QueryParam;

@Path("/dalbosco")
public class DalBoscoRestApi {

    @GET
    @Path("saluta")
    public String saluta(@QueryParam("saluto") String saluto) {
        return "Ciao "+saluto;
    }
    
    @POST
    @Path("domanda")
    @Produces(MediaType.APPLICATION_JSON)
    public String getRisposta(@FormParam("q") String domanda) throws NamingException{
        Object dataObjects;
        //ServiceClient client = new ServiceClient();
        //return client.getDalBoscoServiceApi().saluta("Diego");
        return "Arrivo da DalBoscoRestApi ->"+ domanda;
        
    }
    
    
}
