/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.api.japneet;

/**
 *
 * @author singh
 */
public class Nome {
    
    private final String _nome;


    public Nome(String nome){
    _nome=nome;
    }
    
    
    public String getNome() {
        return _nome;
    }
    
    
    public String getNome(String a){
        return a+_nome;
    }
    
}
