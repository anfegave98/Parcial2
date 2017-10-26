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
    float sueldo;
    float auxilioTransporte;
    float prima;
    float cesantias;
    float intereses;
    float vacaciones;
    float salud;
    float pension;
    float parafiscales;
    int dias;
    float total;

    public Reporte(String nombreEmpleado, float sueldo, float auxilioTransporte, float prima, float cesantias, float intereses, float vacaciones, float salud, float pension, float parafiscales, int dias,float total) {
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

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public float getAuxilioTransporte() {
        return auxilioTransporte;
    }

    public void setAuxilioTransporte(float auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }

    public float getPrima() {
        return prima;
    }

    public void setPrima(float prima) {
        this.prima = prima;
    }

    public float getCesantias() {
        return cesantias;
    }

    public void setCesantias(float cesantias) {
        this.cesantias = cesantias;
    }

    public float getIntereses() {
        return intereses;
    }

    public void setIntereses(float intereses) {
        this.intereses = intereses;
    }

    public float getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(float vacaciones) {
        this.vacaciones = vacaciones;
    }

    public float getSalud() {
        return salud;
    }

    public void setSalud(float salud) {
        this.salud = salud;
    }

    public float getPension() {
        return pension;
    }

    public void setPension(float pension) {
        this.pension = pension;
    }

    public float getParafiscales() {
        return parafiscales;
    }

    public void setParafiscales(float parafiscales) {
        this.parafiscales = parafiscales;
    }
    
    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    
    
    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Reporte{" + "nombreEmpleado=" + nombreEmpleado + ", sueldo=" + sueldo + ", auxilioTransporte=" + auxilioTransporte + ", prima=" + prima + ", cesantias=" + cesantias + ", intereses=" + intereses + ", vacaciones=" + vacaciones + ", salud=" + salud + ", pension=" + pension + ", parafiscales=" + parafiscales + ", total=" + total + '}';
    }

   
    
    
}
