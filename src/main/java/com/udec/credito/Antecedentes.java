/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.credito;

import java.io.Serializable;
import java.util.Date;

/**
 * Clase que guarda todo los atributos que pertence a los antecedentes
 * @author Tatiana Moreno, Andres Chila
 */
public class Antecedentes implements Serializable{
    //Atributo que guarda la fecha del antecendente 
    private Date fecha;
    //Atributo que guarda la descripcion del antecendente 
    private String descripcion;
    //Atributo que guarda el tipo del antecendente 
    private TipoAntecedente tipo;
    //Constructor de la clase
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
