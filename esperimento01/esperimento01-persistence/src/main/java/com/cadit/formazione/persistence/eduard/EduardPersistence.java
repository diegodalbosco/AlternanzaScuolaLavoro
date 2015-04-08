/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.persistence.eduard;


import com.cadit.formazione.persistence.eduardentities.EduardEntity;
import com.cadit.formazione.persistence.eduardentities.EdElementEntity;
import java.util.HashSet;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Set;
/**
 *
 * @author andar
 */

@Stateless
@LocalBean
public class EduardPersistence {

    @PersistenceContext(unitName = "service-persistence")
    private EntityManager _em;
    
    public List<EduardEntity> getDataEntities() {
        List<EduardEntity> resultList = _em.createQuery("select de from EduardEntity de", EduardEntity.class).getResultList();
        return resultList;
    }

    public void addEduardEntity(String nome, String surname, String age) {
        EduardEntity entity = new EduardEntity();
        entity.setName(nome);
        entity.setSurname(surname);
        entity.setAge(age);
        Set<EdElementEntity> elementi = new HashSet<EdElementEntity>();
        EdElementEntity e1 = new EdElementEntity();
        e1.setNome("nome");
        e1.setCognome("cognome");
        e1.setEtà("età");
        //_em.persist(e1);
        elementi.add(e1);
        entity.setElements(elementi);
        _em.persist(entity);
    }
    
}


