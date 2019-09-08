/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.credito;

/**
 *
 * @author tmore
 */
public class TipoAntecedente {
    private String descripcion;
    private String nombreCaracteristico;
    private String tipo;

    public TipoAntecedente(String descripcion, String nombreCaracteristico, String tipo) {
        this.descripcion = descripcion;
        this.nombreCaracteristico = nombreCaracteristico;
        this.tipo = tipo;
    }

    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreCaracteristico() {
        return nombreCaracteristico;
    }

    public void setNombreCaracteristico(String nombreCaracteristico) {
        this.nombreCaracteristico = nombreCaracteristico;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
