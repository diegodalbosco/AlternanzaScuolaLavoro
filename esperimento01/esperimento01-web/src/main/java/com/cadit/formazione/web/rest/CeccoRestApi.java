/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.web.rest;



import com.cadit.formazione.api.Cecco.Squadra;
import com.cadit.formazione.api.Cecco.Utente;
import java.util.List;

import javax.naming.NamingException;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
/**
 *
 * @author cecco
 */
 @Path("/cecco")
public class CeccoRestApi {
   


    @POST
    @Path("Squadra")
    @Produces(MediaType.APPLICATION_JSON)
    public Utente createUtente(
            @FormParam("_nome") String a,
            @FormParam("_cognome") String d
            
    )throws NamingException {
        Utente b= new Utente(a,d);
        
        return b;
    }
    
    
}

