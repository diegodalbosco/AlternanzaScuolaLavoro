package com.cadit.formazione.persistence.jap;

import com.cadit.formazione.persistence.entities.DataEntity;
import com.cadit.formazione.persistence.entities.ElementEntity;
import com.cadit.formazione.persistence.entities.jap.JapDataEntity;
import com.cadit.formazione.persistence.entities.jap.JapElementEntity;
import java.util.HashSet;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Set;

@Stateless
@LocalBean
public class Japersistence {

    @PersistenceContext(unitName = "service-persistence")
    private EntityManager _em;
    
    public List<JapDataEntity> getDataEntities() {
        List<JapDataEntity> resultList = _em.createQuery("select de from JapDataEntity de", JapDataEntity.class).getResultList();
        return resultList;
    }

    public void addJapDataEntity(String nome, String paese) {
        JapDataEntity entity = new JapDataEntity();
        entity.setNome(nome);
        entity.setPaese(paese);
        Set<JapElementEntity> elementi = new HashSet<JapElementEntity>();
        JapElementEntity e1 = new JapElementEntity();
        e1.setNome("Japneet");
        e1.setCognome("Singh");
        //_em.persist(e1);
        elementi.add(e1);
        entity.setElements(elementi);
        _em.persist(entity);
    }
    
}
