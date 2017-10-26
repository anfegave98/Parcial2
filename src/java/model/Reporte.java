/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Labin
 */
public class Reporte {
    String nombreEmpleado;
    float total;

    public Reporte(String nombreEmpleado, float total) {
        this.nombreEmpleado = nombreEmpleado;
        this.total = total;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Reporte{" + "nombreEmpleado=" + nombreEmpleado + ", total=" + total + '}';
    }
    
    
}
