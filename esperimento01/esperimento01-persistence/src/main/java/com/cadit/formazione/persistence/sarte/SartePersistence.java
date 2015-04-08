package com.cadit.formazione.persistence.sarte;


import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
@LocalBean
public class SartePersistence {

    @PersistenceContext(unitName = "service-persistence")
    private EntityManager _em;
    
    public List<SarteEntity> getDataEntities() {
        List<SarteEntity> resultList = _em.createQuery("select de from SarteEntity de", SarteEntity.class).getResultList();
        return resultList;
    }

    public void addDataEntity(List<Integer> listaNumeroPetali, List<Integer> listaNumeroRami, List<Double> listaDiametriTronchi) {
        SarteEntity entity = new SarteEntity();
        entity.setListaNumeroPetali(listaNumeroPetali);
        entity.setListaNumeroRami(listaNumeroRami);
        entity.setListaDiametriTronchi(listaDiametriTronchi);
        _em.persist(entity);
    }
    
}
