
package com.cadit.formazione.persistence.zeg;

import com.cadit.formazione.persistence.entities.DataEntity;
import com.cadit.formazione.persistence.entities.ElementEntity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author zeggiotti
 */
@Stateless
@LocalBean
public class ZegPersistence {
    
    @PersistenceContext(unitName = "service-persistence")
    private EntityManager _em;
    
    public List<ZegEntity> getDataEntities() {
        List<ZegEntity> resultList = _em.createQuery("select de from ZegEntity de", ZegEntity.class).getResultList();
        return resultList;
    }
    
    public void addDataEntity(double re, double im) {
        ZegEntity entity = new ZegEntity();
        entity.setRe(re);
        entity.setIm(im);
        _em.persist(entity);
    }
}
