package com.cadit.formazione.persistence.francesco;

import com.cadit.formazione.persistence.francesco.entities.FrancescoEntity;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
@LocalBean
public class FrancescoPersistence {

    @PersistenceContext(unitName = "service-persistence")
    private EntityManager _em;
    
    public List<FrancescoEntity> getFrancescoEntities() {
        List<FrancescoEntity> resultList = _em.createQuery("select fe from FrancescoEntity fe", FrancescoEntity.class).getResultList();
        return resultList;
    }

    public void addFrancescoEntity(String nome, String cognome) {
        FrancescoEntity entity = new FrancescoEntity();
        entity.setNome(nome);
        entity.setCognome(cognome);
        _em.persist(entity);
    }
    
}
