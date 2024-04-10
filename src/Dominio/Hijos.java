package Dominio;

public class Hijos {
	
	
	
	private String nomHijo;
	private int edad;
	private String correo;
	
	Padres padre;

	public Hijos() {
	}

	public Hijos(String nomHijo) {
		this.nomHijo = nomHijo;
	}

	public Hijos(String nomHijo, int edad, String correo, Padres padre) {
		this.nomHijo = nomHijo;
		this.edad = edad;
		this.correo = correo;
		this.padre = padre;
	}

	@Override
	public String toString() {
		return "Hijos [nomHijo=" + nomHijo + ", edad=" + edad + ", correo=" + correo + ", padre=" + padre + "]";
	}

	public String getNomHijo() {
		return nomHijo;
	}

	public void setNomHijo(String nomHijo) {
		this.nomHijo = nomHijo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Padres getPadre() {
		return padre;
	}

	public void setPadre(Padres padre) {
		this.padre = padre;
	}
	
	
}
