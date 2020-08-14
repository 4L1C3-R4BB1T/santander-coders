package exercises;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
		int idade;
		
		//4-recebe um nome e imprime uma sauda��o
		
		System.out.println("Digite seu nome:");
		String nome = input.next();
		
		System.out.println("Ol� " + nome + "!");
	
		
		//5-recebe uma idade e retorna se � maior ou menor de idade
		
		System.out.println("Digite sua idade:");
		idade = input.nextInt();
		
		if(idade < 18) {
			System.out.println("Voc� � menor de idade.");
		}else {
			System.out.println("Voc� � maior de idade.");
		}
		
		
		//6-dado um dia da semana, verifica se � final de semana
		
		System.out.println("Digite o dia da semana:");
		String diaSemana = input.next();
		
		if((diaSemana.equalsIgnoreCase("sabado")) || (diaSemana.equalsIgnoreCase("s�bado")) 
				|| (diaSemana.equalsIgnoreCase("domingo"))) {
			System.out.println("� final de semana! :)");
		}else {
			System.out.println("N�o � final de semana! :(");
		}
		
		
		//7-crie um programa que verifique se a pessoa tem todos os requisitos para dirigir
		
		System.out.println("Digite sua idade:");
		idade = input.nextInt();
		
		System.out.println("Possui CNH? (s/n)");
		String possuiCnh = input.next();
		
		if((idade >= 18) && (possuiCnh.equalsIgnoreCase("s"))) {
			System.out.println("Voc� pode dirigir!");
		}else {
			System.out.println("Voc� n�o pode dirigir!");
		}
			
	}

}
