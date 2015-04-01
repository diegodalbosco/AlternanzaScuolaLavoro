/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadit.formazione.api.Sebastiano;

/**
 *
 * @author fregnan
 */
public class Request {
    
    private String _title;
    private String _mainText;

    public Request() {
        
        this._title = "no title";
        this._mainText = "no mainText";
    }

    public Request(String title, String mainText) {
        
        this._title = title;
        this._mainText = mainText;
    }

    
    
    public String getTitle() {
        return _title;
    }

    public void setTitle(String _title) {
        this._title = _title;
    }

    public String getMainText() {
        return _mainText;
    }

    public void setMainText(String _mainText) {
        this._mainText = _mainText;
    }
    
    
    
    
    
    
}
