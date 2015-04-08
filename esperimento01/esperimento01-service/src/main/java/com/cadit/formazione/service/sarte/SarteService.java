package com.cadit.formazione.service.sarte;

import com.cadit.formazione.persistence.ServicePersistence;
import com.cadit.formazione.persistence.entities.DataEntity;
import com.cadit.formazione.api.data.DataObject;
import com.cadit.formazione.api.ServiceApi;
import com.cadit.formazione.api.sarte.Albero;
import com.cadit.formazione.api.sarte.ColoreFiore;
import com.cadit.formazione.api.sarte.Fiore;
import com.cadit.formazione.api.sarte.Giardino;
import com.cadit.formazione.api.sarte.SarteApi;
import com.cadit.formazione.persistence.entities.ElementEntity;
import com.cadit.formazione.persistence.sarte.SarteEntity;
import com.cadit.formazione.persistence.sarte.SartePersistence;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class SarteService implements SarteApi {
    

    @EJB
    private SartePersistence _persistence;
    
    @Override
    public List<DataObject> getDataObjects() {
        List<DataObject> res = new ArrayList<>();
        List<DataEntity> entities = _persistence.getDataEntities();
        for (DataEntity entity : entities) {
            DataObject dataObject = new DataObject();
            dataObject.setId(entity.getId());
            dataObject.setNome(entity.getNome());
            dataObject.setLingua(entity.getLingua());
            Set<String> nomi = new HashSet<String>();
            for (ElementEntity e : entity.getElements()) {
                String nome = e.getNome() + " " + e.getCognome();
                nomi.add(nome);
            }
            dataObject.setNomi(nomi);
            res.add(dataObject);
        }
        return res;
    }



    @Override
    public List<Fiore> getFiori(Giardino giardino) {
        List<Fiore> listaFiori = new ArrayList();
        List<SarteEntity> dataEntities = _persistence.getDataEntities();
        
        for (int i=0; i < dataEntities.size(); i++){
            listaFiori.add(new Fiore())
        }
        return 
    }

    @Override
    public List<Albero> getAlberi(Giardino giardino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
