/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itfactoria.login.web.struts;
import com.itfactoria.dao.LoginDAO;
import com.itfactoria.dto.UsuarioDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author jaironino
 */
public class LoginAction extends ActionSupport{
    private UsuarioDTO usuarioDTO;
    private String usuario;
    private String password;
    private String nombre;
    private String email;
    
    
    
    
    @Override
    public String execute(){
        
        System.out.println("*******************************usuario:" +this.usuario);
        System.out.println("*******************************password:" +this.password);
        
        
        usuarioDTO = new UsuarioDTO();
        System.out.println("Usuario DTO creado");
        
        usuarioDTO.setUsuario(this.usuario);
        usuarioDTO.setPassword(this.password);
        usuarioDTO.setName(this.nombre);
        usuarioDTO.setEmail(this.email);
        
        System.out.println("Usuario DTO lleno");
        
        
        LoginDAO loginDAO = new LoginDAO();
        
        if (loginDAO.select(usuarioDTO)){
            return "SUCCESS";
        }
        else{
            return "FAILED";
        }
        
        
        
        
        
        /*if (this.usuario.equals(this.password)){
            return "SUCCESS";
        }
        else{
            return "FAILED";
        }*/
        
        
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
