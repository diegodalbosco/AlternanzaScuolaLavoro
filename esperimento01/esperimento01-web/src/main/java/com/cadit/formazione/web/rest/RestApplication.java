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
        resources.add(com.cadit.formazione.web.rest.CeccoRestApi.class);
        resources.add(com.cadit.formazione.web.rest.DalBoscoRestApi.class);
        resources.add(com.cadit.formazione.web.rest.EduardRestApi.class);
        resources.add(com.cadit.formazione.web.rest.FrancescoRestApi.class);
        resources.add(com.cadit.formazione.web.rest.PiacentiniApi.class);
        resources.add(com.cadit.formazione.web.rest.RestApi.class);
        resources.add(com.cadit.formazione.web.rest.SarteRestApi.class);
        resources.add(com.cadit.formazione.web.rest.SebaRestApi.class);
        resources.add(com.cadit.formazione.web.rest.SinghRestApi.class);
        resources.add(com.cadit.formazione.web.rest.TegRestApi.class);
        resources.add(com.cadit.formazione.web.rest.TobiniRestApi.class);
        resources.add(com.cadit.formazione.web.rest.ZegRestApi.class);
    }

}
