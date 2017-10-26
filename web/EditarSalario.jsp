

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Tabla</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body background="fondo.jpg">
        <%
            
          int id=(Integer) request.getAttribute("id");
            %>
        <h1>Inserte el nuevo Sueldo</h1>
        <form action="EditarSalarios" method="POST">
            Id del empleado:
            <input type="text" name="idempleados" value="<%=id%>" readonly="readonly"/>
            Nuevo sueldo:
            <input type="text" name="salario"/>
            <br>
            <br>  
            <input type="submit" class="btn btn-info" name="enviar"/>
            <a class="btn btn-info" href="ListarE" role="button">Ver Empleados</a>
        </form>

       

    </body>
</html>
