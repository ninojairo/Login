/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itfactoria.login.web.struts;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author jaironino
 */
public class LoginAction extends ActionSupport{
    private String usuario;
    private String password;
    
    @Override
    public String execute(){
        return "SUCCESS";
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
}