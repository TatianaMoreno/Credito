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
    private TipoAntecedente tipo;

    public Antecedentes(Date fecha, String descripcion, TipoAntecedente tipo) {
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

    public TipoAntecedente getTipo() {
        return tipo;
    }

    public void setTipo(TipoAntecedente tipo) {
        this.tipo = tipo;
    }

  
    
    
}
