package Implementacion;

import java.util.HashMap;

import Dominio.Hijos;
import Dominio.Padres;
import Interface.Metodos;

public class Implementacion implements Metodos {

	
	HashMap<String, Padres> hashMapPadres = new HashMap<String, Padres>();
	HashMap<String, Hijos> hashMapHijos = new HashMap<String, Hijos>();
	
	
	Padres padre = null;
	Hijos hijo = null;
	
	//variable global
	Object objEncontrado = null;
	
	
	
	@Override
	public void guardar(Object obj, String nombreClase) {
		// TODO Auto-generated method stub
		
		if(nombreClase.equals("padre")) {
			
			//casteo
			padre = (Padres)obj;
			hashMapPadres.put(padre.getNombrePadre(), padre);
			
		}else if(nombreClase.equals("hijo")) {
			
			//casteo
			hijo = (Hijos)obj;
			hashMapHijos.put(hijo.getNomHijo(), hijo);
			
		}
		
	}

	@Override
	public void listarPadres() {
		// TODO Auto-generated method stub
		System.out.println(hashMapPadres);
		
	}

	@Override
	public void listarHijos() {
		// TODO Auto-generated method stub
		System.out.println(hashMapHijos);
		
	}

	@Override
	public Object buscar(Object obj, String nombreClase) {
		// TODO Auto-generated method stub
		
		if(nombreClase.equals("padre")) {
			
			//casteo
			padre = (Padres) obj;
			objEncontrado = hashMapPadres.get(padre.getNombrePadre());
		
		}else if(nombreClase.equals("hijo")) {
			
			hijo = (Hijos)obj;
			objEncontrado = hashMapHijos.get(hijo.getNomHijo());
		}
		
		return objEncontrado;
	}

	@Override
	public void editar(Object obj, String nombreClase) {
		// TODO Auto-generated method stub
		
		if(nombreClase.equals("padre")) {
			
			padre = (Padres) obj;
			hashMapPadres.put(padre.getNombrePadre(), padre);
			
		}else if(nombreClase.equals("hijo")) {
			
			hijo = (Hijos) obj;
			hashMapHijos.put(hijo.getNomHijo(), hijo);
			
		}
		
		
		
	}

	@Override
	public void eliminar(Object obj, String nombreClase) {
		// TODO Auto-generated method stub
		if(nombreClase.equals("padre")) {
			
			padre = (Padres) obj;
			hashMapPadres.remove(padre.getNombrePadre());
		}else if(nombreClase.equals("hijo")) {
			
			hijo = (Hijos) obj;
			hashMapHijos.remove(hijo.getNomHijo());		}
		
	}

}
