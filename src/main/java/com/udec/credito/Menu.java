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
 * @author tmore
 */
public class Menu {
    // El while será ejecutado hasta que salir sea TRUE.
    private boolean salir = false;
    private int opcion;
    private String cedula;
    Scanner sn = new Scanner(System.in);
    Persona persona=new Persona();
    ArrayList<Persona> listaPersonas = new ArrayList<>();
    public Menu(){ 
        while (salir==false) {   

            // Le indicamos al usuario cuales son sus opciones:

            System.out.println(" MENU DE  ");

            System.out.println(" 1 - Crear un usuario ");

            System.out.println(" 2 - Editar un usaurio");

            System.out.println(" 3 - Agregar un atecedente a un usuario");

            System.out.println(" 4 - Eliminar antecedentes de un usuario ");
            
            System.out.println(" 5 - visualizar los antecedentes de un usuario ");
            
            System.out.println(" 0 - Salir ");
            opcion = sn.nextInt();
            switch (opcion) {
                    case 1: crearPersona();
                        break;
                    case 2: editarPersona();
                        break;
                    case 3: 
                        break;
                    case 4: 
                        break;
                    case 5: 
                        break;
                    case 6: 
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
            }
                                
        }
    }
    public void crearPersona(){
        System.out.println("Nombre:");
        sn.nextLine();
        persona.setNombre(sn.nextLine());
        System.out.println("Cedula:");
        persona.setCedula(sn.nextInt());
        System.out.println("Edad:");
        persona.setEdad(sn.nextInt());
        System.out.println("Genero (M/F):");
        sn.nextLine();
        persona.setGenero(sn.nextLine());
        System.out.println("Persona creada: ");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Cedula: " + persona.getCedula());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Genero: " + persona.getGenero());
        listaPersonas.add(persona);
    }
    public void editarPersona(){
        System.out.println(" Ingrese la la cedula del usuario a editar");
        sn.nextLine();
        cedula = sn.nextLine();
        for (Persona p : listaPersonas) {
            if (cedula.equals(Integer.toString(p.getCedula()))) {
                
                System.out.println("Persona creada: ");
                System.out.println("Nombre: " + persona.getNombre());
                System.out.println("Cedula: " + persona.getCedula());
                System.out.println("Edad: " + persona.getEdad());
                System.out.println("Genero: " + persona.getGenero());
                
                
            }
        }
    }
    public void salir(){
        salir = true;
        System.out.println("Saliendo del programa");

    }
}
