package com.cadit.formazione.web.rest;

import com.cadit.formazione.api.Piacentini.Classe;

import javax.naming.NamingException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.FormParam;

@Path("/PiacentiniApi")
public class PiacentiniApi {

    @POST
    @Path("classe")
    @Produces(MediaType.APPLICATION_JSON)
    public String createClass(
        @FormParam("sezione") String sezione,
        @FormParam("anno") Integer anno) throws NamingException {
//        ServiceClient client = new ServiceClient();
        
        Classe classe=new Classe(sezione, anno);
        return "ciao";
    }
}
