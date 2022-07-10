/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.colecciones;

/**
 * @author Crsitopher Mancilla
 */
public class Wrappers {

   
    public static void main(String[] args) {
        // Los wrappers o clases envolventes
        // son clases cuyos objetos son variables primitivas
        // para crear un objeto tipo Wrapper se usa la misma sintaxis que 
        // para cualquier otra clase
        
        Integer numero= 45;
        Boolean soltero= true;
        // Crear un objeto wrapper a partir de un dato primitivo
        String x= "4.5f";
        Float y= Float.valueOf(x);
        
        // autoboxing automático, primitivos ---> Wrappers
        
        Integer arreglo[]= new Integer[6];
        for (int i=0; i<arreglo.length; i++) {
           arreglo[i]= i*2; 
           
        }
       
    //Métodos de instancia para obtener un tipo de dato primitivo. 
    
    Integer valor= 23;
    short s= valor.shortValue();
    double dou= valor.doubleValue();
    
    // Crea un objeto wrapper a partir de un tipo primitivo.
    // metodo de clase
    Double d1= Double.valueOf("45");
    Float f1= Float.valueOf("67.8f");

    // metodo toString
    //Retorna un String con el valor del primitivo que se encuentra dentro del objeto contenedor
    
    Double d= 3.14;
    System.out.println(d.toString());
    System.out.println("");
    System.out.println("");
        
    Double lista []= new Double[6]; 
    for (int j=0; j<lista.length; j++) {
        lista[j]= Math.sqrt(j);
        System.out.println(lista[j]);
    }
    
    
    double lista2 [][]= new double[10][10];
    
    for (int i=0; i<lista2.length; i++) {
        
        for (int j=0; j<lista2[0].length; j++ ) {
            lista2[i][j]= i+j;
            System.out.println(lista2[i][j]);
        } 
    }
    
    
    
    }
    
    // unboxing automático, Wrappers ---> primitivos 
    // en este caso de Integer a int
    public static int suma(Integer valores[]) {
        int sum=0; 
        // for loop mejorado, recorre por elementos 
        for (Integer i: valores) {
            if (i % 2==0) {
                sum+= i;
            }
        }  
        return sum;
    }  
     
}
