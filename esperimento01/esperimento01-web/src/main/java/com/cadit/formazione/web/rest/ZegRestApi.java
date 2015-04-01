package com.cadit.formazione.web.rest;

import com.cadit.formazione.client.ServiceClient;
import com.cadit.formazione.api.zeg.Complex;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.QueryParam;

@Path("/zeg")
public class ZegRestApi {

    
    @GET
    @Path("add")
    public void addDataObject(
            @QueryParam("nome") String nome,
            @QueryParam("lingua") String lingua) throws NamingException {
        ServiceClient client = new ServiceClient();
        client.getServiceApi().addDataObject(nome, lingua);
    }

    @POST
    @Path("Complex")
    @Produces(MediaType.APPLICATION_JSON)
    public Complex createComplex(
            @FormParam ("re") double re1,
            @FormParam ("im") double im1) throws NamingException {
      //  ServiceClient client = new ServiceClient();
      //  client.getZegApi().createComplex(re1, im1);
        return new Complex(re1, im1);
    }


    
}