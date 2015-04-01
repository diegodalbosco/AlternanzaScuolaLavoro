package com.cadit.formazione.web.rest;

import com.cadit.formazione.api.tobini.Classe;
import com.cadit.formazione.api.tobini.TobiniApi;
import javax.naming.InitialContext;

import javax.naming.NamingException;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;

@Path("/tobini")
public class TobiniRestApi {

    private TobiniApi _tobiniApi;

//    public TobiniRestApi() throws NamingException {
//        InitialContext ic = new InitialContext();
//        _tobiniApi = (TobiniApi) ic.lookup("java:global/esperimento01-ear/esperimento01-service-1.0-SNAPSHOT/EnterpriseService!com.cadit.formazione.api.TobiniApi");
//    }

    @POST
    @Path("creaclasse")
    @Produces(MediaType.APPLICATION_JSON)
    public String createClasse(
            @FormParam("sezione") String sez
    ) throws NamingException {
        //ServiceClient client = new ServiceClient();
        Classe classe = new Classe(sez);
        return "Ciao";
    }
}
