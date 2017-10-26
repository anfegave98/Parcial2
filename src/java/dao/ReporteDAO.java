/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Util.DbUtil;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Empleado;
import model.Reporte;

/**
 *
 * @author Labin
 */
public class ReporteDAO {
    
    private Connection connection;

    public ReporteDAO() throws SQLException {
        connection = DbUtil.getConnection();
    }
    
    
     public ArrayList<Reporte> getAllReportes(int diasTrabajados) throws SQLException {
        ArrayList<Reporte> tabla = new ArrayList<>();
        boolean result = false;
        String query ="SELECT empleado.nombre,empleado.sueldo from empleado";
        Connection connection = DbUtil.getConnection();
        try {

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
           int sueldo; 
           float devengado;
           float total =0;
           String nombre=null;
      

            while (rs.next()) {
                Reporte registro = new Reporte(nombre, total);
                

                nombre = rs.getString("nombre");
                registro.setNombreEmpleado(nombre);
                
                sueldo=rs.getInt("sueldo");
                
                total+= sueldo*12;
                
                // prima
                total+= (diasTrabajados*sueldo)/360;
                
                //cesanstias
                 total+= (diasTrabajados*sueldo)/360;
                 
                //intereses cesanstias
                total+=sueldo*0.12;
                 
                //vacaciones
                total+= (diasTrabajados*sueldo)/720;
                
                //transporte
                total+= 83.140*12;
               
                //salud
                devengado =(float) (((sueldo*12)+((diasTrabajados*sueldo)/360)+((diasTrabajados*sueldo)/360)+(sueldo*0.12)+((diasTrabajados*sueldo)/720))*0.85);
               
               //Pension
               total+=sueldo*0.12;
               
               //SENA
               total+= total*0.2;
               
               //ICBF
                total+= total*0.3;
               
               //Familia
               total+= total*0.4;
                
               registro.setTotal(total);
               
               tabla.add(registro);

              
            }
            
                
         
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Tablas");
            e.printStackTrace();
        }
          System.out.println(tabla.toString());
        return tabla;

    }
    
    
    
}
