/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.persistence.fregnan;

import com.cadit.formazione.persistence.entities.ElementEntity;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author fregnan
 */
@Entity
@Table(name = "FREGNAN_ENTITY")
public class FregnanEntity implements Serializable {
    
    private Integer _id;
    private Integer _anno;
    private Integer _mese;
    private Integer _giorno;
    private Set<ElementEntity> _elements;
    
    public FregnanEntity() {
        
    }

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FREGNAN_ENTITIES_SEQ")
    @SequenceGenerator(name="FREGNAN_ENTITIES_SEQ", sequenceName="FREGNAN_ENTITIES_SEQ", allocationSize=100)
    public Integer getId() {
        return _id;
    }

    public void setId(Integer id) {
        this._id = id;
    }

    public Integer getAnno() {
        return _anno;
    }

    public void setAnno(Integer _anno) {
        this._anno = _anno;
    }

    public Integer getMese() {
        return _mese;
    }

    public void setMese(Integer _mese) {
        this._mese = _mese;
    }

    public Integer getGiorno() {
        return _giorno;
    }

    public void setGiorno(Integer _giorno) {
        this._giorno = _giorno;
    }
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="OWNER_ID", referencedColumnName="ID")
    public Set<ElementEntity> getElements() {
        return _elements;
    }

    public void setElements(Set<ElementEntity> _elements) {
        this._elements = _elements;
    }
    
}
