
package pkg1er_parcial_libros;

import java.util.Random;

/**
 *
 * @author Mechu
 */
public class Libro {
    protected Autor _autor;
    protected int _cant_de_paginas;
    protected float _precio;
    protected String _titulo;
    protected static Random _generadorDePaginas;
    
    public Libro()
    {
        _generadorDePaginas= new Random();
        this._cant_de_paginas= _generadorDePaginas.nextInt(580+1-10);
    }
    
    public Libro(Autor autor)
    {
        this();
        this._autor= autor;
    }
    
    public Libro(String titulo, float precio, Autor autor)
    {
        this(autor);
        this._precio= precio;
        this._titulo= titulo;
    }

    public float getPrecio() {
        return _precio;
    }

    public int getCant_de_paginas() {
        return _cant_de_paginas;
    }
    
    /*
    private static int Generador_de_paginas()
    {   
        int retorno=0;
        Random r = new Random();
        
        retorno= r.nextInt((580 - 10) + 1) + 10;
     
        return retorno;
    }
    **/
    public static String Mostrar(Libro unLibro)
    {
        StringBuilder miCadena= new StringBuilder();
        
        miCadena.append(" || Titulo: ").append(unLibro._titulo);
        miCadena.append("Autor: ").append(Autor.Mostrar(unLibro._autor));
        miCadena.append(" || Cantidad de paginas: ").append(unLibro.getCant_de_paginas());
        miCadena.append(" || Precio: ").append(unLibro.getPrecio());
        
        return miCadena.toString();
    }
    
    //Si el titulo y el autor son iguales, retorna TRUE.
    public static boolean CompararLibros(Libro libro1, Libro libro2)
    {
        boolean retorno= false;
        
        if(libro1._titulo.equalsIgnoreCase(libro2._titulo)) 
        {
            if(Autor.CompararAutores(libro1._autor, libro2._autor))
            {
                retorno= true;
            }  
        }
        
        return retorno;
    }
      
}
