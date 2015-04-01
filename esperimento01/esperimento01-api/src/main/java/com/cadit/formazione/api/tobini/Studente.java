package com.cadit.formazione.api.tobini;


public class Studente {
    private String _nome;
    private String _cognome;
    private String _classe;

    public String getNome() {
        return _nome;
    }

    public void setNome(String nome) {
        this._nome = nome;
    }

    public String getCognome() {
        return _cognome;
    }

    public void setCognome(String cognome) {
        this._cognome = cognome;
    }

    public String getClasse() {
        return _classe;
    }

    public void setClasse(String classe) {
        this._classe = classe;
    }

    public Studente(String nome, String cognome, String classe) {
        this._nome = nome;
        this._cognome = cognome;
        this._classe = classe;
    }
    
}
