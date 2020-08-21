package application;

import entities.Atleta;
import entities.Estadio;
import entities.Prova;

public class Exercicio3 {

	public static void main(String[] args) {
	
		Estadio maracana = new Estadio();
		
		Atleta atleta1 = new Atleta("Alex", 2, 50);
		Atleta atleta2 = new Atleta("Mike", 2, 20);
	
		Prova prova1 = new Prova(1, 20);
		Prova prova2 = new Prova(2, 50);
		Prova prova3 = new Prova(2, 20);
		
		maracana.addProva(prova1);
		maracana.addProva(prova2);
		maracana.addProva(prova3);
		
		System.out.println(maracana.getProvas());
		
		System.out.println(maracana.realizarProvas(atleta2));
		
		System.out.println("");
		
		Atleta.melhorAtleta(atleta1, atleta2, prova1);
		Atleta.melhorAtleta(atleta1, atleta2, prova2);
		Atleta.melhorAtleta(atleta1, atleta2, prova3);
		
		Estadio.ganharMedalha(atleta1, atleta2, maracana);
		 
	}

}
