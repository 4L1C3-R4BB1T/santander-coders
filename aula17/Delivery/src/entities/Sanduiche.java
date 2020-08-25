package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sanduiche extends Lanche {

	private List<String> ingredientes;

	public Sanduiche() {
		super();
	}

	public Sanduiche(List<String> ingredientes, Double preco) {
		super(preco);
		this.ingredientes = ingredientes;
	}

	public List<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public double calcularTempo(double distancia) {
		return 15 + super.calcularTempo(distancia);
	}

	// MENU SANDUICHE
	public static void menuSanduiche() {
		Scanner sc = new Scanner(System.in);

		List<String> ingredientes = new ArrayList<>();
		int i = 1;

		while (ingredientes.size() <= 10) {
			System.out.print("\nDigite o ingrediente #" + i + ": ");
			ingredientes.add(sc.nextLine());

			char stop = 'n';

			if (ingredientes.size() != 10) {
				System.out.print("\nDeseja adicionar outro ingrediente? (s/n): ");
				stop = sc.next().charAt(0);
				sc.nextLine();
			}

			if (stop == 'n') {
				break;
			}

			i++;
		}

		Sanduiche sanduiche = new Sanduiche(ingredientes, 7.00);

		System.out.print("\nDigite a distância até sua casa(em km): ");
		double distancia = sc.nextDouble();

		System.out.println("\nPREÇO: R$ " + String.format("%.2f", sanduiche.getPreco()) + " | TEMPO PARA ENTREGA: "
				+ sanduiche.calcularTempo(distancia) + " minutos\n");
	}

}
