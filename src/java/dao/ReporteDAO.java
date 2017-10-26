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

    public ArrayList<Reporte> getAllReportes() throws SQLException {
        ArrayList<Reporte> tabla = new ArrayList<>();
        boolean result = false;
        String query = "SELECT empleado.nombre,empleado.sueldo,estatus_empleado.fecha_ingreso from empleado,estatus_empleado where estatus_empleado.id_estatus = empleado.id_empleado ";
        System.out.println("metodo9");
        try {

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            float devengado;

            String nombre = null;
            float sueldo = 0;
            float auxilioTransporte=0;
            float prima=0;
            float cesantias=0;
            float intereses=0;
            float vacaciones=0;
            float salud=0;
            float pension=0;
            float parafiscales=0;
            float total=0;
            
            String fecha_ingreso = null;
            int diasTrabajados=0;

            while (rs.next()) {
                System.out.println("whle");
                Reporte registro = new Reporte(nombre, sueldo, auxilioTransporte, prima, cesantias, intereses, vacaciones, salud, pension, parafiscales, diasTrabajados ,total);
                
                total=0;
                
                fecha_ingreso= rs.getString("fecha_ingreso");
                System.out.println(fecha_ingreso+"aquie llegu e");
                String fechas[]= fecha_ingreso.split("-");
                diasTrabajados+= 31 - Integer.parseInt(fechas[1]);
                diasTrabajados+= (12 - Integer.parseInt(fechas[2]))*30;
                
                
                
                
                nombre = rs.getString("nombre");
                registro.setNombreEmpleado(nombre);

                sueldo = rs.getInt("sueldo");
                registro.setSueldo(sueldo);
                
                auxilioTransporte = (float) 83.140;
                registro.setAuxilioTransporte(auxilioTransporte);
                
                

                total += sueldo * 12;

                // prima
                prima = (diasTrabajados * sueldo) / 360;
                registro.setPrima(prima);
                total += prima;

                //cesanstias
                cesantias = (diasTrabajados * sueldo) / 360;
                registro.setCesantias(cesantias);
                total += cesantias;

                //intereses cesanstias
                intereses = (float) (sueldo * 0.12);
                registro.setIntereses(intereses);
                total += intereses;

                //vacaciones
                vacaciones=(diasTrabajados * sueldo) / 720;
                registro.setVacaciones(vacaciones);
                total += vacaciones;

                //transporte
                auxilioTransporte = (float) ((83.140*360)/diasTrabajados);
                registro.setAuxilioTransporte(auxilioTransporte);
                total += auxilioTransporte;

                //salud
                salud = (float) (((sueldo * 12) + ((diasTrabajados * sueldo) / 360) + ((diasTrabajados * sueldo) / 360) + (sueldo * 0.12) + ((diasTrabajados * sueldo) / 720)) * 0.85);
                registro.setSalud(salud);
                total += salud;

                //Pension
                pension= (float) (sueldo * 0.12);
                registro.setPension(pension);
                total += pension;

                //parafiscales
                parafiscales = (float) ((total * 0.2)+ (total*0.3) +(total*.4));
                registro.setParafiscales(parafiscales);
                total += parafiscales;

               

                registro.setTotal(total);
                System.out.println(registro.toString());
                tabla.add(registro);

            }
            System.out.println("Holaaaaaa");
             
            for(int i=0;i<tabla.size();i++){
                System.out.println(tabla.get(i).getCesantias());
            
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
