/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.api.dalbosco;

/**
 *
 * @author dalbosco
 */
public class Alunno {
    private final String _nome;
    private final String _cognome;

    public Alunno(String nome, String cognome) {
        _nome = nome;
        _cognome = cognome;
    }
    
    public String getNome() {
        return _nome;
    }

    public String getCognome() {
        return _cognome;
    }
}
