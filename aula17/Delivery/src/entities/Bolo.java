package entities;

public class Bolo extends Lanches {

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

	@Override
	public void calcularPrecoEtempo(double distancia) {
		System.out.println("\nO tempo até a entrega chegar será de " + (distancia * 10 + 10) + " minutos");
		super.calcularPrecoEtempo(distancia);
	}
	
}
