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
public class Fiore {
    
    private final int _petali;
    private final ColoreFiore _coloreFiore;
    
    public Fiore(){
        _petali = 5;
        _coloreFiore = ColoreFiore.BIANCO;
    }
    
    public Fiore(int petali){
        _petali = petali;
        _coloreFiore = ColoreFiore.BIANCO;
    }
    
    public Fiore(int petali, ColoreFiore coloreFiore){
        _petali = petali;
        _coloreFiore = coloreFiore;
    }

    public int getPetali() {
        return _petali;
    }

    public ColoreFiore getColoreFiore() {
        return _coloreFiore;
    }

    @Override
    public String toString() {
        return "Fiore{" + "_petali=" + _petali + ", _coloreFiore=" + _coloreFiore.name() + '}';
    }
    
    
    
    
}
