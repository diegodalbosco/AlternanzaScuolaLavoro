/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.api.Piacentini;

/**
 *
 * @author piacentinie
 */
class Alunno {
    private final String _nome;
    private final String _cognome;

    public Alunno(String _nome, String _cognome) {
        this._nome = _nome;
        this._cognome = _cognome;
    }

    public String getNome() {
        return _nome;
    }

    public String getCognome() {
        return _cognome;
    }
    
    
}
