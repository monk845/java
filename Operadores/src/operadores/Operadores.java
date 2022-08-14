/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author mdeodanes
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        //Asignamos las variables
        int numero1, numero2;
        double division, resta, multiplicacion, suma;

        //Pedimos los datos por consola numero1 y numero 2
        System.out.println("Dijite el primer numero entero");
        numero1 = entrada.nextInt();

        System.out.println("Digite el segundo numero entero");
        numero2 = entrada.nextInt();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        division = numero1 / numero2;
        multiplicacion = numero1 * numero2;

        // declaracion para operadors arimeticos combinados
        int OpeadorCombinado = 10;

        OpeadorCombinado += 5;
        OpeadorCombinado *= 10;
        OpeadorCombinado -= 5;

        //Declaracion de operados incremente y decremento
        int incremento = 10;

        //se suma uno en uno
        incremento++;

        //decremento resta uno en uno
        int decremento = 10;

        //
        decremento--;

        System.out.println("La suma es : " + suma);
        System.out.println("La resta es : " + resta);
        System.out.println("La division es : " + division);
        System.out.println("La multiplicacion es : " + multiplicacion);

        System.out.println("Numero combinado es : " + OpeadorCombinado);

        System.out.println("Incremento es :" + incremento);
        System.out.println("Decremento es :" + decremento);

    }

}
