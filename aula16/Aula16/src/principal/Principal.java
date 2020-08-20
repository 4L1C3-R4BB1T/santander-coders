package principal;

import animais.Elefante;

public class Principal {

	public static void main(String[] args) {
		
		Elefante elefante = new Elefante(4, "cinza", "mamífero", 150);

		elefante.correr();
		
		System.out.println(elefante);
		
	}

}

