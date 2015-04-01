package com.cadit.formazione.api.teg;

/**
 *
 * @author bellentani
 */
public class Alunno {
    
    private String _nome;
    private String _cognome;
    private Classe _classe;
    
    public Alunno() {
        
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

    public Classe getClasse() {
        return _classe;
    }

    public void setClasse(Classe _classe) {
        this._classe = _classe;
    }
    
}
