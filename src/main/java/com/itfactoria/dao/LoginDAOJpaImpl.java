/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itfactoria.dao;

import com.itfactoria.dto.UsuarioDTO;
import javax.persistence.EntityManager;

/**
 *
 * @author JairoNino
 */
public class LoginDAOJpaImpl implements LoginDAOInterface {
    
        private final EntityManager entityManager;
        
        public LoginDaoJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    
    @Override
    public UserDto obtenerUsuario(UserDto userDto) {
        try {
            UserEntity user = (UserEntity) entityManager.createQuery(
                    "SELECT c FROM UserEntity c WHERE c.login = :login and c.password = :psw")
                    .setParameter("login", userDto.getLogin())
                    .setParameter("psw", userDto.getPassword())
                    .getSingleResult();

            return getDTO(user);
        } catch (javax.persistence.NoResultException ex) {
            return null;
        }

    }

    private UserDto getDTO(UserEntity user) {
        ModelMapper modelMapper = new ModelMapper();
        UserDto dto = modelMapper.map(user, UserDto.class);
        return dto;
    }

}
