package com.cadit.formazione.persistence.francesco.entities;

import javax.persistence.*;
import java.io.*;

@Entity
@Table(name = "FRANCESCO_ENTITIES")
public class FrancescoEntity implements Serializable{
    
    private Integer _id;
    private String _nome;
    private String _cognome;
    
    public FrancescoEntity() {
        
    }

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FRANCESCO_ENTITIES_SEQ")
    @SequenceGenerator(name="FRANCESCO_ENTITIES_SEQ", sequenceName="FRANCESCO_ENTITIES_SEQ", allocationSize=100)
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
    
}
