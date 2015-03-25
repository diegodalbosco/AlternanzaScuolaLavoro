package com.cadit.formazione.api;

import com.cadit.formazione.api.data.DataObject;

import java.util.List;
import javax.ejb.Remote;

@Remote
public interface ServiceApi {
    
    public String getName();
    
    public List<DataObject> getDataObjects();
    
    public void addDataObject(String nome, String lingua);
    
}
