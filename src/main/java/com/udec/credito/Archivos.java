/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.credito;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tatiana Moreno Andres Chila
 */
public class Archivos {
    public void crearArchivo(List<Persona> persona){
        try{
            File arch=new File("Archivo/persona");
            if (!arch.exists()) 
		arch.createNewFile();
            FileOutputStream archivo=new FileOutputStream(arch);
            ObjectOutputStream objeto=new ObjectOutputStream(archivo);
            objeto.writeObject(persona);
            objeto.close();
            archivo.close();
        }catch (Exception io){
            System.err.println(io);
            System.out.println(io);
        }
    }

    /**
     *
     * @return
     */
    public List<Persona> devolverPersona(){
            List<Persona> listaPersonas=null;
            try{
                FileInputStream archivo=new FileInputStream("Archivo/persona");
                ObjectInputStream objeto=new ObjectInputStream(archivo);
                listaPersonas=(ArrayList) objeto.readObject();
                objeto.close();
                archivo.close();
            }catch (IOException | ClassNotFoundException io){
            }
           return listaPersonas;          

        }
                 
        public List<TipoAntecedente> devolverTipos(){

        List<TipoAntecedente> listaTiposAntecedentes=null;

        try{

            FileInputStream archivo=new FileInputStream("Archivos/listaTipoAntecedentes");
            ObjectInputStream objeto=new ObjectInputStream(archivo);
            listaTiposAntecedentes=(ArrayList) objeto.readObject();
            objeto.close();
            archivo.close();
        }catch (IOException | ClassNotFoundException io){
        }

       return listaTiposAntecedentes;          

    }
        public void crearArchivoTipoA(List<TipoAntecedente> tipo){

        try{

            File arch=new File("sArchivos/listaTipoAntecedentes");
            if (!arch.exists()) 
		arch.createNewFile();
            FileOutputStream archivo=new FileOutputStream(arch);
            ObjectOutputStream objeto=new ObjectOutputStream(archivo);
            objeto.writeObject(tipo);
            objeto.close();
            archivo.close();
        }catch (Exception io){

            System.out.println(""+io);

        }

                 

    }

    
}
