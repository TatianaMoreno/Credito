/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.credito;

import java.io.Serializable;

/**
 * Clase que guarda los atributos de el tipo de antecedente
 * @author Tatiana Moreno, Andres Chila
 */
public class TipoAntecedente implements Serializable{
    //Atributo que guarda la descripcion de un tipo de antecendete 
    private String descripcion;
    //Atributo que guarda un nombre caracteristico de un tipo de antecendete
    private String nombreCaracteristico;
    //Atributo que guarda el tipo si es negativo o positivo de un tipo de antecendete
    private String tipo;
    //Cosntructor de la clase
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
