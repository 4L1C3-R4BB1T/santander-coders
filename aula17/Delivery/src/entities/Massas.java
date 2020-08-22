package entities;

public abstract class Massas extends Lanches {

	private String molho;

	public Massas() {
		super();
	}
	
	public Massas(String molho, Double preco) {
		super(preco);
		this.molho = molho;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}
	
	@Override
	public void calcularPrecoEtempo(double distancia) {
		System.out.println("\nO tempo até a entrega chegar será de " + (distancia * 10 + 30) + " minutos.");
		super.calcularPrecoEtempo(distancia);
	}

}
