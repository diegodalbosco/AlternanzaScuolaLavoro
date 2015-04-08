/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.persistence.piacentini;

/**
 *
 * @author piacentinie
 */
import java.util.HashSet;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Set;

@Stateless
@LocalBean
public class PiacentiniPersistence {

    @PersistenceContext(unitName = "service-persistence")
    private EntityManager _em;
    
    public List<PiacentiniEntity> getDataEntities() {
        List<PiacentiniEntity> resultList = _em.createQuery("select pe from DataEntity pe", PiacentiniEntity.class).getResultList();
        return resultList;
    }

    public void addDataEntity(String via, int nCivico) {
        PiacentiniEntity entity = new PiacentiniEntity();
        entity.setVia(via);
        entity.setNCivico(nCivico);
        _em.persist(entity);
    }
    
}

