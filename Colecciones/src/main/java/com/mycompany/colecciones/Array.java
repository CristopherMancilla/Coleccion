
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Crsitopher Mancilla
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Estructura de datos que nos permite almacenar un conjunto de datos de un mismo tipo
        // sintaxis Tipo_de_variable Nombre_array []= new Tipo_de_variable[dimension]
        // Un arreglo es una referencia a un objeto arreglo en memoria y pueden contener 
        // datos primitivos y datos de referencia
       
        // Ejemplo
        
        // creacion de un arreglo con 12 elementos de tipo entero
        // c almacena la referncia del objeto
        int c[]= new int[12];
        
        // se puede crear varios arreglos en una misma linea
        String[] b=new String[100], x= new String[27];
        
        // creacion e inicializacion de un arreglo
        int[] arreglo= new int[10];
        
        
        int enteritos[]= new int[4];
        // asignar elementos a un array vacio 
        enteritos[0]= 6;
        enteritos[1]= 8;
        enteritos[2]= 10;
        enteritos[3]= 11;
        
        // un array no puede cambiar su tamaño en tiempo de ejecucion
        int arreglo2[]= {3, 6, 8, 9, 7};
        
        // para recorrer cada elemento de un arreglo
        for(int i=0; i<enteritos.length; i++) {
            System.out.println(enteritos[i]);
 
        }
        
        
        // Cree un programa que construya un arreglo de 5 elementos y 
        //lo llene con los cuadrados de cada índice.
        System.out.println();
        double arreglo1[]= new double[5];
        double suma=0, contador=0, promedio=0;
        
        for (int i=0; i<arreglo1.length; i++) {
            arreglo1[i]= Math.pow(i, 2);
            suma+= arreglo[i];
            contador++;
            System.out.println(arreglo1[i]);
        }
        promedio= suma/contador;
        System.out.println("suma de los elementos del arreglo: " + suma);
        System.out.println("Promedio de los elementos del arreglo: " + promedio);
       
        // Llenar un arreglo con datos pedidos por pantalla 
        Scanner entrada= new Scanner(System.in);
        String nombres[]= new String[5];
        
        for (int i=0; i<nombres.length; i++) {
            System.out.println("Ingresar su nombre: ");
            String nombre= entrada.next();
            entrada.nextLine();
            nombres[i]= nombre;
        }
        
        int myInt= 10; 
        /*
        Sentencia para saber el tipo de dato
        System.out.println("tipo de dato de muInt: " + ((Object)myInt).getClass().getSimpleName());
        para verificar el tipo de dato se usa el operador de comparacion de tipo de dato
        instanceof*/
        
        int n= 0;
        for (int i= 0; i<nombres.length; i++) {
            if (nombres[i] instanceof String) {
                n++;
            }
        }
        
        if (n==5) {
            System.out.println("EL arreglo nombres se ha llenado con todos los nombres ");
        } else {
            System.out.println("EL arreglo nombres nose ha llenado con todos los nombres ");
        }
         
    }
    
    
}
