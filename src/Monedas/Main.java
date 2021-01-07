/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monedas;

import java.util.ArrayList;

/**
 *
 * @author anita
 */
public class Main {
     public static void main(String[] args) {
        
         int S[] = {200, 100, 50, 6, 1};
         int K=S.length;
         int C=300;
         int monedas=1, monedasAux=C, suma=0;
         ArrayList<Integer> cambio = new ArrayList<Integer>();
         boolean oneChose=false;
         Object[] array = null;
         
         
         for(int i=0; i<K; i++)
         {
             if(S[i]==C)
             {
                monedas=1;
                oneChose=true;
                suma=S[i];
                cambio.add(S[i]);
                //break;
             }
             else if(S[i]<C)
             {
                 suma=S[i];
                 cambio.add(S[i]);
                 
                 for(int j=i; j<K; j++)
                 {
                     while(suma+S[j]<=C)
                    {
                        suma+=S[j];
                        monedas+=1;
                        cambio.add(S[j]);
                        
                    }
                     
                     if(suma>C)
                     {
                         suma-=S[j];
                         cambio.remove(cambio.size()); 
               
                     }
                 }
                 
                 
                 
             }
             
             if(suma==C)
                 {
                     System.out.println("Solucion: ");
                     System.out.println("Monedas totales: "+monedas);
                     System.out.println("Cambio de: ");
                     for(int p=0; p<cambio.size(); p++)
                     {
                         System.out.print(cambio.get(p)+",");
                     }
                     System.out.println("\n");
                     
                     if(monedas<monedasAux)
                     {
                        array = cambio.toArray();
                        monedasAux=monedas;
                     }
                     
                     cambio.clear();
                     suma=0;
                     monedas=1;
                 }
         }
         
         // imprimirDatos(array);
         
         if(oneChose==false)
         {
             imprimirDatos(array);
         }
         else
         {
             
                 System.out.println("Mejor solucion: ");
                 System.out.println("Una moneda de: "+C);
             oneChose=false;
         }
         
         
        
       
         
    }
     
     public static void imprimirDatos(Object[] array)
     {
         System.out.println("Mejor Solucion");
         System.out.println("Monedas: ");
         for(int i=0; i<array.length; i++)
         {
             if(i==array.length-1)
             {
                System.out.print(array[i]);
             }
             else
             {
               System.out.print(array[i]+",");  
             }
             
         }
         
     }
     
     
}
