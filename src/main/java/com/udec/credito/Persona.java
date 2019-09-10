/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.credito;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase que se guarda los atributos de una persona
 * @author @author Tatiana Moreno, Andres Chila
 */
public class Persona implements Serializable{
    //Atributo que guarda el nombre de una persona
    private String nombre;
    //Atributo que guarda la cedula de una persona
    private int cedula;
    //Atributo que guarda la edad de una persona
    private int edad;
    //Atributo que guarda el genero de una persona
    private String genero;
    //Lista que guarda los antecedentes de una persona
    private List<Antecedentes> antecedentes;
    //Constructor vacio 
    public Persona(){};
    //Constructor de la clase
    public Persona(String nombre, int cedula, int edad, String genero, List<Antecedentes> antecedentes) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.genero = genero;
        this.antecedentes = antecedentes;
    }

    
    

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

    public List<Antecedentes> getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(List<Antecedentes> antecedentes) {
        this.antecedentes = antecedentes;
    }

    
    
    
    
    
}
