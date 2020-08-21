package application;

import entities.Tripe;

public class Exercicio4 {

	public static void main(String[] args) {

		Tripe tripe = new Tripe(false, 0.80, 1.50, 1.00);
	
		tripe.definirAltura(1.20);

		tripe.dobrar(); 
		tripe.desdobrar();
		
		tripe.guardar();
		System.out.println("Pode guardar? " + tripe.prontoParaGuardar());
		
		tripe.usar();
		System.out.println("Pode usar? " + tripe.prontoParaUsar());
	
		System.out.println(tripe);
		
	}

}

