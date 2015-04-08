/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andar
 */
package com.cadit.formazione.persistence.eduardentities;

import com.cadit.formazione.persistence.eduardentities.EdElementEntity;
import javax.persistence.*;
import java.io.*;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "DATA_ENTITIES")
public class EduardEntity implements Serializable{
    
    private Integer _id;
    private String _name;
    private String _age;
    private String _surname;
    private Set<EdElementEntity> _edElements;
    
    public EduardEntity() {
        
    }

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DATA_ENTITIES_SEQ")
    @SequenceGenerator(name="DATA_ENTITIES_SEQ", sequenceName="DATA_ENTITIES_SEQ", allocationSize=100)
    public Integer getId() {
        return _id;
    }

    public void setId(Integer _id) {
        this._id = _id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public String getAge() {
        return _age;
    }

    public void setAge(String _age) {
        this._age = _age;
    }

    public String getSurname() {
        return _surname;
    }

    public void setSurname(String _surname) {
        this._surname = _surname;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="OWNER_ID", referencedColumnName="ID")
    public Set<EdElementEntity> getElements() {
        return _edElements;
    }
    
    public void setElements(Set<EdElementEntity> _elements) {
        this._edElements = _elements;
    }
    
}

