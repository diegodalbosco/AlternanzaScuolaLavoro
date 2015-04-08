/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.api.eduard;

import java.util.Set;

/**
 *
 * @author andar
 */
public class Elemento {
    private Integer _id;
    public String _name;
    public String _surname;
    public String _age;
    private Set<String> _nomi;
    
    public Elemento(String name, String surname, String age){
        _name=name;
        _surname=surname;
        _age=age;
    }
    
     public Elemento(){
       
    }

    public Integer getId() {
        return _id;
    }

    public void setId(Integer _id) {
        this._id = _id;
    }
    
    public String getName(){
        return _name;
    }
    
    public String getSurname(){
        return _surname;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public void setSurname(String _surname) {
        this._surname = _surname;
    }

    public void setAge(String _age) {
        this._age = _age;
    }
    
    public String getAge(){
        return _age;
    }

    public Set<String> getNomi() {
        return _nomi;
    }

    public void setNomi(Set<String> _nomi) {
        this._nomi = _nomi;
    }
        
}
