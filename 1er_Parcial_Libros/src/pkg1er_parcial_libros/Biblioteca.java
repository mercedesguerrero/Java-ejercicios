
package pkg1er_parcial_libros;

import java.util.ArrayList;

/**
 *
 * @author Mechu
 */
public class Biblioteca {
    
    private int _capacidadMaxima;
    private ArrayList<Libro> _libritos;
    
    public Biblioteca(int capacidadMax)
    {
        this();
        this._capacidadMaxima= capacidadMax;
    }
    
    private Biblioteca()
    {
        this._libritos= new ArrayList<>();
    }

    public int getCapacidadMaxima() {
        return _capacidadMaxima;
    }

    public ArrayList<Libro> getLibritos() {
        return _libritos;
    }
    
    int len= _libritos.size();
    
    private boolean EstaEnBiblioteca(Libro unLibro)
    {
        boolean retorno = false;
        
        for (Libro miLibrito : _libritos)
        {
            if(Libro.CompararLibros(miLibrito, unLibro))
            {
                retorno = true;
                break;
            }
        }
        
        return retorno;
    }
    
    public boolean AgregarLibro(Libro unLibro)
    {
        boolean retorno= false;
        
        if (!EstaEnBiblioteca(unLibro) && this._libritos.size() <= this._capacidadMaxima)
        {
            this._libritos.add(unLibro);
            retorno= true;
        }
            
        return retorno;
    }
    
    public float getPrecio_de_Manuales() {
        return (float) this.ObtenerPrecio(ELibro.Manual);
    }
    
    public float getPrecio_de_Novelas() {
        return (float) this.ObtenerPrecio(ELibro.Novela);
    }
    
    public float getPrecio_total() {
        return (float) this.ObtenerPrecio(ELibro.Total);
    }
    
    private float ObtenerPrecio(ELibro tipo)
    {
        float precio_total= 0;
        
        for (Libro miLibrito : _libritos)
        {
            switch (tipo)
            {
                case Manual:
                    if (miLibrito instanceof Manual)
                    {
                        precio_total += miLibrito._precio;
                    }
                    break;
                case Novela:
                    if (miLibrito instanceof Novela)
                    {
                        precio_total += miLibrito._precio;
                    }
                    break;
                case Total:
                    precio_total += miLibrito._precio;
                    break;
            }
    }
        return precio_total;
    }
    
    public String MostrarBiblioteca(Biblioteca unaBiblioteca)
    {
        StringBuilder miCadena= new StringBuilder();
        
        for (Libro miLibrito : unaBiblioteca._libritos)
        {
            miCadena.append(miLibrito);
        }
        
        return miCadena.toString();
    }
    
}
