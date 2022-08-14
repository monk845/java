/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciaif;

import javax.swing.JOptionPane;

/**
 *
 * @author mdeodanes
 */
public class SentenciaIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        
        == : Igualdad
        != : Distinto de o diferente de
        >  : Mayor que
        <  : Menor que 
        >= : Mayor o gual que
        >= : Menor o igual que
        */

        int numero;
        final int dato = 10;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero mayor o igual que 10 :"));

        if (numero >= dato) {

            JOptionPane.showMessageDialog(null, "El numero dijitado concuerda con la condicions : " + dato);

        } else {
            JOptionPane.showMessageDialog(null, "El numero dijitado no concuerda con la condicion >= : " + dato);

        }

    }

}
