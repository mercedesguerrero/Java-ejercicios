
package pkg1er_parcial_libros;

/**
 *
 * @author Mechu
 */
public class Autor {
    
    private String _apellido;
    private String _nombre;

    public Autor(String _nombre, String _apellido) 
    {
        this._nombre = _nombre;
        this._apellido = _apellido;
    }
    
    public String getApellido() {
        return _apellido;
    }
    
    public String getNombre() {
        return _nombre;
    }
    
    //Si los nombres y apellidos son iguales, retorna TRUE.
    public static boolean CompararAutores(Autor autor1, Autor autor2)
    {
        boolean retorno= false;
        
        if(autor1.getApellido().equalsIgnoreCase(autor2.getApellido()) && autor1.getNombre().equalsIgnoreCase(autor2.getNombre()))
        {
            retorno= true;
        }
        
        return retorno;
    }
    
    public static String Mostrar(Autor autor)
    {
        StringBuilder miCadena= new StringBuilder();
        
        miCadena.append(autor._apellido).append(" ").append(autor._nombre);
    
        return miCadena.toString();
    }
    
}
