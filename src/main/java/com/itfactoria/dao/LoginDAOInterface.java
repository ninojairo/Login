/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itfactoria.dao;

import com.itfactoria.dto.UsuarioDTO;

/**
 *
 * @author JairoNino
 */
public interface LoginDAOInterface {
    
    public UsuarioDTO obtenerUsuario(UsuarioDTO usuarioDTO);
    
}
