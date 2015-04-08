/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.api.eduard;

/**
 *
 * @author andar
 */
public interface EduardApi {
    
    public Answer getAnswer(Question q);
    
    public void createElement(Elemento e);
    
}
