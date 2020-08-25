package entities;

import java.util.Scanner;

public class Massas extends Lanche {

	private String molho;
	private TiposMassa tipo;

	public Massas() {
		super();
	}

	public Massas(String molho, TiposMassa tipo, Double preco) {
		super(preco);
		this.molho = molho;
		this.tipo = tipo;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public TiposMassa getTipo() {
		return tipo;
	}

	public void setTipo(TiposMassa tipo) {
		this.tipo = tipo;
	}

	public double calcularTempo(double distancia) {
		return 30 + super.calcularTempo(distancia);
	}

	// MENU MASSAS
	public static void menuMassas() {
		Scanner sc = new Scanner(System.in);

		int op = 0;
		String molho = "";
		double distancia = 0;

		do {
			System.out.println("\n******* MASSAS *******\n[1] MACARRÃO\n[2] PIZZA\n[3] LASANHA\n[4] VOLTAR");
			System.out.print("Escolha uma opção: ");
			op = sc.nextInt();
			sc.nextLine();

			if ((op > 4) || (op < 1)) {
				System.out.println("Opção inválida!");
			} else if (op == 4) {
				System.out.println();
			} else {
				TiposMassa tipo = null;
				Double preco = 0.0;
			
				switch (op) {
				case 1: 
					tipo = TiposMassa.MACARRAO;
					preco = 12.00;
					break;
				case 2: 
					tipo = TiposMassa.PIZZA;
					preco = 20.00;
					break;
				case 3: 
					tipo = TiposMassa.LASANHA;
					preco = 15.00;
				}
				
				System.out.print("\nEscolha um molho: ");
				molho = sc.nextLine();
				
				Massas massa = new Massas(molho, tipo, preco);
				
				System.out.print("\nDigite a distância até sua casa(em km): ");
				distancia = sc.nextDouble();
				
				System.out.println("\nPREÇO: R$ " + String.format("%.2f", massa.getPreco())
						+ " | TEMPO PARA ENTREGA: " + massa.calcularTempo(distancia) + " minutos");
			}
		} while (op != 4);
	}

}
