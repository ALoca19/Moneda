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
public class Codigo {
    
    public long tInicio;
    public long tFinal;
    public long tTotal;

    public Codigo() {
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0 ;
    }
    
    //GETTERS
    public long gettFinal() {
        return tFinal;
    }

    public long gettInicio() {
        return tInicio;
    }

    public long gettTotal() {
        return tTotal;
    }
   
    //TIEMPO E INICIO DEL PROGRAMA
   
    public void fRecursivo(int n){
        this.tInicio = System.currentTimeMillis();
        fibonacciRecursivo(n);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }
    
    public void fIteractivo(int n){
        this.tInicio = System.currentTimeMillis();
        fibonacciIteractivo(n);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }
    
    public void fRecursivoDinamico(int n){
        this.tInicio = System.currentTimeMillis();
        fiboonacciDinamicoRecursivo(n);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }
    
    public void fIteractivoDinamico(int n){
        this.tInicio = System.currentTimeMillis();
        fiboonacciDinamicoIteractivo(n);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }
    
    
    //Solucion Recursiva
    
    public  int fibonacciRecursivo (int n){
        
        if((n==0) || (n==1))
        {
            return 1;
        }
            
        else
        {
            return fibonacciRecursivo(n-1)+fibonacciRecursivo(n-2); 
        }
            
        
    }
    
    //Fiboonacci Iteractivo
    
    public  int fibonacciIteractivo (int n){
        
        int actual=0, ant1, ant2;
        ant1=ant2=1;
        
        if((n==0) || (n==1))
        {
            actual = 1;
        }
            
        else
        {
            for(int i=2; i<=n; i++)
            {
                actual = ant1+ ant2;
                ant2=ant1;
                ant1=actual;
                
              //  System.out.println(actual);
                
            }
           // System.out.println("");
        }
            
        return actual;
    }
    
   
    //Fiboonacci dinamico recursivo
    int fiboonacciDinamicoRecursivo(int n) 
    {
        
        int [] fibTab = new int[n+1];
        
        for(int i=0;i<n;i++)
        {
            fibTab[i]= -1;
        }
        
        return lookupFib(fibTab,n);
    }
     
   
   
   int lookupFib(int fibTab[],int n)
   {
       
           if (fibTab[n]!= -1) 
            {
                return fibTab[n];
            }
       
       
       
       fibTab[n]=lookupFib(fibTab,n-1)+lookupFib(fibTab,n-2);
       return fibTab[n];
   }

    
    
    
    //Fiboonacci dinamico Iteractivo
    int fiboonacciDinamicoIteractivo(int n)
    {
        int [] fibTab = new int[n];
        
        
            if(n<=1)
            {
                return 1;
                
            }
            else
            {
                fibTab[0]=fibTab[1]=1;
           
                for(int i=2; i<n; i++) //for(int i=2;i<=n;i++)
                {
                    fibTab[i]=fibTab[i-1]+fibTab[i-2];
                } 
                
                return fibTab[n-1];
            }
           
        
    }
    
    
    
    
}
