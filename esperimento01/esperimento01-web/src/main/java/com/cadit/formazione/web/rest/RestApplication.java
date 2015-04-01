package com.cadit.formazione.web.rest;

import javax.ws.rs.core.Application;
import java.util.Set;

@javax.ws.rs.ApplicationPath("rest")
public class RestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
<<<<<<< HEAD
        resources.add(com.cadit.formazione.web.rest.PiacentiniApi.class);
=======
        resources.add(com.cadit.formazione.web.rest.DalBoscoRestApi.class);
>>>>>>> 398cdc7db4647e51b6e856a65b06e27a962ff84b
        resources.add(com.cadit.formazione.web.rest.RestApi.class);
        resources.add(com.cadit.formazione.web.rest.TegRestApi.class);
    }

}
