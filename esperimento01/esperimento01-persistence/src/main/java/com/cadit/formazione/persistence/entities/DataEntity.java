package com.cadit.formazione.persistence.entities;

import javax.persistence.*;
import java.io.*;

@Entity
@Table(name = "DATA_ENTITIES")
public class DataEntity implements Serializable{
    
    private Integer _id;
    private String _lingua;
    private String _nome;
    
    public DataEntity() {
        
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

    public String getLingua() {
        return _lingua;
    }

    public void setLingua(String lingua) {
        this._lingua = lingua;
    }

    public String getNome() {
        return _nome;
    }

    public void setNome(String nome) {
        this._nome = nome;
    }
    
    
}
