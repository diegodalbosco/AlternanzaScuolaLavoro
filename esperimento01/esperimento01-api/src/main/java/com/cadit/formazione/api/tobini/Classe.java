package com.cadit.formazione.api.tobini;

import java.util.List;

public class Classe {

    private List<Studente> _componenti;
    private String _sezione;

    public String getStudenti() {
        return _componenti.toString();
    }

    public void aggiungiStudenti(List<Studente> nuovi) {
        _componenti.add((Studente) nuovi);
    }

    public Classe(String nome) {
        this._sezione = nome;
    }

}
