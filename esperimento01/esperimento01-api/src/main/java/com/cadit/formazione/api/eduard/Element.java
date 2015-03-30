/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.api.eduard;

/**
 *
 * @author andar
 */
public class Element {
    public String _name;
    public String _surname;
    public String _age;
    
    
    public Element(String name, String surname, String age){
        _name=name;
        _surname=surname;
        _age=age;
    }
    
     public Element(){
       
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
    
}
