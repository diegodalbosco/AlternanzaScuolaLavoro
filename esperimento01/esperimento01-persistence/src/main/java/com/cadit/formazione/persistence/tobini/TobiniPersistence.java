package com.cadit.formazione.persistence.tobini;
import java.util.HashSet;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Set;

@Stateless
@LocalBean
public class TobiniPersistence {

    @PersistenceContext(unitName = "service-persistence")
    private EntityManager _em;
    
    public List<ClasseEntity> getClassi() {
        List<ClasseEntity> resultList = _em.createQuery("select de from DataEntity de", ClasseEntity.class).getResultList();
        return resultList;
    }

    public void addClasse(String sezione) {
        ClasseEntity classeProva = new ClasseEntity();
        classeProva.setSezione("4Di");
        Set<ClasseEntity> insiemeClassi = new HashSet<ClasseEntity>();
        StudenteEntity studProva = new StudenteEntity();
        studProva.setNome("nome");
        studProva.setCognome("cognome");
        classeProva.add(studProva);
        insiemeClassi.add(classeProva);
        _em.persist(classeProva);
    }
    
}
