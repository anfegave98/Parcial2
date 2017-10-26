/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author LabingXEON
 */
public class Estatus_empleado {
    private int id_estatus;
    private String nombre_estatus;
    private String fecha_ingreso;

    public Estatus_empleado(int id_estatus, String nombre_estatus, String fecha_ingreso) {
        this.id_estatus = id_estatus;
        this.nombre_estatus = nombre_estatus;
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getId_estatus() {
        return id_estatus;
    }

    public void setId_estatus(int id_estatus) {
        this.id_estatus = id_estatus;
    }

    public String getNombre_estatus() {
        return nombre_estatus;
    }

    public void setNombre_estatus(String nombre_estatus) {
        this.nombre_estatus = nombre_estatus;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
    
}
