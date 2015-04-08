/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.persistence.eduardentities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author andar
 */
@Entity
@Table(name = "DATA_ELEMENT")
public class EdElementEntity {
    
    private Integer _id;
    private String _nome;
    private String _cognome;
    private String _età;
    //private DataEntity _data;
    
    public EdElementEntity() {
        
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

    public String getNome() {
        return _nome;
    }

    public void setNome(String _nome) {
        this._nome = _nome;
    }

    public String getCognome() {
        return _cognome;
    }

    public void setCognome(String _cognome) {
        this._cognome = _cognome;
    }

    public String getEtà() {
        return _età;
    }

    public void setEtà(String _età) {
        this._età = _età;
    }

}
