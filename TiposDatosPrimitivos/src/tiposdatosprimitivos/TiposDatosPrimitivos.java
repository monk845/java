/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdatosprimitivos;

/**
 *
 * @author mdeodanes
 */
public class TiposDatosPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variable de tipo de dato  byte almacena solo numeros enteros
        byte esByte;
        
        //Variables de tipo de dato float almacena decimales pero es necesario poner despues del valor ej. 12.35f poner f.
        float esFloat;
        
        //Variables de tipo de dato Double almacena decimales pero no es necesario poner f despues de valor.
        double esDouble;
        
        //Variable de tipo de dato char para caracter 
        char caracter;
        
        //Variable de tipo de dato booleano false, true , condicionales
        boolean decicion;
        
        esByte = 12;
        esFloat = 10.1f;
        esDouble = 12.12;
        caracter = 'A';
        decicion= true;
        
   
        
        System.out.println("El numero entero es  : "+ esByte);
        System.out.println("El numero decimal con float es : "+esFloat);
        System.out.println("El numero decimal con double es : "+esDouble);
        System.out.println("Esto es un caracter : "+caracter);
        System.out.println("La decicion es : "+ decicion);
    }
    
}
