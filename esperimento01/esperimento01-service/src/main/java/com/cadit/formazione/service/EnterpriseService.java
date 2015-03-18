package com.cadit.formazione.service;

import com.cadit.formazione.persistence.ServicePersistence;
import com.cadit.formazione.persistence.entities.DataEntity;
import com.cadit.formazione.api.data.DataObject;
import com.cadit.formazione.api.ServiceApi;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class EnterpriseService implements ServiceApi {

    @EJB
    private ServicePersistence _persistence;
    
    @Override
    public List<DataObject> getDataObjects() {
        List<DataObject> res = new ArrayList<>();
        List<DataEntity> entities = _persistence.getDataEntities();
        for (DataEntity entity : entities) {
            DataObject dataObject = new DataObject();
            dataObject.setId(entity.getId());
            dataObject.setNome(entity.getNome());
            res.add(dataObject);
        }
        return res;
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
