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
public class Squadra {
    private List<Utente> _componenti;
    
    public Squadra (List<Utente> c){
        _componenti=c;
    }
    
    public void addUtente(Utente b){
        _componenti.add(b);
    }

    public List<Utente> getComponenti() {
        return _componenti;
    }

    public void setComponenti(List<Utente> _componenti) {
        this._componenti = _componenti;
    }
    
    public String controlloU (Utente b){
        String ris="";
        for (Utente l : _componenti){
            if(b.getNome().equals(l.getNome())){
                ris="la persona " + b.getNome() +" "+ b.getCognome() + " fà parte della squadra!!";
            }
        }
        return ris;
    }
    
}
