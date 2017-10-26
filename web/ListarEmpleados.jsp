

<%@page import="model.Empleado"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Empeleado</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
      <form action="ListarE" method="GET">
            
            <input type="submit" class="btn btn-info" name="Enviar"/>
        
            
        </form>
        <h1>Empleados</h1>
        <div class="container">
            <div class="row">  
                <div class="col-sm-12">
                    <table class="table table-hover table-condensed table-bordered">
                        <tr>
                            <td>Id</td>
                            <td>Nombre</td>
                            <td>Lugar de nacimiento</td>
                            <td>Sueldo</td>
                            <td>Estatus</td>
                            <td>TipoContrato</td>
                            <td>Departamento</td>
                            <td>Puesto</td>
                             <td>Turno</td>
                            <td>Tipo de sueldo</td>
                            <td>Regimen Contratacion</td>
                     

                        </tr>
                        <% if (request.getAttribute("listaEmpleados") != null) {
                                ArrayList<Empleado> list = (ArrayList<Empleado>) request.getAttribute("listaEmpleados");
                                if (list != null)
                                    for (Empleado tabla : list) {


                        %>
                        <tr>
                            <td><%=tabla.getId_empleado()%></td>
                            <td><%=tabla.getNombre_empleado()%></td>
                            <td><%=tabla.getLugar_nacimiento()%></td>
                             <td><%=tabla.getSueldo()%></td>
                            <td><%=tabla.getEstatus()%></td>
                            <td><%=tabla.getTipocontrato()%></td>
                             <td><%=tabla.getDepartamento()%></td>
                            <td><%=tabla.getPuesto()%></td>
                            <td><%=tabla.getTurno()%></td>
                             <td><%=tabla.getTiposueldo()%></td>
                            <td><%=tabla.getRegimen_contratacion()%></td>
               
                            <td>
                                <button onclick="window.location.href = 'EditarSueldo?id=<%=tabla.getSueldo()%>'" class="btn btn-warning">Editar Sueldo</button>
                            </td>
                        </tr>
                        <% }
                            }
                        %>

                    </table>

                </div>
            </div>
        </div>

    </body>
</html>