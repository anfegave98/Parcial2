/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Util.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Empleado;

/**
 *
 * @author LabingXEON
 */
public class EmpleadoDAO {
    
    private Connection connection;

    public EmpleadoDAO() throws SQLException {
        connection = DbUtil.getConnection();
    }
    
    public boolean updateTabla(int a, int sueldo) throws SQLException {
        boolean result = false;
        Connection connection = DbUtil.getConnection();
        String query = "update empleado set sueldo = ? where id_empleado = ?";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, sueldo);
            preparedStmt.setInt(2, a);
            if (preparedStmt.executeUpdate() > 0) {
                result = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
    
      public ArrayList<Empleado> getAllEmpleados() throws SQLException {
        ArrayList<Empleado> tabla = new ArrayList<>();
        boolean result = false;
        String query ="SELECT empleado.id_empleado,empleado.nombre,empleado.lugar_nacimiento,empleado.sueldo,estatus_empleado.nombre_estatus,tipo_contrato.nombre_contrato,departamento.nombre_departamento, puesto.nombre_puesto,turno.nombre_turno,tipo_sueldo.nombre, tipo_regimencontratacion.nombre_regimen FROM empleado,tipo_sueldo,tipo_regimencontratacion,tipo_contrato,departamento,puesto,turno,estatus_empleado where empleado.estatus = estatus_empleado.id_estatus and empleado.tipocontrato = tipo_contrato.id_tipocontrato and empleado.departamento = departamento.id_departamento and empleado.puesto = puesto.id_puesto and empleado.turno = turno.id_turno and empleado.tiposueldo=tipo_sueldo.id_sueldo and empleado.regimen_contratacion = tipo_regimencontratacion.id_regimen";
        Connection connection = DbUtil.getConnection();
        try {

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

           int id =0;
           String nombre=null;
           String lugar=null;
           int sueldo=0;
           String estatus=null;
           String tipocontrato=null;
           String departamento=null;
           String puesto=null;
           String turno =null;
           String tiposueldo=null;
           String regimen=null;

            while (rs.next()) {
                Empleado registro = new Empleado(id,nombre,lugar,sueldo,estatus,tipocontrato,departamento,puesto,turno,tiposueldo,regimen);
                
                id = rs.getInt("id_empleado");
                registro.setId_empleado(id);

                nombre = rs.getString("nombre");
                registro.setNombre_empleado(nombre);

                lugar = rs.getString("lugar_nacimiento");
                registro.setLugar_nacimiento(lugar);
                
                sueldo = rs.getInt("sueldo");
                registro.setSueldo(sueldo);
                
                estatus= rs.getString("nombre_estatus");
                registro.setEstatus(estatus);
                
                tipocontrato = rs.getString("nombre_contrato");
                registro.setTipocontrato(tipocontrato);
                
                departamento = rs.getString("nombre_departamento");
                registro.setDepartamento(departamento);
                
                puesto = rs.getString("nombre_puesto");
                registro.setPuesto(puesto);
                
                turno = rs.getString("nombre_turno");
                registro.setTurno(turno);

                tiposueldo = rs.getString("nombre");
                registro.setTiposueldo(tiposueldo);
                
                regimen = rs.getString("nombre_regimen");
                registro.setRegimen_contratacion(regimen);
                
                tabla.add(registro);
                System.out.println(registro.toString());
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
