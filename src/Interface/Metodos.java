package Interface;

public interface Metodos {

	
public void guardar(Object obj, String nombreClase);
	
	public void listarPadres();
	
	public void listarHijos();
	
	public Object buscar(Object obj, String nombreClase);
	
	public void editar(Object obj, String nombreClase);
	
	public void eliminar(Object obj, String nombreClase);
	
}
