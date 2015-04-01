/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.api.Sebastiano;

/**
 *
 * @author fregnan
 */
public interface SebaApi {
    
    public Response getResponse(Request richiesta);
    
    public Request createRequest(String title, String mainText);
    
}
