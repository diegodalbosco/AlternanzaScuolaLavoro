/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.api.sarte;

import java.util.List;

/**
 *
 * @author Root
 */
public interface SarteApi {
    public List<Fiore> getFiori(int i);
    public List<Albero> getAlberi(int i);
}
