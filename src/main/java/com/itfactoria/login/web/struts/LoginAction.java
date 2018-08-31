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
public class LoginAction extends ActionSupport {

    private UsuarioDTO usuarioDTO;

    public UsuarioDTO getUsuarioDTO() {
        return usuarioDTO;
    }

    public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
        this.usuarioDTO = usuarioDTO;
    }
    
    @Override
    public String execute() {

        System.out.println("************************************Exceute");
        
        LoginDAO loginDAO = new LoginDAO();

        if (loginDAO.select(usuarioDTO)) {
            return SUCCESS+"Tiles";
        } else {
            return ERROR;
        }

    }

    
    @Override
    public void validate() {
        
        
        if(usuarioDTO.getUsuario().length()==0){
            addFieldError("usuarioDTO.usuario", "El usuario  es requerido");
        }
        
        if(usuarioDTO.getPassword().length()==0){
            addFieldError("usuarioDTO.password", "El password es requerido");
        }
        
        System.out.println("Continua el flujo");
    }
    
    

}
