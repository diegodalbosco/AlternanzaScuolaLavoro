/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.api.Cecco;

import java.util.List;

/**
 *
 * @author cecco
 */
public class Utente {
    private String _nome;
    private String _cognome;
    
    public Utente(String n,String c){
        
    }

    public Utente(List<String> n, List<String> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        return _nome;
    }

    public String getCognome() {
        return _cognome;
    }

    public void setNome(String _nome) {
        this._nome = _nome;
    }

    public void setCognome(String _cognome) {
        this._cognome = _cognome;
    }
    
    
}
