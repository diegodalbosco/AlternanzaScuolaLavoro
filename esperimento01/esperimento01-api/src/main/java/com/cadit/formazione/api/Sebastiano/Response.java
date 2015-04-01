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
public class Response {
    
    private String _title;
    private Integer _id;
    private String _mainText;
    
    public Response() {
        
        this._title = "no title";
        this._id = 0;
        this._mainText = "no mainText";
    
    }

    public Response(String title, Integer id, String mainText) {
        
        this._title = title;
        this._id = id;
        this._mainText = mainText;
    }

    
    
    public String getTitle() {
        return _title;
    }

    public void setTitle(String _title) {
        this._title = _title;
    }

    public Integer getId() {
        return _id;
    }

    public void setId(Integer _id) {
        this._id = _id;
    }

    public String getMainText() {
        return _mainText;
    }

    public void setMainText(String _mainText) {
        this._mainText = _mainText;
    }
    
    
    
    
}
