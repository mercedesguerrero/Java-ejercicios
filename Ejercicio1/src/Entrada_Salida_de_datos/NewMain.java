/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrada_Salida_de_datos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Mechu
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Nombre: ");
        String nombre_usuario= entrada.nextLine();
        
        System.out.println("Edad: ");
        int edad= entrada.nextInt();
        
        System.out.println("Hola " + nombre_usuario + " el próximo año vas a tener " + (edad+1) + " años");
        
       
    }
    
}
