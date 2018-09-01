/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itfactoria.dao;

import com.itfactoria.config.SimpleDataSource;
import com.itfactoria.dto.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author JairoNino
 */
public class LoginDAOImpl  implements LoginDAOInterface{

    @Override
    public UsuarioDTO obtenerUsuario(UsuarioDTO usuarioDTO) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return usuarioDTO;
    }
    
    public static boolean select(UsuarioDTO usuarioDTO) {
        
        Connection connection = null;
        PreparedStatement stmt = null;
        boolean loginExitoso = false;
        
        
        ResultSet rs = null;
        
        try {
            System.out.println("**********DAOusuario:" + usuarioDTO.getUsuario());
            System.out.println("**********DAOpassword:" + usuarioDTO.getPassword());
            String query = "SELECT name, login, password, email FROM users WHERE login = '" + usuarioDTO.getUsuario()+ "' and password ='"+ usuarioDTO.getPassword()+ "'";
                 
            connection = SimpleDataSource.getConnection();
            stmt = connection.prepareStatement(query);
            System.out.println("Query a ejecutar: "+query);
            rs= stmt.executeQuery();
            
            while(rs.next()){
                System.out.println("Nombre"+ rs.getString(1));
                System.out.println("Apellido"+ rs.getString(2));
                loginExitoso = true;
            }
            
            
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally{
            try {
                rs.close();
                stmt.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
         }
        return loginExitoso;
            
    }
    
    
}