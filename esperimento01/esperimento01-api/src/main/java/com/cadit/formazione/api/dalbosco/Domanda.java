/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.api.dalbosco;

public class Domanda {
    private final int _numero;
    private final String _domanda;
    
    public Domanda(int numero, String domanda) {
        _domanda = domanda;
        _numero = numero;
    }
}
