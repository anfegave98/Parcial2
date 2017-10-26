<%@page import="model.Reporte"%>
<%@page import="model.Empleado"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Informe</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
      
        <h1>Informe</h1>
        <div class="container">
            <div class="row">  
                <div class="col-sm-12">
                    
                    <a class="btn btn-info" href="index.jsp" role="button">Inicio</a>
                    <br>
                    <br>
                    <table class="table table-hover table-condensed table-bordered">
                        <tr>
                          
                            <td>Nombre</td>
                            <td>Sueldo</td>
                            <td>Auxilio de Transporte</td>
                            <td>Prima</td>
                            <td>Cesantias</td>
                            <td>Intereses</td>
                            <td>Vacaciones</td>
                             <td>Salud</td>
                            <td>Pension</td>
                            <td>Parafiscal</td>
                            <td>Dias Trabajados</td>
                            <td>Total</td>
                     

                        </tr>
                        <% if (request.getAttribute("listaInforme") != null) {
                                ArrayList<Reporte> list = (ArrayList<Reporte>) request.getAttribute("listaInforme");
                                if (list != null)
                                    for (Reporte tabla : list) {


                        %>
                        <tr>
                            <td><%=tabla.getNombreEmpleado()%></td>
                            <td><%=tabla.getSueldo()%></td>
                            <td><%=tabla.getAuxilioTransporte()%></td>
                             <td><%=tabla.getPrima()%></td>
                            <td><%=tabla.getCesantias()%></td>
                            <td><%=tabla.getIntereses()%></td>
                             <td><%=tabla.getVacaciones()%></td>
                            <td><%=tabla.getSalud()%></td>
                            <td><%=tabla.getPension()%></td>
                             <td><%=tabla.getParafiscales()%></td>
                            <td><%=tabla.getDias()%></td>
                            <td><%=tabla.getTotal()%></td>
               
                      
                       
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