package com.cadit.formazione.api.data;

import java.io.Serializable;

public class DataObject implements Serializable {
    
    private Integer _id;
    private String _nome;
    
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
    
}
