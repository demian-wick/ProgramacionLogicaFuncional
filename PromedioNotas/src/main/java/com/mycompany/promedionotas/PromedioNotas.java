package com.mycompany.promedionotas;
import java.util.Scanner;
public class PromedioNotas {

    public static float Promedio(float n1, float n2, float n3, float n4){
        float p = (float)((n1+n2+n3+n4)/4);
        return p;
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float num1,num2,num3,num4;
        System.out.println("Ingrese la primera calificación: \n");
        num1 = leer.nextFloat();
        System.out.println("Ingrese la segunda calificación: \n");
        num2 = leer.nextFloat();
        System.out.println("Ingrese la tercera calificación: \n");
        num3 = leer.nextFloat();
        System.out.println("Ingrese la cuarta calificación: \n");
        num4 = leer.nextFloat();
        
        System.out.printf("El promedio es: %f",Promedio(num1,num2,num3,num4));
    }
}
