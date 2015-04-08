package com.cadit.formazione.service.zeg;

import com.cadit.formazione.api.zeg.ZegApi;
import com.cadit.formazione.persistence.ServicePersistence;
import com.cadit.formazione.persistence.zeg.ZegEntity;
import com.cadit.formazione.persistence.zeg.ZegPersistence;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author zeggiotti
 */
@Stateless
public class ZegService implements ZegApi {

    
    @EJB
    private ZegPersistence _persistence;
    
    @Override
    public void createComplex(double re1, double im1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addComplex(double re, double im) {
        _persistence.addDataEntity(re, im);
    }
    
    @Override
    public List<ZegEntity> getComplex(){
        return _persistence.getDataEntities();
    }
    
}
