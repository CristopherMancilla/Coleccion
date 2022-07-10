/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.colecciones;

import java.util.ArrayList;
/**
 * @author Crsitopher Mancilla 
 */
public class Colecciones {

    public static void main(String[] args) {
        // creacion de un arreglo dinamico 
        ArrayList<Integer> muestra= new ArrayList();
        for (int i=0; i<11; i++) {
              muestra.add(i+1);
        }
      
        ArrayList lista= new ArrayList();
        lista.add("hola");
        lista.add(8);
        lista.add(2.7);
        // metodo para modifcar los elementos de un ArrayList
        lista.set(0, 9);
        
        ArrayList <String> materias= new ArrayList();
        materias.add("fisica");
        materias.add("matematicas");
        materias.add("lenguaje");
        materias.add("historia");
        String materias2[]= new String[3];
        materias.toArray();
        
        /* aplicacion del loop mejorado, sintaxis:
        for (tipoDato variable: coleccion) {
            //sentencias
        }*/
        
        for (String elemento: materias) {
            System.out.println(elemento);
        }
        System.out.println("");
        
        // para recorrer un ArrayList se usa el metodo get
        // para obtener el elemento en la posicion x
        
        for (int i=0; i<materias.size(); i++) {
            System.out.println(materias.get(i));
        }
        
        ArrayList<Integer> lista2= new ArrayList();
        lista2.add(4);
        lista2.add(6);
        
        int lista3 []= {4, 6, 8, 9};
        System.out.println("");
        System.out.println(lista3.toString());
        
        /*System.out.println(((Object)materias).getClass().getSimpleName());
        System.out.println(lista);
        System.out.println(lista.get(1));*/
        
        
            
    }
}
