package com.cadit.formazione.web.rest;

import com.cadit.formazione.api.dalbosco.DalBoscoApi;
import com.cadit.formazione.api.dalbosco.Domanda;
import com.cadit.formazione.api.dalbosco.Risposta;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.QueryParam;

@Path("/dalbosco")
public class DalBoscoRestApi {

    private final DalBoscoApi _dalBoscoeApi;
    
    public DalBoscoRestApi() throws NamingException {
        InitialContext ic = new InitialContext();
        _dalBoscoeApi = (DalBoscoApi) ic.lookup("java:global/esperimento01-ear/esperimento01-service-1.0-SNAPSHOT/DalboService!com.cadit.formazione.api.dalbosco.DalBoscoApi");
    }
    
    @GET
    @Path("saluta")
    public String saluta(@QueryParam("persona") String persona) {
        //return _dalBoscoeApi.saluta(persona);
        return "ciao";
    }
    
    @GET
    @Path("domanda")
    @Produces(MediaType.APPLICATION_JSON)
    public String getRisposta(@QueryParam("q") String domanda) throws NamingException{
        Risposta risposta = new Risposta(new Domanda(domanda));
        return risposta.getRisposta();
        
    }
    
    @GET
    @Path("add")
    public String addDalbo(@QueryParam("nome") String nome, @QueryParam("versione") String versione) {
        _dalBoscoeApi.addDalbo(nome, versione);
        return "ok.";
    }
    
}
