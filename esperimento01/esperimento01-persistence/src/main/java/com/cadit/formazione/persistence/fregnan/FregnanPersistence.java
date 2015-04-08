/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.persistence.fregnan;

import com.cadit.formazione.persistence.entities.DataEntity;
import com.cadit.formazione.persistence.entities.ElementEntity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fregnan
 */

@Stateless
@LocalBean
public class FregnanPersistence {
    
    @PersistenceContext(unitName = "service-persistence")
    private EntityManager _em;
    
    public List<FregnanEntity> getFregnanEntities() {
        List<FregnanEntity> resultList = _em.createQuery("select fe from FregnanEntity fe", FregnanEntity.class).getResultList();
        return resultList;
    }

    public void addFregnanEntity(Integer giorno, Integer mese, Integer anno) {
        FregnanEntity entity = new FregnanEntity();
        entity.setGiorno(giorno);
        entity.setMese(mese);
        entity.setAnno(anno);

        _em.persist(entity);
    }
    
}

