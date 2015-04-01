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
public interface SarteApi {
    public Fiore getFiore(Giardino giardino, int indice);
    public Albero getAlbero(Giardino giardino, int indice);
    public ColoreFiore getColoreFiore(Fiore fiore);
}
