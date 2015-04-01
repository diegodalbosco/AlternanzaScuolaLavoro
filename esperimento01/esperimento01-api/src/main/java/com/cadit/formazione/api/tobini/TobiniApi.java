package com.cadit.formazione.api.tobini;

import com.cadit.formazione.api.data.DataObject;
import java.util.List;


public interface TobiniApi {
    public String getStudenti(Classe c);
    public void insertStudenti(List<Studente> stud, Classe cla);
    public String createClasse(String sez);
}
