package application;

import java.util.Scanner;

import entities.Bolo;
import entities.Lasanha;
import entities.Macarrao;
import entities.Pizza;
import entities.Sanduiche;

public class Program {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
			
		System.out.println("******* MENU *******\n[1] SANDUÍCHES\n[2] MASSAS\n[3] BOLOS");
		System.out.print("Escolha uma opção: ");
		int op = sc.nextInt();
		
		switch (op) {
		case 1:
			sanduiche();
			break;
		case 2: 
			massas();
			break;
		case 3: 
			bolos();
			break;
		default:
			System.out.println("Opção inválida!\n");
		}
				
	}
	
	public static void sanduiche() {
		System.out.print("\nQuantidade de ingredientes(1 à 10): ");
		int n = sc.nextInt();
		
		sc.nextLine();
		System.out.println("");
		
		if ((n > 0) && (n < 11)) {
			Sanduiche sanduiche = new Sanduiche(5.00, n);
			selecionarIngredientes(sanduiche, n);
			sanduiche.calcularPrecoEtempo(distancia());	
		} else {
			System.out.println("Você deve escolher de 1 à 10!\n");
		}
	}
	
	public static void selecionarIngredientes(Sanduiche sanduiche, int n) {
		String ingredientes[] = new String[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Ingrediente #" + (i + 1) + ": ");
			String ingrediente  = sc.nextLine();
			ingredientes[i] = ingrediente;
		}
		
		sanduiche.addIngrediente(ingredientes);
	}
	
	public static void massas() {
		System.out.println("\n******* MASSAS *******\n[1] MACARRÃO\n[2] PIZZA\n[3] LASANHA");
		System.out.print("Escolha uma opção: ");
		int op = sc.nextInt();
		
		System.out.print("\nEscolha o molho: ");
		sc.nextLine();
		String molho = sc.nextLine();
		
		switch (op) {
		case 1: 
			Macarrao macarrao = new Macarrao(molho, 12.00);
			macarrao.calcularPrecoEtempo(distancia());
			break;
		case 2: 
			Pizza pizza = new Pizza(molho, 20.00);
			pizza.calcularPrecoEtempo(distancia());
			break;
		case 3: 
			Lasanha lasanha = new Lasanha(molho, 15.00);
			lasanha.calcularPrecoEtempo(distancia());
			break;
		default:
			System.out.println("Opção inválida!\n");
		}
	}
	
	public static void bolos() {
		sc.nextLine();
		
		System.out.print("\nEscolha a massa: ");
		String massa = sc.nextLine();
		
		System.out.print("Escolha o recheio: ");
		String recheio = sc.nextLine();
		
		System.out.print("Escolha a cobertura: ");
		String cobertura = sc.nextLine();
		
		Bolo bolo = new Bolo(massa, recheio, cobertura, 13.00);
		
		bolo.calcularPrecoEtempo(distancia());
	}
	
	public static double distancia() {
		System.out.print("\nDigite a distância até sua casa(em km): ");
		double distancia = sc.nextDouble();
		
		return distancia;
	}
	
}


