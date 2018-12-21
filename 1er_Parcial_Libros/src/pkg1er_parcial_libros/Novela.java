
package pkg1er_parcial_libros;

/**
 *
 * @author Mechu
 */
public class Novela extends Libro{
    
    protected EGenero _genero;
    
    public Novela(String titulo, float precio, Autor autor, EGenero genero)
    {
        super(titulo, precio, autor);
        this._genero= genero;
    }
    
    public String Mostrar()
    {
        StringBuilder miCadena= new StringBuilder();
        
        miCadena.append(super.Mostrar(this));
        miCadena.append("Genero: ").append(this._genero);
        
        return miCadena.toString();
    }
    
    //Si el manual y el tipo son iguales, retorna TRUE.
    public static boolean CompararNovelas(Novela unaNovela, Novela otraNovela)
    {
        boolean retorno= false;
        
        if(unaNovela._genero == otraNovela._genero)
        {
            if(Libro.CompararLibros(unaNovela, otraNovela))
            {
                retorno= true;
            }
        }
        
        return retorno;
    }
}
