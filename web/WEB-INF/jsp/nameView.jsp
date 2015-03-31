<%--
    Document   : nameView
    Created on : May 2, 2010, 2:06:51 PM
    Author     : nbuser
--%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Enter Your Name!</h1>

        <spring:nestedPath path="name">
            <form action="" method="post">
                <table>
                    <tr>
                        <td>
                            User:
                        </td>
                        <td>
                            <spring:bind path="user">
                                <input type="text" name="${status.expression}" id="user" value="${status.value}">
                            </spring:bind>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Password:
                        </td>
                        <td>
                            <spring:bind path="pass">
                                <input type="text" name="${status.expression}" id="pass" value="${status.value}">
                            </spring:bind>
                       </td>    
                    </tr>
                    
                    <tr>
                        <input type="submit" value="OK"> 
                    </tr>
                </table>
            </form>
        </spring:nestedPath>

    </body>
</html>