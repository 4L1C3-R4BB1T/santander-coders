package principal;

import animais.Elefante;

public class Principal {

	public static void main(String[] args) {
		
		Elefante elefante = new Elefante(4, "cinza", "mam�fero", 150);

		elefante.correr();
		
		System.out.println(elefante);
		
	}

}

