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
    
    
    @Override
    public String execute(){
        
        System.out.println("*******************************usuario:" +this.usuario );
        
        
        usuarioDTO = new UsuarioDTO();
        System.out.println("Usuario DTO creado");
        LoginDAO loginDAO = new LoginDAO();
        loginDAO.Select();
        
        
        return "SUCCESS";
        
        /*if (this.usuario.equals(this.password)){
            return "SUCCESS";
        }
        else{
            return "FAILED";
        }*/
        
    }

    
    
    
    
}
