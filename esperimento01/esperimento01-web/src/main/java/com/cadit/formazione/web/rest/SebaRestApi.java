package com.cadit.formazione.web.rest;

import com.cadit.formazione.api.Sebastiano.Request;
import com.cadit.formazione.api.Sebastiano.Response;
import com.cadit.formazione.api.Sebastiano.SebaApi;

import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.QueryParam;

@Path("/seba")
public class SebaRestApi {
    
    private SebaApi _sebaApi;
    
    /*    
    public SebaRestApi() throws NamingException {
    InitialContext ic = new InitialContext();
    _sebaApi = (SebaApi) ic.lookup("java:global/esperimento01-ear/esperimento01-service-1.0-SNAPSHOT/EnterpriseService!com.cadit.formazione.api.SebaApi");
    }*/
    
    @GET
    @Path("risposta")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getResponse(
            @QueryParam("titolo") String title,
            @QueryParam("testo") String mainText
    ) throws NamingException{
        
        Request richiesta = new Request(title, mainText);
        return _sebaApi.getResponse(richiesta);
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
