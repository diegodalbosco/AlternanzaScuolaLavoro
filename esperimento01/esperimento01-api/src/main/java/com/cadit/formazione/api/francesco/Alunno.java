/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.api.francesco;

/**
 *
 * @author martinif
 */
public class Alunno {
    private String _nome;
    private String _cognome;

    
    
    public Alunno(String nome, String cognome){
        _nome=nome;
        _cognome=cognome;      
    }

    public Alunno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getNome() {
        return _nome;
    }

    public String getCognome() {
        return _cognome;
    }
    
    public String setNome(String nome) {
        _nome = nome;
        return "ok";
    }

    public String setCognome(String cognome) {
        _cognome = cognome;
        return "ok";
    }
}
