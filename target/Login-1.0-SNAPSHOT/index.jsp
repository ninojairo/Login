<%-- 
    Document   : index
    Created on : Aug 21, 2018, 6:05:23 PM
    Author     : jaironino
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Usuario JSP</title>
    </head>
    <body>
        <h1>Login Usuario JSP</h1>
        <s:form action="ValidarUsuario">
            <s:textfield name="usuarioDTO.usuario" label="Su usuario"></s:textfield>
            <s:textfield name="usuarioDTO.password" label="Su password"></s:textfield>
            <s:textfield name="usuarioDTO.nombre" label="Su nombre"></s:textfield>
            <s:textfield name="usuarioDTO.email" label="Su email"></s:textfield>
            
            <s:submit value="Submit"></s:submit>
            
        </s:form>
        
        <p><a href="<s:url action='ValidarUsuario'/>">Ingresar a la aplicacion</a></p>
    </body>
</html>
