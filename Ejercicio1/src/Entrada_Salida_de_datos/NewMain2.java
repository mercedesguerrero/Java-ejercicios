/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrada_Salida_de_datos;

import javax.swing.JOptionPane;

/**
 *
 * @author Mechu
 */
public class NewMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre_usuario2= JOptionPane.showInputDialog("Nombre: ");
        String edad_2= JOptionPane.showInputDialog("Edad: ");// porq este método develve un string
        
        int edad_usuario= Integer.parseInt(edad_2);
        System.out.println("Hola " + nombre_usuario2 + " el próximo año vas a tener " + (edad_usuario+1) + " años");
    }
    
}
