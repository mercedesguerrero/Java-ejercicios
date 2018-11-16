/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Mechu
 */
public class Vehiculo {
    
    private int _ruedas;//dato encapsulado
    private int _largo;
    private int _ancho;
    private int _motor;
    private int _peso;
    private String _color;
    private boolean _butacas_premium;
    
    //-------CONSTRUCTOR----------
    
    public Vehiculo()
    {
        _ruedas= 4;
        _largo= 3;
        _ancho= 2;
        _motor= 1600;
        _peso= 550;
    }
    
    //--------GETTERS Y SETTERS----------

    public int getRuedas() {
        return _ruedas;
    }

    public void setRuedas(int _ruedas) {
        this._ruedas = _ruedas;
    }

    public int getLargo() {
        return _largo;
    }

    public void setLargo(int _largo) {
        this._largo = _largo;
    }

    public int getAncho() {
        return _ancho;
    }

    public void setAncho(int _ancho) {
        this._ancho = _ancho;
    }

    public int getMotor() {
        return _motor;
    }

    public void setMotor(int _motor) {
        this._motor = _motor;
    }

    public int getPeso() {
        return _peso;
    }

    public void setPeso(int _peso) {
        this._peso = _peso;
    }
    
    public void setColor(String color_auto) {
        _color= color_auto;//modifica el valor de un atributo
    }
    
    public String getColor() {
        return _color;
    }
    
    public void setButacas(String tiene) {
        
        if(tiene.equalsIgnoreCase("si"))//ignora mayus
        {
            this._butacas_premium= true;
        }
        else
        {
            this._butacas_premium= false;
        }
    }
    
    public String getButacas() {
        
        String retorno;
        
        if(_butacas_premium== true)
        {
            retorno= "El vehículo tiene butacas premium";
        }
        else
        {
            retorno= "El vehículo tiene butacas comunes";
        }
        
        return retorno;
    }
    
    //------MÉTODOS----------
    
    public void MostrarVehiculo()
    {
        System.out.println("Ruedas: " + this._ruedas + " || Largo: " + this._largo + 
                " || Ancho: " + this._ancho + " || Peso: " + this._peso + " || Motor: " + this._motor);
    }

    public int CalcularPrecioVehiculo()
    {
        int precio= 30000;
        
        if(_butacas_premium= true)
        {
            precio+= 7000;
        }
        
        return precio;
    }
    
    
}
