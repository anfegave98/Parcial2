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
    long sueldo;
    long auxilioTransporte;
    long prima;
    long cesantias;
    long intereses;
    long vacaciones;
    long salud;
    long pension;
    long parafiscales;
    int dias;
    long total;

    public Reporte(String nombreEmpleado, long sueldo, long auxilioTransporte, long prima, long cesantias, long intereses, long vacaciones, long salud, long pension, long parafiscales, int dias, long total) {
        this.nombreEmpleado = nombreEmpleado;
        this.sueldo = sueldo;
        this.auxilioTransporte = auxilioTransporte;
        this.prima = prima;
        this.cesantias = cesantias;
        this.intereses = intereses;
        this.vacaciones = vacaciones;
        this.salud = salud;
        this.pension = pension;
        this.parafiscales = parafiscales;
        this.dias = dias;
        this.total = total;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public long getSueldo() {
        return sueldo;
    }

    public void setSueldo(long sueldo) {
        this.sueldo = sueldo;
    }

    public long getAuxilioTransporte() {
        return auxilioTransporte;
    }

    public void setAuxilioTransporte(long auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }

    public long getPrima() {
        return prima;
    }

    public void setPrima(long prima) {
        this.prima = prima;
    }

    public long getCesantias() {
        return cesantias;
    }

    public void setCesantias(long cesantias) {
        this.cesantias = cesantias;
    }

    public long getIntereses() {
        return intereses;
    }

    public void setIntereses(long intereses) {
        this.intereses = intereses;
    }

    public long getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(long vacaciones) {
        this.vacaciones = vacaciones;
    }

    public long getSalud() {
        return salud;
    }

    public void setSalud(long salud) {
        this.salud = salud;
    }

    public long getPension() {
        return pension;
    }

    public void setPension(long pension) {
        this.pension = pension;
    }

    public long getParafiscales() {
        return parafiscales;
    }

    public void setParafiscales(long parafiscales) {
        this.parafiscales = parafiscales;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

  

    @Override
    public String toString() {
        return "Reporte{" + "nombreEmpleado=" + nombreEmpleado + ", sueldo=" + sueldo + ", auxilioTransporte=" + auxilioTransporte + ", prima=" + prima + ", cesantias=" + cesantias + ", intereses=" + intereses + ", vacaciones=" + vacaciones + ", salud=" + salud + ", pension=" + pension + ", parafiscales=" + parafiscales + ", total=" + total + '}';
    }

   

   
    
    
}
