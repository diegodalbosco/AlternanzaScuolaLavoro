package com.cadit.formazione.web.rest;

import com.cadit.formazione.api.sarte.Albero;
import com.cadit.formazione.api.sarte.Fiore;
import com.cadit.formazione.api.sarte.Giardino;
import com.cadit.formazione.api.sarte.SarteApi;
import java.util.List;
import javax.naming.InitialContext;

import javax.naming.NamingException;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;

@Path("/sarte")
public class SarteRestApi {
    
    
    private final SarteApi _sarteApi;
    public SarteRestApi() throws NamingException{
        InitialContext ic = new InitialContext();
        _sarteApi = (SarteApi) ic.lookup("java:global/esperimento01-ear/esperimento01-service-1.0-SNAPSHOT/SarteService!com.cadit.formazione.api.SarteApi");
    }
    
    

    @POST
    @Path("newGiardino")
    @Produces(MediaType.APPLICATION_JSON)
    public Giardino createGiardino(
            @FormParam("petaliFiore") List<Integer> listaNumeroPetali, 
            @FormParam("ramiAlbero") List<Integer> listaNumeroAlberi,
            @FormParam("diametroTronco") List<Integer> listaDiametroTronco
    )throws NamingException {
        
        if (listaDiametroTronco.size() != listaNumeroAlberi.size()) {
            throw new IllegalArgumentException("Le lista per gli alberi non coincidono");
        }
        
        Giardino giardino = new Giardino();
        for (Integer i: listaNumeroPetali){
            giardino.addFiore(new Fiore(i));
        }
        for (int i=0; i < listaNumeroAlberi.size(); i++){
            giardino.addAlbero(new Albero(listaNumeroAlberi.get(i), listaDiametroTronco.get(i)));
        }
        return giardino;
    }
    
    
}
