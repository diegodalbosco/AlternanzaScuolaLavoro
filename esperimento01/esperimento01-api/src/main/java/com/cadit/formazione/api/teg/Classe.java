package com.cadit.formazione.api.teg;

import java.util.List;

/**
 *
 * @author bellentani
 */
public class Classe {
    
    private String _sezione;
    private Integer _anno;
    private List<String> _materie;
    private List<Alunno> _alunni;
    
    public Classe() {
        
    }

    public String getSezione() {
        return _sezione;
    }

    public void setSezione(String _sezione) {
        this._sezione = _sezione;
    }

    public Integer getAnno() {
        return _anno;
    }

    public void setAnno(Integer _anno) {
        this._anno = _anno;
    }

    public List<String> getMaterie() {
        return _materie;
    }

    public void setMaterie(List<String> _materie) {
        this._materie = _materie;
    }

    public List<Alunno> getAlunni() {
        return _alunni;
    }

    public void setAlunni(List<Alunno> _alunni) {
        this._alunni = _alunni;
    }
    
}
