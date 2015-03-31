<%--
    Document   : helloView
    Created on : May 2, 2010, 2:06:25 PM
    Author     : nbuser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Menu</title>
    </head>
    <body>
        <h2>${helloMessage}</h2>
        
        
        <table>
            <c:if test="${not empty objects}">
    <table>
        <c:forEach var="o" items="${objects}">
            <tr>
                <td>${o.id}</td>
                <td>${o.name}</td>
                <td>${o.descriptio}</td>   
            </tr>
        </c:forEach>
    </table>
</c:if>
            
            
        </table>
    </body>
</html>






<script type="text/javascript">
    var respuesta =  '${helloMessage}';    
</script>