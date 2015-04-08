package com.cadit.formazione.persistence.sarte;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author bellentani
 */
@Entity
public class SarteEntity implements Serializable {
    
    private Integer _id;
    private List<Integer> _listaNumeroPetali;
    private List<Integer> _listaNumeroRami;
    private List<Double> _listaDiametriTronchi;
    //private DataEntity _data;
    
    public SarteEntity() {
        
    }

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DATA_ENTITIES_SEQ")
    @SequenceGenerator(name="DATA_ENTITIES_SEQ", sequenceName="DATA_ENTITIES_SEQ", allocationSize=100)
    public Integer getId() {
        return _id;
    }

    public void setId(Integer id) {
        this._id = id;
    }

    public List<Integer> getListaNumeroPetali() {
        return _listaNumeroPetali;
    }

    public void setListaNumeroPetali(List<Integer> _listaNumeroPetali) {
        this._listaNumeroPetali = _listaNumeroPetali;
    }

    public List<Integer> getListaNumeroRami() {
        return _listaNumeroRami;
    }

    public void setListaNumeroRami(List<Integer> _listaNumeroRami) {
        this._listaNumeroRami = _listaNumeroRami;
    }

    public List<Double> getListaDiametriTronchi() {
        return _listaDiametriTronchi;
    }

    public void setListaDiametriTronchi(List<Double> _listaDiametriTronchi) {
        this._listaDiametriTronchi = _listaDiametriTronchi;
    }

    
}
