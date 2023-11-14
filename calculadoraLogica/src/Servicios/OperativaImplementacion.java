package Servicios;

public class OperativaImplementacion implements OperativaInterfaz {

	@Override
	public void Igualdad(String texto1, String texto2) {
		
		if(texto1.equals(texto2)) {
			
			System.out.print("Este texto es igual");
		}
		else {
			System.out.print("Este texto no es igual");
		}
		

	}

	@Override
	public void Desigualdad(String texto1, String texto2) {
		
		if(texto1.equals(texto2)) {
			System.out.println("Este texto no es igual");
		}
		else {
			System.out.println("Este texto es igual");
		}
	}

}
