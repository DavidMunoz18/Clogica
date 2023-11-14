package Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	@Override
	public int mostrarMenuYSeleccion(Scanner comunicacionTeclado) {
		
		int opcionSeleccionada;
		System.out.println("#############################");
		System.out.println("0. Cerrar la aplicacion");
		System.out.println("1. Igualdad");
		System.out.println("2. Desigualdad");
		System.out.println("#############################");
		opcionSeleccionada = comunicacionTeclado.nextInt();
		return opcionSeleccionada;
	}

	

	@Override
	public String String1(Scanner comunicacionTeclado) {
		String texto1;
	System.out.println("Introduzca el primer operando");
	texto1 = System.out.println(comunicacionTeclado);
		return texto1;
	}

	@Override
	public String String2(Scanner comunicacionTeclado) { 
		String texto2;
		System.out.println("Introduzca el segundo operando");
	texto2 = System.out.println(comunicacionTeclado);
		return texto2;
	}

}
