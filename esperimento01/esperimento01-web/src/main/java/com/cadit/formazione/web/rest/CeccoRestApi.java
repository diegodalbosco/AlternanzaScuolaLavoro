/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.web.rest;



import com.cadit.formazione.api.sarte.Albero;
import com.cadit.formazione.api.sarte.Fiore;
import com.cadit.formazione.api.sarte.Giardino;
import java.util.ArrayList;

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
public class CeccoRestApi {
    @Path("/cecco")
public class SarteRestApi {

    @POST
    @Path("newGiardino")
    @Produces(MediaType.APPLICATION_JSON)
    public Giardino createGiardino(
            @FormParam("petaliFiore") ArrayList<Integer> listaFiori, 
            @FormParam("ramiAlbero") ArrayList<Integer> listaAlberi
    )throws NamingException {
        
        Giardino giardino = new Giardino();
        for (Integer i: listaFiori){
            giardino.addFiore(new Fiore(i));
        }
        for (Integer i: listaAlberi){
            giardino.addAlbero(new Albero(i));
        }
        return giardino;
    }
    
    
}

}
