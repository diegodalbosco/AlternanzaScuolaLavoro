/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.dalbosco;

import java.util.HashSet;
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

@Entity
@Table(name = "DALBO_PACK")
/**
 *
 * @author dalbosco
 */
public class PackEntity {
    private Set<DalboEntity> _dalbos;
    private Integer id;
    private String _name;

    public PackEntity() {
        
    }
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="PACK_ID", referencedColumnName="ID")
    public Set<DalboEntity> getDalbos() {
        return _dalbos;
    }

    public void setDalbos(Set<DalboEntity> _dalbos) {
        this._dalbos = _dalbos;
    }
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DATA_ENTITIES_SEQ")
    @SequenceGenerator(name="DATA_ENTITIES_SEQ", sequenceName="DATA_ENTITIES_SEQ", allocationSize=100)
    public Integer getId() {
        return id;
    }
   
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }
    
    
    
}
