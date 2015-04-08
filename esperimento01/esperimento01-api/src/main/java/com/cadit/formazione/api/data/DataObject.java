package com.cadit.formazione.api.data;

import java.io.Serializable;
import java.util.Set;

public class DataObject implements Serializable {
    
    private Integer _id;
    private String _nome;
    private String _lingua;
    private Set<String> _nomi;
    
    public DataObject() {
        
    }

    public Integer getId() {
        return _id;
    }

    public void setId(Integer id) {
        this._id = id;
    }

    public String getNome() {
        return _nome;
    }

    public void setNome(String nome) {
        this._nome = nome;
    }

    public String getLingua() {
        return _lingua;
    }

    public void setLingua(String _lingua) {
        this._lingua = _lingua;
    }

    public Set<String> getNomi() {
        return _nomi;
    }

    public void setNomi(Set<String> _nomi) {
        this._nomi = _nomi;
    }
    
}
