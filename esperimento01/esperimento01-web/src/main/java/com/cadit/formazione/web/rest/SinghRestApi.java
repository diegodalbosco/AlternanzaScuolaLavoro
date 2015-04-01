package com.cadit.formazione.web.rest;

import javax.naming.NamingException;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;


@Path("/singh")
public class SinghRestApi {

    @POST
    @Path("service")
    @Produces(MediaType.APPLICATION_JSON)
    public String getNome(@FormParam("a") String a) throws NamingException{
     //ServiceClient client = new ServiceClient();
     //return client.getJapneetApi().getNome(a);
     return "ciao";
}
   
}
