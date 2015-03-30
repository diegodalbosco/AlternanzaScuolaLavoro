/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.api.Piacentini;

/**
 *
 * @author piacentinie
 */
public class Classe {
    
    private String _sezione;
    private Integer _anno;
    public Classe (String sezione, Integer anno){
        _sezione=sezione;
        _anno=anno;
    } 

    public String getSezione() {
        return _sezione;
    }

    public Integer getAnno() {
        return _anno;
    }

    public void setSezione(String _sezione) {
        this._sezione = _sezione;
    }

    public void setAnno(Integer _anno) {
        this._anno = _anno;
    }
    
}
