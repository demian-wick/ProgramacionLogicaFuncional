package com.mycompany.contarhoras;

import java.util.Scanner;

public class ContarHoras {

    public static int horas(int hactual, int hsuma) {
        if (hactual < 24) {
            int cantidad = hactual + hsuma;
            if (cantidad >= 24) {
                cantidad = cantidad % 24;
                System.out.println("El reloj marca: "+cantidad);
            } else {
                System.out.println("El reloj marca: " + cantidad);
            }

        } else {
            System.out.println("Ingrese una hora validad.");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int horactual, hsu;
        System.out.println("Por favor ingrese la hora actual: ");
        horactual = leer.nextInt();
        System.out.println("Ingrese las horas a sumar: ");
        hsu = leer.nextInt();

        horas(horactual, hsu);
    }
}
