
package com.cadit.formazione.api.dalbosco;

public class Risposta {
    private final Domanda _domanda;
    
    public Risposta(Domanda domanda) {
        _domanda = domanda;
    }
    
    public String getRisposta() {
        return "Risposta: "+ _domanda;
    }
}
