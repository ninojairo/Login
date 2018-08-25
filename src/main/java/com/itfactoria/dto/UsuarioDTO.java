/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itfactoria.dto;

/**
 *
 * @author JairoNino
 */
public class UsuarioDTO{ 
        private String nombre;
        private String email;
        private String usuario;
        private String password;

    public UsuarioDTO() {
    }
        
    
    

    public UsuarioDTO(String nombre, String email, String usuario, String password) {
        this.nombre = nombre;
        this.email = email;
        this.usuario = usuario;
        this.password = password;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String name) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
