/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.persistence.cecco;

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
 * @author cecco
 */

    



import javax.persistence.*;
import java.io.*;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "DATA_ENTITIES_CECCO")

public class DataEntityCecco implements Serializable{
     private Integer _id;
    private String _nome;
    private String _cognome;
    private Set<ElementEntityCecco> _elements;
    
    public DataEntityCecco() {
        
    }

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DATA_ENTITIES_CECCO_SEQ")
    @SequenceGenerator(name="DATA_ENTITIES_CECCO_SEQ", sequenceName="DATA_ENTITIES_CECCO_SEQ", allocationSize=100)
    public Integer getId() {
        return _id;
    }

    public void setId(Integer id) {
        this._id = id;
    }

    public String getCognome() {
        return _cognome;
    }

    public void setCognome(String lingua) {
        this._cognome = lingua;
    }

    public String getNome() {
        return _nome;
    }

    public void setNome(String nome) {
        this._nome = nome;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="OWNER_ID", referencedColumnName="ID")
    public Set<ElementEntityCecco> getElements() {
        return _elements;
    }

    public void setElements(Set<ElementEntityCecco> _elements) {
        this._elements = _elements;
    }
    
}
