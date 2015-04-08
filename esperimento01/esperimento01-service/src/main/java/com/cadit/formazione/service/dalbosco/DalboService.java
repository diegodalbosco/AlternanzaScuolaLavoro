package com.cadit.formazione.service.dalbosco;

import com.cadit.formazione.api.dalbosco.DalBoscoApi;
import com.cadit.formazione.dalbosco.DalboPersistence;
import com.cadit.formazione.persistence.ServicePersistence;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class DalboService implements DalBoscoApi {
    @EJB
    private DalboPersistence _persistence;


    @Override
    public String addDalbo(String nome, String versione) {
        _persistence.addDalbo(nome, versione);
        return "ok.";
    }
}
