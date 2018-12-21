
package pkg1er_parcial_libros;

/**
 *
 * @author Mechu
 */
public class Manual extends Libro{
    
    protected ETipo _tipo;
    
    public Manual(String titulo, float precio, Autor autor, ETipo tipo)
    {
        super(titulo, precio, autor);
        this._tipo= tipo;
    }
    
    public String Mostrar()
    {
        StringBuilder miCadena= new StringBuilder();
        
        miCadena.append(super.Mostrar(this));//Libro.Mostrar(this)
        miCadena.append("Tipo: ").append(this._tipo);
        
        return miCadena.toString();
    }
    
    //Si el manual y el tipo son iguales, retorna TRUE.
    public static boolean CompararManuales(Manual unManual, Manual otroManual)
    {
        boolean retorno= false;
        
        if(unManual._tipo == otroManual._tipo)
        {
            if(Libro.CompararLibros(unManual, otroManual))
            {
                retorno= true;
            }
        }
        
        return retorno;
    }
    
}
