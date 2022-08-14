/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptionpanel;

import javax.swing.JOptionPane;

/**
 *
 * @author mdeodanes
 */
public class JOptionPanel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String nombre;
        int edad;
        double altura;

//Capturar datos
        nombre = JOptionPane.showInputDialog("Dijite su nombre :");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Dijite su edad :"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Dijite su altura :"));

        //Mostrar datos
        JOptionPane.showMessageDialog(null, "Su nombre es : " + nombre);
        JOptionPane.showMessageDialog(null, "Su edad es : " + edad);
        JOptionPane.showMessageDialog(null, "Su altura es : " + altura);

    }

}
