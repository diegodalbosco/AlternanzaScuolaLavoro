/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.api.Cecco;

/**
 *
 * @author Root
 */
public interface CeccoApi {
    public String getRisp(String Domanda);
    public Albero getAlbero(Giardino giardino, int indice);
    public ColoreFiore getColoreFiore(Fiore fiore);
}