package Dominio;

public class Padres {


	private String nombrePadre;
	private int edad;
	private int numCelular;
	private int numHijos;
	
	
	public Padres() {
	}


	public Padres(String nombrePadre) {
		this.nombrePadre = nombrePadre;
	}


	public Padres(String nombrePadre, int edad, int numCelular, int numHijos) {
		this.nombrePadre = nombrePadre;
		this.edad = edad;
		this.numCelular = numCelular;
		this.numHijos = numHijos;
	}


	@Override
	public String toString() {
		return "Padres [nombrePadre=" + nombrePadre + ", edad=" + edad + ", numCelular=" + numCelular + ", numHijos="
				+ numHijos + "]";
	}


	public String getNombrePadre() {
		return nombrePadre;
	}


	public void setNombrePadre(String nombrePadre) {
		this.nombrePadre = nombrePadre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int getNumCelular() {
		return numCelular;
	}


	public void setNumCelular(int numCelular) {
		this.numCelular = numCelular;
	}


	public int getNumHijos() {
		return numHijos;
	}


	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}
	
	
	
	
	
}
