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
public class tipo_contrato {
    private int id_tipocontrato;
    private String nombre_contrato;

    public tipo_contrato(int id_tipocontrato, String nombre_contrato) {
        this.id_tipocontrato = id_tipocontrato;
        this.nombre_contrato = nombre_contrato;
    }

    public int getId_tipocontrato() {
        return id_tipocontrato;
    }

    public void setId_tipocontrato(int id_tipocontrato) {
        this.id_tipocontrato = id_tipocontrato;
    }

    public String getNombre_contrato() {
        return nombre_contrato;
    }

    public void setNombre_contrato(String nombre_contrato) {
        this.nombre_contrato = nombre_contrato;
    }
    
}
