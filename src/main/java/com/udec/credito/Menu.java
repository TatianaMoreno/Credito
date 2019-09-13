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
import java.io.BufferedReader;
import java.io.Serializable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import static java.lang.Integer.parseInt;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que guarda toda la logica del programa
 *
 * @author Tatiana Moreno, Andres Chila
 */
public class Menu {

    // El while será ejecutado hasta que salir sea TRUE.

    private boolean salir = false;
    //Atributo que guarad la opcion del menu
    private int opcion;
    //Atributo que guarda la cedula
    private String cedula;
    //Atributo que guarda el nombre
    private String nombre;
    //Atributo que guarda la cedula
    private int cedu;
    //Atributo que guarda la edad
    private int edad;
    //Atributo que guarda el genero
    private String genero;
    //Atributo que guarda la fecha del antecedente
    private Date fecha;
    //Atributo que guarda la descripcion
    private String descripcion;
    //Atributo que guarda la fehca como texto
    private String fechaComoTexto;
    //Atributo que se usa para el genero
    private Byte seleccion, contador=1;
    private int seleccionado;
    //Atributo que guarda el nombre caracteristico de un tipo de antecedente
    private String nombreCaracteristico;
    //Atributo que guarda el tipo de antecedente
    private String tipo;
    //Para el formato de la fecha
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    //Se usa para leer lo que entra por consola
    Scanner sn = new Scanner(System.in);
    //Se usa para leer lo que entra por consola
    Scanner cn = new Scanner(System.in);
    //Lista que guarda las personas
    List<Persona> listaPersonas;
    //Lista qie guarda los tipos de antecedentes
    List<TipoAntecedente> listaTipoAntecedentes;
    Persona persona = new Persona();

    public Menu() {
        listaPersonas = (new Archivos().devolverPersona());
        listaTipoAntecedentes = (new Archivos().devolverTipos());
        if(listaTipoAntecedentes == null)
             listaTipoAntecedentes = new ArrayList();
        if (listaPersonas == null) {
            listaPersonas = new ArrayList();
        }
        while (salir == false) {

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
                case 1:
                    crearPersona();

                    break;
                case 2:
                    editarPersona();
                    break;
                case 3:
                    crearTipoAntecedentes();
                    break;
                case 4:
                    agregarAntecedente();
                    break;
                case 5:
                    eliminarAntecedentes();
                    break;
                case 6:
                    vizualizarAntecedentes();
                    break;
                case 7:
                    salir();
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }

        }
    }

    //Metodo para agregar a un usuario.

    public void crearPersona() {
        System.out.println("Nombre:");
        nombre = cn.nextLine();
        System.out.println("Cedula:");
        cedu = (sn.nextInt());
        System.out.println("Edad:");
        edad = (sn.nextInt());
        System.out.println("Genero (1.Masculino 2.Femenino):");
        seleccion = sn.nextByte();
        if (Integer.parseInt(seleccion.toString()) == 1) {
            genero = "Masculino";
        } else if (Integer.parseInt(seleccion.toString()) == 2) {
            genero = "Femenino";
        }
        Persona p = new Persona(nombre, cedu, edad, genero, null);
        listaPersonas.add(p);
        (new Archivos()).crearArchivo(listaPersonas);
        System.out.println("Se creo con exito");
    }

    //Metodo para editar a un usuario que solo permite cambiar la edad, nombre y genero.
    public void editarPersona() {
        System.out.println(" Ingrese la la cedula del usuario a editar");
        cedula = cn.nextLine();
        for (Persona p : listaPersonas) {
            if (cedula.equals(Integer.toString(p.getCedula()))) {
                System.out.println("Datos actuales de la persona editar: ");
                System.out.println("Nombre: " + p.getNombre());
                System.out.println("Cedula: " + p.getCedula());
                System.out.println("Edad: " + p.getEdad());
                System.out.println("Genero: " + p.getGenero());
                System.out.println("Que gustaria editar en la persona\n 1.Nombre\n 2.Edad\n 3.Genero");
                switch (seleccion = sn.nextByte()) {
                    case 1:
                        System.out.println("Nuevo nombre: ");
                        p.setNombre(cn.nextLine());
                        System.out.println("Se cambio el nombre con exito");
                        break;
                    case 2:
                        System.out.println("Nueva Edad:");
                        p.setEdad(sn.nextInt());
                        System.out.println("Se cambio la edad con exito");
                        break;
                    case 3:
                        System.out.println("Nuevo genero (1.Masculino 2.Femenino):");
                        seleccion = sn.nextByte();
                        if (seleccion == 1) {
                            genero = "Masculino";
                        } else if (seleccion == 2) {
                            genero = "Femenino";
                        }
                        p.setGenero(genero);
                        System.out.println("Se cambio el genero con exito");
                        break;
                }
            }
        }
        (new Archivos()).crearArchivo(listaPersonas);
    }

    public void crearTipoAntecedentes() {
        System.out.println("Nombre Caracteristico:");
        nombre = cn.nextLine();
        System.out.println("descripcion:");
        descripcion = cn.nextLine();
        System.out.println("Tipo (1.Positivo 2.Negativo):");
        seleccion = (sn.nextByte());
        if (seleccion == 1) {
            tipo = "Positivo";
        } else if (seleccion == 2) {
            tipo = "Negativo";
        }
        TipoAntecedente ta = new TipoAntecedente(descripcion, nombre, tipo);
        listaTipoAntecedentes.add(ta);
        (new Archivos()).crearArchivoTipoA(listaTipoAntecedentes);
    }

    public void agregarAntecedente() {
        System.out.println("Ingrese la la cedula del usuario al que desea agregra antecedentes");
        cedula = cn.nextLine();
        for (Persona p : listaPersonas) {
            if (cedula.equals(Integer.toString(p.getCedula()))) {

                System.out.println("Persona a agreagar antecedentes: ");
                System.out.println("Nombre: " + p.getNombre());
                System.out.println("Cedula: " + p.getCedula());
                System.out.println("Edad: " + p.getEdad());
                System.out.println("Genero: " + p.getGenero());
                System.out.println("Ingrese la fecha del antecedente (dia/mes/año): ");
                SimpleDateFormat formato = new SimpleDateFormat("yyyy/mm/dd");
                fechaComoTexto = cn.nextLine();
                try {
                    fecha = formato.parse(fechaComoTexto);
                } catch (ParseException ex) {

                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Ingrese la descripcion: ");
                descripcion = cn.nextLine();

                System.out.println("Ingrese el tipo(1/2): ");
                TipoAntecedente tipos = listaTipoAntecedentes.get(sn.nextInt()-1);
                List<Antecedentes> antecedentes = p.getAntecedentes();
                if(antecedentes == null){
                    antecedentes = new ArrayList<>();
                }
                Antecedentes a = new Antecedentes(fecha, descripcion, tipos);
                antecedentes.add(a);
                p.setAntecedentes(antecedentes);
                listaPersonas.add(p);
                (new Archivos()).crearArchivo(listaPersonas);
                break;
            }
        }
    }

    public void vizualizarAntecedentes() {
        System.out.println(" Ingrese la la cedula del usuario de quien desea ver los antecedentes");
        cedula = cn.nextLine();
        for (Persona p : listaPersonas) {
            if (cedula.equals(Integer.toString(p.getCedula()))) {
                System.out.println("Persona : ");
                System.out.println("Nombre: " + p.getNombre());
                System.out.println("Cedula: " + p.getCedula());
                System.out.println("Edad: " + p.getEdad());
                System.out.println("Genero: " + p.getGenero());
                System.out.println("Antecedentes: ");
                for(Antecedentes a : p.getAntecedentes()){
                    System.out.println(a.getDescripcion());
                    System.out.println(a.getFecha());
                    System.out.println(a.getTipo().getTipo());
                    System.out.println(a.getTipo().getNombreCaracteristico());
                    System.out.println(a.getTipo().getDescripcion());
                }
                break;
            }
        }
    }

    public void eliminarAntecedentes() {
        System.out.println("Ingrese la la cedula del usuario al que desea elimanar antecedentes ");
        cedula = cn.nextLine();
        for (Persona p : listaPersonas) {
            if (cedula.equals(Integer.toString(p.getCedula()))) {

                System.out.println("Persona creada: ");
                System.out.println("Nombre: " + p.getNombre());
                System.out.println("Cedula: " + p.getCedula());
                System.out.println("Edad: " + p.getEdad());
                System.out.println("Genero: " + p.getGenero());
                System.out.println("Antecedentes: ");
                for(Antecedentes a : p.getAntecedentes()){
                    System.out.println(contador+"------------------");
                    System.out.println(a.getDescripcion());
                    System.out.println(a.getFecha());
                    System.out.println(a.getTipo().getTipo());
                    System.out.println(a.getTipo().getNombreCaracteristico());
                    System.out.println(a.getTipo().getDescripcion());
                    contador++;
                }
                System.out.println("Cual antecedente desea eliminar: ");
                seleccionado = sn.nextInt();
                if ("Negativo".equals(p.getAntecedentes().get(seleccionado-1).getTipo().getTipo())) {
                    p.getAntecedentes().remove(seleccionado-1);
                    System.out.println("Se elimino con exito.");
                    contador=1;
                    break;
                } else {
                    System.out.println("No se pueden eliminar los antecedentes positivos.");
                    contador=1;
                    break;
                }
            }

        }
        (new Archivos()).crearArchivo(listaPersonas);
    }

    public void salir() {
        salir = true;
        System.out.println("Gracias por usar nuestro software");
        System.out.println("Saliendo del programa");

    }

}
