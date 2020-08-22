package entities;

public abstract class Lanches {
	
	private Double preco;

	public Lanches() {
	}
	
	public Lanches(Double preco) {
		this.preco = preco;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public void calcularPrecoEtempo(double distancia) {
		System.out.println("O valor total será de R$ " + String.format("%.2f", (distancia * 0.5 + getPreco())));
		System.out.println("Obrigado pela compra!");
	}
		
}


