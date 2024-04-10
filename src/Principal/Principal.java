package Principal;

import java.util.Scanner;

import javax.management.modelmbean.ModelMBeanOperationInfo;

import Dominio.Hijos;
import Dominio.Padres;
import Implementacion.Implementacion;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lectura = null;

		String nombrePadrep;
		int edadp;
		int numCelularp;
		int numHijosp;

		Padres padre;

		String nomHijoh;
		int edadh;
		String correoh;

		Hijos hijo;

		int menuPrincipal, menuPadres, menuHijos;

		Implementacion imp = new Implementacion();

		do {

			System.out.println("MENU PRINCIPAL");
			System.out.println("1--PADRES");
			System.out.println("2--HIJOS");
			System.out.println("3--SALIR");
			lectura = new Scanner(System.in);
			menuPrincipal = lectura.nextInt();

			switch (menuPrincipal) {
			case 1:

				do {
					System.out.println("CRUD PADRES");
					System.out.println("1--ALTA");
					System.out.println("2--LISTAR");
					System.out.println("3--BUSCAR");
					System.out.println("4--EDITAR");
					System.out.println("5--ELIMINAR");
					System.out.println("6--REGRESAR");
					lectura = new Scanner(System.in);
					menuPadres = lectura.nextInt();

					switch (menuPadres) {
					case 1:

						System.out.println("INGRESE EL NOMBRE DEL PADRE:  ");
						lectura = new Scanner(System.in);
						nombrePadrep = lectura.nextLine();

						System.out.println("INGRESE LA EDAD:   ");
						lectura = new Scanner(System.in);
						edadp = lectura.nextInt();

						System.out.println("INGRESE EL NUMERO TELEFONICO:   ");
						lectura = new Scanner(System.in);
						numCelularp = lectura.nextInt();

						System.out.println("INGRESE NUMERO DE HIJOS:   ");
						lectura = new Scanner(System.in);
						numHijosp = lectura.nextInt();

						padre = new Padres(nombrePadrep, edadp, numCelularp, numHijosp);

						imp.guardar(padre, "padre");

						System.out.println("SE GUARDO CORRECTAMENTEE");
						break;
					case 2:

						imp.listarPadres();
						break;
					case 3:

						System.out.println("INGRESE EL NOMBRE DEL PADRE:  ");
						lectura = new Scanner(System.in);
						nombrePadrep = lectura.nextLine();

						padre = new Padres(nombrePadrep);
						padre = (Padres) imp.buscar(padre, "padre");
						System.out.println("SE ENCONTRO:  " + padre);
						break;
					case 4:

						System.out.println("INGRESE EL NOMBRE DEL PADRE A EDITAR:  ");
						lectura = new Scanner(System.in);
						nombrePadrep = lectura.nextLine();

						padre = new Padres(nombrePadrep);
						padre = (Padres) imp.buscar(padre, "padre");
						System.out.println("SE ENCONTRO:  " + padre);

						int subMenu;

						do {

							System.out.println("SUBMENU PARA EDITAR ");
							System.out.println("1--EDAD");
							System.out.println("2--NUMERO DE HIJOS ");
							System.out.println("3--REGRESAR ");
							lectura = new Scanner(System.in);
							subMenu = lectura.nextInt();

							switch (subMenu) {
							case 1:

								System.out.println("INGRESE LA NUEVA EDAD:  ");
								lectura = new Scanner(System.in);
								edadp = lectura.nextInt();

								// actualizar

								padre.setEdad(edadp);
								imp.editar(padre, "padre");
								System.out.println("SE EDITO CORRECTAMENTE");

								break;

							case 2:

								System.out.println("INGRESE LOS HIJOS  ");
								lectura = new Scanner(System.in);
								numHijosp = lectura.nextInt();

								// actualizar

								padre.setNumHijos(numHijosp);
								imp.editar(padre, "padre");
								System.out.println("SE EDITO CORRECTAMENTE");

								break;

							case 3:
								System.out.println("REGRESANDO AL MENU PADRES");
								break;

							}

						} while (subMenu < 3);

						break;
					case 5:

						System.out.println("INGRESE EL NOMBRE A ELIMINAR  ");
						lectura = new Scanner(System.in);
						nombrePadrep = lectura.nextLine();

						padre = new Padres(nombrePadrep);
						imp.eliminar(padre, "padre");
						System.out.println("SE ELIMINO CON EXTO");
						break;
					case 6:

						System.out.println("REGRESANDO AL MENU PRINCIPAL");
						break;

					}

				} while (menuPadres < 6);

				break;

			case 2: // -------CRUD hIJOS

				do {

					System.out.println("CRUD HIJOS");
					System.out.println("1--ALTA");
					System.out.println("2--LISTAR");
					System.out.println("3--BUSCAR");
					System.out.println("4--EDITAR");
					System.out.println("5--ELIMINAR");
					System.out.println("6--REGRESAR");
					lectura = new Scanner(System.in);
					menuHijos = lectura.nextInt();

					switch (menuHijos) {
					case 1:

						System.out.println("INGRESE EL NOMBRE DEL HIJO: ");
						lectura = new Scanner(System.in);
						nomHijoh = lectura.nextLine();

						System.out.println("INGRESE LA EDAD DEL HIJO:  ");
						lectura = new Scanner(System.in);
						edadh = lectura.nextInt();

						System.out.println("INGRESE EL CORREO:   ");
						lectura = new Scanner(System.in);
						correoh = lectura.nextLine();
						
						imp.listarPadres();
						
						System.out.println("INGRESE EL NOMBRE DEL PADRE: ");
						lectura = new Scanner(System.in);
						nombrePadrep = lectura.nextLine();
						
						//
						padre = new Padres(nombrePadrep);
						
						padre = (Padres) imp.buscar(padre, "padre");
						
						hijo = new Hijos(nomHijoh, edadh, correoh, padre);
						
						imp.guardar(hijo, "hijo");
						System.out.println("SE GUARDO CORRECTAMENTE");
						
						break;
						
						
					case 2:

						imp.listarHijos();
						break;
						
						
					case 3:

						System.out.println("INGRESE EL NOBRE DE HIJO A BUSCAR: ");
						lectura = new Scanner(System.in);
						nomHijoh = lectura.nextLine();
						
						
						//buscar						
						hijo = new Hijos(nomHijoh);
						hijo = (Hijos) imp.buscar(hijo, "hijo");
						System.out.println("SE ENCONTRO: " + hijo);
						break;
						
						
					case 4:

						System.out.println("INGRESE EL NOBRE DE HIJO A EDITAR: ");
						lectura = new Scanner(System.in);
						nomHijoh = lectura.nextLine();
						
						
						//buscar						
						hijo = new Hijos(nomHijoh);
						hijo = (Hijos) imp.buscar(hijo, "hijo");
						System.out.println("SE ENCONTRO: " + hijo.getNomHijo());
						
						System.out.println("INGRESE LA NUEVA EDAD: ");
						lectura = new Scanner(System.in);
						edadh = lectura.nextInt();
						
						hijo.setEdad(edadh);
						imp.editar(hijo, "hijo");
						System.out.println("SE EDITO CORRECTAMENTE");
						break;
						
						
					case 5:

						System.out.println("INGRESE EL NOBRE DE HIJO A ELIMINAR: ");
						lectura = new Scanner(System.in);
						nomHijoh = lectura.nextLine();
						
						hijo = new Hijos(nomHijoh);
						imp.eliminar(hijo, "hijo");
						System.out.println("SE ELIMINO CON EXTO");
						break;
						
						
					case 6:
						System.out.println("REGRESANDO AL MENU PRINCIPAL");
						break;

					}
				} while (menuHijos < 6);
				break;

			case 3:
				System.out.println("ADIOS.");
				break;

			}

		} while (menuPrincipal < 3);
	}

}
