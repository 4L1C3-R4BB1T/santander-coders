package entities;

import java.util.Scanner;

public class Bolo extends Lanche {

	private String massa;
	private String recheio;
	private String cobertura;

	public Bolo() {
	}

	public Bolo(String massa, String recheio, String cobertura, Double preco) {
		super(preco);
		this.massa = massa;
		this.recheio = recheio;
		this.cobertura = cobertura;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

	public double calcularTempo(double distancia) {
		return 10 + super.calcularTempo(distancia);
	}

	// MENU BOLO
	public static void menuBolo() {
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEscolha a massa: ");
		String massa = sc.nextLine();

		System.out.print("Escolha o recheio: ");
		String recheio = sc.nextLine();

		System.out.print("Escolha a cobertura: ");
		String cobertura = sc.nextLine();

		Bolo bolo = new Bolo(massa, recheio, cobertura, 13.00);

		System.out.print("\nDigite a distância até sua casa(em km): ");
		double distancia = sc.nextDouble();

		System.out.println("\nPREÇO: R$ " + String.format("%.2f", bolo.getPreco()) + " | TEMPO PARA ENTREGA: "
				+ bolo.calcularTempo(distancia) + " minutos\n");
	}

}
