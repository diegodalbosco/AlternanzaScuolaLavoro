/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.persistence.piacentini;

/**
 *
 * @author piacentinie
 */
import com.cadit.formazione.persistence.entities.ElementEntity;
import javax.persistence.*;
import java.io.*;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "PIACENTINI_ENTITIES")
public class PiacentiniEntity{
    
    private Integer _nCivico;
    private String _via;
    
    public PiacentiniEntity() {
        
    }

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PIACENTINI_ENTITIES_SEQ")
    @SequenceGenerator(name="PIACENTINI_ENTITIES_SEQ", sequenceName="PIACENTINI_ENTITIES_SEQ", allocationSize=100)
    
    public Integer getnCivico() {
        return _nCivico;
    }

    public String getVia() {
        return _via;
    }

    public void setNCivico(Integer _nCivico) {
        this._nCivico = _nCivico;
    }

    public void setVia(String _via) {
        this._via = _via;
    }
}
