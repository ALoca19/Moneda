/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci;

/**
 *
 * @author anita
 */
public class Main {
     public static void main(String[] args) {
        
         int n = 5;
       // int[] aux;
        double[] tiempos = new double[n];
        double[] tiempo2 = new double[n];
        double[] tiempos3 = new double[n];
        double[] tiempo4 = new double[n];
        
        Codigo fiboR = new Codigo();
        Codigo fiboI = new Codigo();
        Codigo fiboRD = new Codigo();
        Codigo fiboID = new Codigo();
       
        for (int j = 0; j < n; j++){
            //fiboR.fRecursivo(j);
            fiboI.fIteractivo(j);
            fiboRD.fRecursivoDinamico(j);
            fiboID.fIteractivoDinamico(j);
            
            tiempos[j] = (int) fiboR.gettTotal();
            tiempo2[j]=(int) fiboI.gettTotal();
            tiempos3[j] = (int) fiboRD.gettTotal();
            tiempo4[j]=(int) fiboID.gettTotal();
            System.out.println(j);
            
        }
        
        
        System.out.println();
        Grafica g1 = new Grafica("N","Tiempo","Tiempos");
        g1.agregarSerie("Tiempo Recursivo",tiempos);
        g1.agregarSerie("Tiempo iterativo",tiempo2);
        g1.agregarSerie("Tiempo Recursivo Dinamico",tiempos3);
        g1.agregarSerie("Tiempo iterativo Dinamico",tiempo4);
        g1.crearGrafica();
        g1.muestraGrafica();
            
         
    }
}
