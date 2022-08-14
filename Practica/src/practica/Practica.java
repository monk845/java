/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author mdeodanes
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Pedir nombre y calcular la edad 

        Scanner enter = new Scanner(System.in);

        String nombre = null, apellido = null;
        int anioNac =0, edad =0, anioAc = 2022;

        try {

            System.out.println("Cual es su nombre : ");
            nombre = enter.nextLine();

            System.out.println("Cual es su apellido : ");
            apellido = enter.nextLine();

            System.out.println("Dijite el año en el que nacio ej. 1997 : ");
            anioNac = enter.nextInt();

            edad = (anioAc - anioNac);

        } catch (Exception e) {
            
            System.out.println("Dijite un valor valido");
        }
        
        System.out.println("Su nombre es : " + nombre + " " + apellido);

        if (edad >= 18) {

            System.out.println("Husted es mayor de edad : " + edad);

        } else {

            System.out.println("Husted no es mayor de edad : " + edad + " " + "Años");
        }
    }

}
