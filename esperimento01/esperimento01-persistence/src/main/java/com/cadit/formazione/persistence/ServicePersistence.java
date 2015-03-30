package com.cadit.formazione.persistence;

import com.cadit.formazione.persistence.entities.DataEntity;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

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
        _em.persist(entity);
    }
    
}
