/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author Mechu
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Vehiculo Ferrari= new Vehiculo();
        Vehiculo Lamborghini= new Vehiculo();
        
        System.out.println("----------FERRARI--------------");
        //System.out.println("El auto tiene " + Ferrari.getRuedas() + " ruedas");
        Ferrari.setColor("rojo");
        System.out.println("Color: " + Ferrari.getColor());
        Ferrari.MostrarVehiculo();
        Ferrari.setButacas("si");
        System.out.println(Ferrari.getButacas());
        System.out.println("Precio: " + Ferrari.CalcularPrecioVehiculo());
        
        System.out.println("----------LAMBORGHINI------------");
        Lamborghini.setColor(JOptionPane.showInputDialog("Ingrese color: "));//showInputDialog --> es un método estático, se usa con la clase precediendo
        System.out.println("Color: " + Lamborghini.getColor());
        Lamborghini.MostrarVehiculo();
        Lamborghini.setButacas(JOptionPane.showInputDialog("¿Tiene butacas premium? "));
        System.out.println(Lamborghini.getButacas());
        System.out.println("Precio: " + Lamborghini.CalcularPrecioVehiculo());
        
        
    }
    
}
