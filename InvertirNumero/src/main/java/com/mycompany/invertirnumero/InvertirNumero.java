package com.mycompany.invertirnumero;
import java.util.Scanner;

public class InvertirNumero {
    
public static int Invertir(int numero){
    if(numero >= 100 && numero < 1000){
        int n = numero % 10;
        int nu = numero / 10;
        nu = nu % 10;
        int nf = numero / 100;
        nf = nf % 10;
        System.out.printf("Invertido: %d%d%d \n",n,nu,nf);
    }else{
        System.out.println("Ingrese un número valido");
    }
    return 0;
}
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un número de 3 cifras:");
        numero = leer.nextInt();
        Invertir(numero);
    }
}
