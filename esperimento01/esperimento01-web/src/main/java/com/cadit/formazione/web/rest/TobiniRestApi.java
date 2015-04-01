package com.cadit.formazione.web.rest;

import com.cadit.formazione.api.tobini.Classe;

import javax.naming.NamingException;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;

@Path("/tobini")
public class TobiniRestApi {

    @POST
    @Path("visuastudenti")
    @Produces(MediaType.APPLICATION_JSON)
    public void getStudenti(
            @FormParam("sezione") Classe c
    ) throws NamingException {
        //ServiceClient client = new ServiceClient();
        c.getStudenti();
    }

//    @POST
//    @Path("inseriscistudente")
//    @Produces(MediaType.APPLICATION_JSON)
//    public void insertStudenti(
//            @FormParam("studenti") List<Studente> stud,
//            @FormParam("sezione") Classe cla
//    ) throws NamingException {
//        //ServiceClient client = new ServiceClient();
//        cla.aggiungiStudenti(stud);
//        
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
