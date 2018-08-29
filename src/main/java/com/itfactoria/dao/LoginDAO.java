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
public class LoginDAO {
        
        private static final String SELECT = "select name, login, password, email from users";

    public static void Select() {
        
        Connection connection = null;
        PreparedStatement stmt = null;
        UsuarioDTO usuarioDTO = null;
        ResultSet rs = null;
        
        try {
            
            connection = SimpleDataSource.getConnection();
            stmt = connection.prepareStatement(SELECT);
            rs= stmt.executeQuery();
            System.out.println("Query a ejecutar: "+SELECT);
            while(rs.next()){
                System.out.println("Nombre"+ rs.getString(1));
                System.out.println("Apellido"+ rs.getString(2));
                
            }
            
            
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally{
        
        }
            
    }
    
    
    
    
        
        
    
}
