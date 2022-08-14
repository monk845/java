/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradasalidadatosporconsola;

import java.util.Scanner;

/**
 *
 * @author mdeodanes
 */
public class EntradaSalidaDatosPorConsola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //
        Scanner entrada1 = new Scanner(System.in);
        int NumeroEntero;
        
        System.out.println("Dijite un numero entero : ");
        NumeroEntero = entrada1.nextInt();
        
        //
        Scanner entrada2 = new Scanner(System.in);
         float NumeroFloat;

        System.out.println("Dijite un numero float : ");
        NumeroFloat = entrada2.nextFloat();
        
        //
        Scanner entrada3 = new Scanner(System.in);
        double NumeroDouble;
        
         System.out.println("Dijite un numero double");
         NumeroDouble = entrada3.nextDouble();
        
         //
         Scanner entrada4 = new Scanner(System.in);
         String StrinNombre;
         
         System.out.println("Dijite una cadena : ");
         StrinNombre = entrada4.nextLine();
        
        System.out.println("El numero entero dijitado es : "+NumeroEntero);
        System.out.println("El numero float dijitado es : "+NumeroFloat);
        System.out.println("El numero double dijitado es : "+NumeroDouble);
        System.out.println("La cadena dijitada es : "+StrinNombre);
        
        
    }
    
}
