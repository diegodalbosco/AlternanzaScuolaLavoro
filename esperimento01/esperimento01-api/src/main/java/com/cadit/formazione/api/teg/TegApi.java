package com.cadit.formazione.api.teg;

import java.util.List;

/**
 *
 * @author bellentani
 */
public interface TegApi {
    
    public void addAlunno(String nome, String cognome, String sezione, Integer anno);
    
    public List<Classe> getClassi(String materia);

    public void createClasse(Classe classe, List<String> materie);
    
}
