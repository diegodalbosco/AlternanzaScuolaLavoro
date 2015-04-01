/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.api.dalbosco;

import java.util.Random;
public class Domanda {
    private final int _numero;
    private final String _domanda;
    Random rnd = new Random();
    public Domanda(String domanda) {
        _domanda = domanda;
        _numero = rnd.nextInt();
    }
    public String getDomanda() {
        return _domanda;
    }
}
