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
public class Empleado {
    private int id_empleado;
    private String nombre_empleado;
    private String lugar_nacimiento;
    private int sueldo;
    private String estatus;
    private String tipocontrato;
    private String departamento;
    private String puesto;
    private String turno;
    private String tiposueldo;
    private String regimen_contratacion;

    public Empleado(int id_empleado, String nombre_empleado, String lugar_nacimiento, int sueldo, String estatus, String tipocontrato, String departamento, String puesto, String turno, String tiposueldo, String regimen_contratacion) {
        this.id_empleado = id_empleado;
        this.nombre_empleado = nombre_empleado;
        this.lugar_nacimiento = lugar_nacimiento;
        this.sueldo = sueldo;
        this.estatus = estatus;
        this.tipocontrato = tipocontrato;
        this.departamento = departamento;
        this.puesto = puesto;
        this.turno = turno;
        this.tiposueldo = tiposueldo;
        this.regimen_contratacion = regimen_contratacion;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getTipocontrato() {
        return tipocontrato;
    }

    public void setTipocontrato(String tipocontrato) {
        this.tipocontrato = tipocontrato;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTiposueldo() {
        return tiposueldo;
    }

    public void setTiposueldo(String tiposueldo) {
        this.tiposueldo = tiposueldo;
    }

    public String getRegimen_contratacion() {
        return regimen_contratacion;
    }

    public void setRegimen_contratacion(String regimen_contratacion) {
        this.regimen_contratacion = regimen_contratacion;
    }

    

}