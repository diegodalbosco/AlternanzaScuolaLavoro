/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.dalbosco;

import com.cadit.formazione.persistence.entities.DataEntity;
import com.cadit.formazione.persistence.entities.ElementEntity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@LocalBean
/**
 *
 * @author dalbosco
 */
public class DalboPersistence {
    
    @PersistenceContext(unitName = "service-persistence")
    private EntityManager _em;
    
    public List<DataEntity> getDataEntities() {
        List<DataEntity> resultList = _em.createQuery("select de from DataEntity de", DataEntity.class).getResultList();
        return resultList;
    }

    public void addDalbo(String nome, String versione) {
        PackEntity entity = new PackEntity();
        entity.setName("pacchettoMio");
        HashSet<DalboEntity> elementi = new HashSet<DalboEntity>();
        DalboEntity e1 = new DalboEntity();
        e1.setName(nome);
        e1.setVersion(versione);
        //_em.persist(e1);
        elementi.add(e1);
        entity.setDalbos(elementi);
        _em.persist(entity);
    }
}
