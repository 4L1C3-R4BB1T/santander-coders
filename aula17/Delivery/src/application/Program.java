package application;

import java.util.Scanner;

import entities.Bolo;
import entities.Massas;
import entities.Sanduiche;

public class Program {
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int op = 0;
		
		do {
			System.out.println("******* MENU *******\n[1] SANDUÍCHES\n[2] MASSAS\n[3] BOLOS\n[4] SAIR");
			System.out.print("Escolha uma opção: ");
			op = sc.nextInt();
			
			switch (op) {
			case 1:
				Sanduiche.menuSanduiche();
				break;
			case 2: 
				Massas.menuMassas();
				break;
			case 3: 
				Bolo.menuBolo();
				break;
			case 4:
				System.out.println("\nVolte sempre!");
				break;
			default:
				System.out.println("Opção inválida!\n");
			}
		} while	(op != 4);
		
		sc.close();
		
	}
		
}


