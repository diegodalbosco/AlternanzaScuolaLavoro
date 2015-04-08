package com.cadit.formazione.api.zeg;

import com.cadit.formazione.persistence.zeg.ZegEntity;
import java.util.List;

/**
 *
 * @author zeggiotti
 */
public interface ZegApi {
    
    public void createComplex(double re1, double im1);
    
    public void addComplex(double re, double im);
    
    public List<ZegEntity> getComplex();
    
}
