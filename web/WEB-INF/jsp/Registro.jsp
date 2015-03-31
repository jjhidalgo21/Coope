<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : Registro
    Created on : 16/03/2015, 07:32:28 PM
    Author     : Jonathan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
        <h1>${helloMessage}</h1>
            <html:form name="registroForm" action="Registro.jsp">
                <table border="1">
                    <thead>
                        <tr>
                            <th>Registro de Usuario</th>
                            <th> </th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>Nombre:</td>
                            <td><input type="text" name="nombre" value="" id="nombre"/></td> 
                    
                        </tr>
                        
                        <tr>
                            <td>Apellido Paterno:</td>
                            <td> <input type="text" name="apellidoP" value="" id="apellidoP"/> </td>
                        </tr>
                        <tr>
                            <td>Apellido Materno:</td>
                            <td> <input type="text" name="apellidoM" value="" id="apellidoA"/> </td>
                        </tr>
                        <tr>
                            <td>Usuario:</td>
                            <td> <input type="text" name="user" value="" id="user" /> </td>
                        </tr>
                        <tr>
                            <td>Contraseña:</td>
                            <td> <input type="text" name="pass" value="" id="pass"/> </td>
                        </tr>
                        <tr>
                            <td>Email:</td>
                            <td> <input type="text" name="email" value="" id="email"/> </td>
                        </tr>
                    </tbody>
                    <input type="submit" value="Crear Usuario" name="createUser" onclick="regitrar()"/>
                </table>
                
            </html:form>
    </body>
</html>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script>
    
    function regitrar(){
        alert($('#user').val());
        var user = $('#user').val();
        $.ajax({
            type: "POST",
            url: "/registro",
            data: "{user: " + user + "}",
            //contentType: "application/json; charset=utf-8",
            //dataType: "json",
            success: function(result){
                alert("success");
                console.log(result);
            }
        });
         
    }
    
</script>