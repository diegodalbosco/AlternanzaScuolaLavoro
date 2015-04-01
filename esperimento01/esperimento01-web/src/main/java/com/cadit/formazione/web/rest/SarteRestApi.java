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

@Path("/sarte")
public class SarteRestApi {
    
    /*
    private final SarteApi _sarteApi;
    public SarteRestApi(){
        InitialContext ic = new InitialContext();
        _sarteApi = (sarteApi) ic.lookup("java:global/esperimento01-ear/esperimento01-service-1.0-SNAPSHOT/EnterpriseService");
    }
    */
    

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
