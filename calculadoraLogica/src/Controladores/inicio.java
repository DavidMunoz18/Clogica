package Controladores;

import java.util.Scanner;

import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;
import Servicios.OperativaImplementacion;
import Servicios.OperativaInterfaz;

public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();
		int opcionIntroducida;
		boolean cerrarMenu = false;
		Scanner comunicacionTeclado = new Scanner(System.in);
		
		while(!cerrarMenu) {
			opcionIntroducida = mi.mostrarMenuYSeleccion(comunicacionTeclado);
			
			switch(opcionIntroducida) {
			
			case 0:
				System.out.println("[INFO] - Se ejecuta caso 0");
				cerrarMenu = true;
				break;
			case 1:
				System.out.println("[INFO] - Se ejecuta caso 1");
				String texto1 = mi.String1(comunicacionTeclado);
				String texto2 = mi.String2(comunicacionTeclado);
				
				oi.Igualdad(texto1, texto2);
				
				break;
			case 2:
				System.out.println("[INFO] - Se ejecuta caso 2");
				String texto1 = mi.String1(comunicacionTeclado);
				String texto2 = mi.String2(comunicacionTeclado);
				
				oi.Desigualdad(texto1, texto2);
				
				break;
				
				default:
					System.out.println("[INFO] Ningun caso coincide con esa opcion");
					break;
			}
		}
	}
}
