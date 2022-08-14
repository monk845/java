/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciaswitchcase;

import javax.swing.JOptionPane;

/**
 *
 * @author mdeodanes
 */
public class SentenciaSwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dato;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Dijite un numero entre 1 y 3"));
        
        switch(dato){
        
            case 1: JOptionPane.showMessageDialog(null, "Numero elegido 1");
            break;
            
            case 2: JOptionPane.showMessageDialog(null, "Numero elegido 2");
            break;
            
            case 3: JOptionPane.showMessageDialog(null, "Numero elegido 3");
            break;
            
            default : JOptionPane.showMessageDialog(null, "El numero no esta en el rango del 1 al 3");
        }
        
    }
    
}
