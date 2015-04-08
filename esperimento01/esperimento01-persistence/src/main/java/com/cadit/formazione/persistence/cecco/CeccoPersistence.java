/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.persistence.cecco;

/**
 *
 * @author cecco
 */

import com.cadit.formazione.persistence.cecco.DataEntityCecco;
import com.cadit.formazione.persistence.entities.ElementEntity;
import java.util.HashSet;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Set;

@Stateless
@LocalBean
public class CeccoPersistence {
    
    @PersistenceContext(unitName = "service-persistence")
    private EntityManager _ec;
    
    public List<DataEntityCecco> getDataEntities() {
        List<DataEntityCecco> resultList = _ec.createQuery("select de from DataEntityCecco de", DataEntityCecco.class).getResultList();
        return resultList;
    }

    public void addDataEntity(String nome, String cognome) {
        DataEntityCecco entity = new DataEntityCecco();
        entity.setNome(nome);
        entity.setCognome(cognome);
        Set<ElementEntityCecco> elementi = new HashSet<ElementEntityCecco>();
        ElementEntityCecco e1 = new ElementEntityCecco();
        e1.setNome("nome");
        e1.setCognome("cognome");
        //_em.persist(e1);
        elementi.add(e1);
        entity.setElements(elementi);
        _ec.persist(entity);
    }
    
    
}
