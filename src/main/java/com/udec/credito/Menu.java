/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.credito;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author tmore
 */
public class Menu {
    // El while será ejecutado hasta que salir sea TRUE.
    private boolean salir = false;
    private int opcion;
    private String cedula;
    private String nombre;
    private int cedu;
    private int edad;
    private String genero;
    private Date fecha;
    private String descripcion;
    private String fechaComoTexto;
    private Byte o;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String tipo;
    Scanner sn = new Scanner(System.in);
    ArrayList<Persona> listaPersonas = new ArrayList<>();
    ArrayList<TipoAntecedente> listaTipoAntecedentes = new ArrayList<>();
    public Menu() { 
        while (salir==false) {   

            // Le indicamos al usuario cuales son sus opciones:

            System.out.println(" MENU DE  ");

            System.out.println(" 1 - Crear una persona. ");

            System.out.println(" 2 - Editar una persona.");
            
            System.out.println(" 3 - Agregar un tipo de antecedente.");

            System.out.println(" 4 - Agregar un atecedente a un usuario.");

            System.out.println(" 5 - Eliminar antecedentes de un usuario. ");
            
            System.out.println(" 6 - Visualizar los antecedentes de un usuario. ");
            
            System.out.println(" 7 - Salir ");
            opcion = sn.nextInt();
            switch (opcion) {
                    case 1: crearPersona();
                        break;
                    case 2: editarPersona();
                        break;
                    case 3: crearTipoAntecedentes();
                        break;
                    case 4: agregarAntecedente();
                        break;
                    case 5: eliminarAntecedentes();
                        break;
                    case 6: vizualizarAntecedentes();
                        break;
                    case 7: salir();
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
            }
                                
        }
    }
    //Metodo para agreagr a un usuario.
    public void crearPersona(){
        System.out.println("Nombre:");
        sn.nextLine();
        nombre=sn.nextLine();
        System.out.println("Cedula:");
        cedu=(sn.nextInt());
        System.out.println("Edad:");
        edad=(sn.nextInt());
        System.out.println("Genero (1.Masculino 2.Femenino):");
        sn.nextLine();
        if((o =(sn.nextByte()))==1){
            genero="Masculino";
        }else if ((o =(sn.nextByte()))==2)
            genero="Femenino";
        Persona p =new Persona(nombre, cedu, edad, genero);
        listaPersonas.add(p);
    }
    //Metodo para editar a un usuario que solo permite cambiar la edad, nombre y genero.
    public void editarPersona(){
        System.out.println(" Ingrese la la cedula del usuario a editar");
        sn.nextLine();
        cedula = sn.nextLine();
        for (Persona p : listaPersonas) {
            if (cedula.equals(Integer.toString(p.getCedula()))) {
                
                System.out.println("Datos actuales de la persona editar: ");
                System.out.println("Nombre: " + p.getNombre());
                System.out.println("Cedula: " + p.getCedula());
                System.out.println("Edad: " + p.getEdad());
                System.out.println("Genero: " + p.getGenero());
            }
        }
    }
    
    
    public void crearTipoAntecedentes(){
        
    }
    
    public void agregarAntecedente() {
        System.out.println("Ingrese la la cedula del usuario al que desea agregra antecedentes");
        sn.nextLine();
        cedula = sn.nextLine();
        for (Persona p : listaPersonas) {
            if (cedula.equals(Integer.toString(p.getCedula()))) {
                
                System.out.println("Persona a agreagar antecedentes: ");
                System.out.println("Nombre: " + p.getNombre());
                System.out.println("Cedula: " + p.getCedula());
                System.out.println("Edad: " + p.getEdad());
                System.out.println("Genero: " + p.getGenero());
                System.out.println("Ingrese la fecha del antecedente (dia/mes/año): ");
                fechaComoTexto  = sn.nextLine();
                System.out.println("Ingrese la descripcion: "); descripcion= sn.nextLine();
                System.out.println("Ingrese el tipo (Negativo/Positivo): "); tipo= sn.nextLine();
                 
                                
            }
        }
    }
    
    public void vizualizarAntecedentes(){
        System.out.println(" Ingrese la la cedula del usuario a editar");
        sn.nextLine();
        cedula = sn.nextLine();
        for (Persona p : listaPersonas) {
            if (cedula.equals(Integer.toString(p.getCedula()))) {
                System.out.println("Persona : ");
                System.out.println("Nombre: " + p.getNombre());
                System.out.println("Cedula: " + p.getCedula());
                System.out.println("Edad: " + p.getEdad());
                System.out.println("Genero: " + p.getGenero());
                System.out.println("Antecedentes: " + p.getAntecedentes());
            }
        }
    }
    
    public void eliminarAntecedentes(){
        System.out.println("Ingrese la la cedula del usuario al que desea elimanar antecedentes ");
        sn.nextLine();
        cedula = sn.nextLine();
        for (Persona p : listaPersonas) {
            if (cedula.equals(Integer.toString(p.getCedula()))) {
                
                System.out.println("Persona creada: ");
                System.out.println("Nombre: " + p.getNombre());
                System.out.println("Cedula: " + p.getCedula());
                System.out.println("Edad: " + p.getEdad());
                System.out.println("Genero: " + p.getGenero());
            }
        }
    }
    
    public void salir(){
        salir = true;
        System.out.println("Gracias por usar nuestro software");
        System.out.println("Saliendo del programa");

    }
}
