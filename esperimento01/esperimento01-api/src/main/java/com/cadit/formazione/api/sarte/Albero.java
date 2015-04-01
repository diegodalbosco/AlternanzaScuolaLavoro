/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.api.sarte;

/**
 *
 * @author Root
 */
public class Albero {
    
    private final int _rami;
    private final double _diametroTronco;
    private static final String unitaMisura = "cm";
    
    public Albero(int rami, double diametroTronco){
        _rami = rami;
        _diametroTronco = diametroTronco;
    }
    
    public Albero(int rami){
        _rami = rami;
        _diametroTronco = 50;
    }
    
    public Albero(){
        _rami = 5;
        _diametroTronco = 50;
    }

    public int getRami() {
        return _rami;
    }

    public double getDiametroTronco() {
        return _diametroTronco;
    }

    public static String getUnitaMisura() {
        return unitaMisura;
    }
    
    
    
    
    
    
}
