/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.api.eduard;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author andar
 */
public class Answer {
    
    private List<Elemento> _persone;
    
    public Answer(){
        _persone=new LinkedList<Elemento>();
    }

    public List<Elemento> getPersone() {
        return _persone;
    }
    
}
