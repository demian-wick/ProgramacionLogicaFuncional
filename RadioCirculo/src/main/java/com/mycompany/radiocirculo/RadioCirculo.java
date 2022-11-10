/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.radiocirculo;



/**
 *
 * @author anton
 */
public class RadioCirculo {

    public RadioCirculo(float radio) {
        float a = (float)((radio * radio) * 3.1416);
        System.out.printf("Área: %f \n",a);
    }
    
        public static float Perimetro(float radio){
        float p = (float)((radio * 2)*3.1416);
        System.out.printf("Perimetro: %f \n",p);
        return 0;
    }

    
    public static void main(String[] args) {
        float rad = 5;
        RadioCirculo a = new RadioCirculo(rad);
        Perimetro(rad);
    }
}
