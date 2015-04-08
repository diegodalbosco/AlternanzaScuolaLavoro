package com.cadit.formazione.persistence;

import com.cadit.formazione.persistence.entities.DataEntity;
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
public class ServicePersistence {

    @PersistenceContext(unitName = "service-persistence")
    private EntityManager _em;
    
    public List<DataEntity> getDataEntities() {
        List<DataEntity> resultList = _em.createQuery("select de from DataEntity de", DataEntity.class).getResultList();
        return resultList;
    }

    public void addDataEntity(String nome, String lingua) {
        DataEntity entity = new DataEntity();
        entity.setNome(nome);
        entity.setLingua(lingua);
        Set<ElementEntity> elementi = new HashSet<ElementEntity>();
        ElementEntity e1 = new ElementEntity();
        e1.setNome("nome");
        e1.setCognome("cognome");
        //_em.persist(e1);
        elementi.add(e1);
        entity.setElements(elementi);
        _em.persist(entity);
    }
    
}
