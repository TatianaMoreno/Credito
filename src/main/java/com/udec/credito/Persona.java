/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.credito;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AndresChila
 */
public class Persona {
    
    private String nombre;
    private int cedula;
    private int edad;
    private String genero;
    public Persona(){};
    public Persona(String nombre, int cedula, int edad, String genero) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
}
