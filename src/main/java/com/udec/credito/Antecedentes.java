/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.credito;

import java.util.Date;

/**
 *
 * @author tmore
 */
public class Antecedentes {
    private Date fecha;
    private String descripcion;
    private String tipo;

    public Antecedentes(Date fecha, String descripcion, String tipo) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
