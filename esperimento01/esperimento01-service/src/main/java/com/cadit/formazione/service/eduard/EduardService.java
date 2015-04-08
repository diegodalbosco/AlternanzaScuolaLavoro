/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.service.eduard;


import com.cadit.formazione.api.eduard.Answer;
import com.cadit.formazione.api.eduard.EduardApi;
import com.cadit.formazione.api.eduard.Elemento;
import com.cadit.formazione.api.eduard.Question;
import com.cadit.formazione.persistence.eduard.EduardPersistence;
import com.cadit.formazione.persistence.eduardentities.EdElementEntity;
import com.cadit.formazione.persistence.eduardentities.EduardEntity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author andar
 */
@Stateless
public class EduardService implements EduardApi {
    
    /**
     * Returns my name
     * @return my name
     */
    public String getName() {
        return "Versione 1.1";
    }
    
    @EJB
    private EduardPersistence _persistence;
    
    
    public List<Elemento> getE() {
        List<Elemento> res = new ArrayList<>();
        List<EduardEntity> entities = _persistence.getDataEntities();
        for (EduardEntity entity : entities) {
            Elemento oggetto = new Elemento();
            oggetto.setId(entity.getId());
            oggetto.setName(entity.getName());
            oggetto.setAge(entity.getAge());
            Set<String> nomi = new HashSet<String>();
            for (EdElementEntity e : entity.getElements()) {
                String nome = e.getNome() + " " + e.getCognome();
                nomi.add(nome);
            }
            oggetto.setNomi(nomi);
            res.add(oggetto);
        }
        return res;
    }

    public void addDataObject(String nome, String cognome, String età) {
        _persistence.addEduardEntity(nome, cognome, età);
    }

    @Override
    public Answer getAnswer(Question q) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createElement(Elemento e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
