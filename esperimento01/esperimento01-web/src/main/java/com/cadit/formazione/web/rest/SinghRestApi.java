package com.cadit.formazione.web.rest;

import com.cadit.formazione.web.rest.render.Renderer;
import com.cadit.formazione.api.data.DataObject;
import com.cadit.formazione.api.japneet.*;

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

@Path("/api")
public class SinghRestApi {

    @POST
    @Path("domanda")
    @Produces(MediaType.APPLICATION_JSON)
    public String getNome(@FormParam("a") String a) throws NamingException{
     //ServiceClient client = new ServiceClient();
     //return client.getJapneetApi().getNome(a);
     return "ciao";
}
   
}
