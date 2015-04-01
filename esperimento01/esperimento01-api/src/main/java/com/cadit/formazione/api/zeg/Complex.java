package com.cadit.formazione.api.zeg;

/**
 *
 * @author zeggiotti
 */
public class Complex {
    
    private double re,
                   im;
    
    public Complex(){
        re=0;
        im=0;
    }
    
    public Complex(double re, double im){
        this.re=re;
        this.im=im;
    }

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }
    
    
    
}
