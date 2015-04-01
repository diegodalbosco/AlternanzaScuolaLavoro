package com.cadit.formazione.web.rest;

import com.cadit.formazione.client.ServiceClient;
import com.cadit.formazione.web.rest.render.Renderer;
import com.cadit.formazione.api.data.DataObject;
import com.cadit.formazione.api.tobini.Classe;
import com.cadit.formazione.api.tobini.Studente;

import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.QueryParam;

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
