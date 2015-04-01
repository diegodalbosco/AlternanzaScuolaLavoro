/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.api.sarte;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Root
 */
public class Giardino {
    
    private final List<Fiore> _listaFiori;
    private final List<Albero> _listaAlberi;
    
    public Giardino(){
        _listaFiori = new ArrayList();
        _listaAlberi = new ArrayList();
    }
    
    public boolean addFiore(Fiore fiore){
        return _listaFiori.add(fiore);
    }
    public boolean addAlbero(Albero albero){
        return _listaAlberi.add(albero);
    }
    
    public void removeFiore(int indice){
        _listaFiori.remove(indice);
    }
    public void removeAlbero(int indice){
        _listaAlberi.remove(indice);
    }

    public List<Fiore> getListaFiori() {
        return _listaFiori;
    }

    public List<Albero> getListaAlberi() {
        return _listaAlberi;
    }

    @Override
    public String toString() {
        return "Giardino{" + "_listaFiori=" + _listaFiori + ", _listaAlberi=" + _listaAlberi + '}';
    }
  
}
