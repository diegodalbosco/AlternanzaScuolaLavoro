package com.cadit.formazione.web.rest;

import com.cadit.formazione.api.francesco.*;
import java.rmi.Naming;
import javax.naming.NamingException;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;

@Path("/francesco")
public class FrancescoRestApi {

    @POST
    @Path("alunno")
    @Produces(MediaType.APPLICATION_JSON)
    public Alunno getAlunno(
            @FormParam("nome") String nome,
            @FormParam("cognome") String cognome
    ) throws NamingException{
        
        Alunno alunno = new Alunno();
        alunno.setNome(nome);
        alunno.setCognome(cognome);
        
        return alunno;
        
        
    }
    
    
    
}


