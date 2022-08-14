/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularnota;

import java.util.Scanner;

/**
 *
 * @author mdeodanes
 */
public class CalcularNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        double tarea, parcialPractico, ParcialTeorico, suma, promedio;

        System.out.println("Ingrese la nota de la tarea :");
        tarea = entrada.nextDouble();

        System.out.println("Ingrese la nota del parcial teorico :");
        ParcialTeorico = entrada.nextDouble();

        System.out.println("Ingrese la nota del parcial practico :");
        parcialPractico = entrada.nextDouble();

        /*System.out.println("Ingrese la nota 3 :");
        nota3 = entrada.nextDouble();
         */
        suma = tarea + ParcialTeorico  + parcialPractico;
        promedio = suma / 3;

        if (promedio >= 7) {

            System.out.println("El alumno aprobo el ciclo con  : " + promedio);

        } else {

            System.out.println("El alumno reprobo el ciclo con : " + promedio);
        }

    }

}
