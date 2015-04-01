package com.cadit.formazione.web.rest;

import com.cadit.formazione.api.teg.Classe;

import javax.naming.NamingException;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;

@Path("/teg")
public class TegRestApi {

    @POST
    @Path("classe")
    @Produces(MediaType.APPLICATION_JSON)
    public Classe createClasse(
            @FormParam("sezione") String sezione, 
            @FormParam("anno") Integer anno, 
            @FormParam("materie") List<String> materie
    ) throws NamingException {
        //ServiceClient client = new ServiceClient();
        
        Classe classe = new Classe();
        classe.setSezione(sezione);
        classe.setAnno(anno);
        
        //TegApi tegApi = client.getTegApi();
        //tegApi.createClasse(classe, materie);
        return classe;
    }
    
    //public void addAlunno(String nome, String cognome, String sezione, Integer anno);
    
    //public List<Classe> getClassi(String materia);
    
}
