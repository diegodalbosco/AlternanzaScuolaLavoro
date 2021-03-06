package com.cadit.formazione.service;

import com.cadit.formazione.persistence.ServicePersistence;
import com.cadit.formazione.persistence.entities.DataEntity;
import com.cadit.formazione.api.data.DataObject;
import com.cadit.formazione.api.ServiceApi;
import com.cadit.formazione.persistence.entities.ElementEntity;
import com.cadit.formazione.persistence.entities.jap.JapDataEntity;
import com.cadit.formazione.persistence.entities.jap.JapElementEntity;
import com.cadit.formazione.persistence.jap.Japersistence;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class JapEnterpriseService implements ServiceApi {
    
    /**
     * Returns my name
     * @return my name
     */
    @Override
    public String getName() {
        return "Versione 1.1";
    }
    
    @EJB
    private Japersistence _persistence;
    
    @Override
    public List<DataObject> getDataObjects() {
        List<DataObject> res = new ArrayList<>();
        List<JapDataEntity> entities = _persistence.getDataEntities();
        for (JapDataEntity entity : entities) {
            DataObject dataObject = new DataObject();
            dataObject.setId(entity.getId());
            dataObject.setNome(entity.getNome());
            dataObject.setLingua(entity.getPaese());
            Set<String> nomi = new HashSet<String>();
            for (JapElementEntity e : entity.getElements()) {
                String nome = e.getNome() + " " + e.getCognome();
                nomi.add(nome);
            }
            dataObject.setNomi(nomi);
            res.add(dataObject);
        }
        return res;
    }

    @Override
    public void addDataObject(String nome, String lingua) {
        _persistence.addJapDataEntity(nome, lingua);
    }


}
