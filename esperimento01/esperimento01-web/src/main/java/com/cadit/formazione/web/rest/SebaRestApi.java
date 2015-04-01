package com.cadit.formazione.web.rest;

import com.cadit.formazione.api.Sebastiano.Request;
import com.cadit.formazione.api.Sebastiano.Response;
import com.cadit.formazione.client.ServiceClient;

import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;

@Path("/seba")
public class SebaRestApi {
    
    @GET
    @Path("risposta")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getResponse(
            @FormParam("richiesta") Request richiesta
    ) throws NamingException{
        ServiceClient client = new ServiceClient();
        
        return client.getSebaApi().getResponse(richiesta);
    }
    
    //NON VA QUA
    @POST
    @Path("richiesta")
    @Produces(MediaType.APPLICATION_JSON)
    public Request createRequest(
            @FormParam("titolo") String title,
            @FormParam("testo") String text
    ) throws NamingException{
        //ServiceClient client = new ServiceClient();

        return new Request(title, text);
    }    
}
