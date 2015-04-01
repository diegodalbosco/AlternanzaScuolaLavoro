package com.cadit.formazione.web.rest;


import com.cadit.formazione.api.zeg.Complex;
import com.cadit.formazione.web.rest.render.Renderer;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.QueryParam;
/**
 * 
 * @author zeggiotti
 */
@Path("/zeg")
public class ZegRestApi {
    
    private final ZegRestApi _zegRestApi;
    
    public ZegRestApi() throws NamingException {
        InitialContext ic = new InitialContext();
        _zegRestApi = (ZegRestApi) ic.lookup("java:global/esperimento01-ear/esperimento01-service-1.0-SNAPSHOT/EnterpriseService!com.cadit.formazione.api.ZegRestApi");
    }
   
    @GET
    @Path("service")
    @Produces(MediaType.APPLICATION_JSON)
    public String getDataObjects() throws NamingException {

        String dataObjects = _zegRestApi.getDataObjects();
        return Renderer.getJson(dataObjects);
    }
    
    @GET
    @Path("add")
    public void addDataObject(
            @QueryParam("nome") String nome,
            @QueryParam("lingua") String lingua) throws NamingException {
        
        _zegRestApi.addDataObject(nome, lingua);
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
