package com.mycompany.calcularmaxmin;


import java.util.Arrays;
import java.util.Scanner;

public class CalcularMaxMin {
    
    
   public static void calcularNumeros(int a){
       
       Scanner ingresar = new Scanner(System.in);
        System.out.println("Ingrese los valores a registrar");
        int[] valores = new int[a];
        
        for(int x=0;x<a;x++){
            System.out.printf("Ingrese el valor %d: \n",x+1);
            valores[x] = ingresar.nextInt();
        }
        
        Arrays.sort(valores);
        int maximo = valores[valores.length -1];
        int minimo = valores[0];
        
        System.out.printf("El valor minimo es: %d y el valor máximo es: %d \n", minimo,maximo);
    }
   
   
    public static void main(String[] args) {
        System.out.println("Ingrese el número de valores a consultar: ");
        Scanner obtener = new Scanner(System.in);
        int numero;
        numero = obtener.nextInt();
        
        calcularNumeros(numero);
        
        
    }
}
