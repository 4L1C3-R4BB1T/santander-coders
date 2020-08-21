package entities;

public class Tripe {

	private Boolean dobrado;
	private Double alturaMinima;
	private Double alturaMaxima;
	private Double alturaAtual;
		
	public Tripe() {
	}
	
	public Tripe(Boolean dobrado, Double alturaMinima, Double alturaMaxima, Double alturaAtual) {
		this.dobrado = dobrado;
		this.alturaMinima = alturaMinima;
		this.alturaMaxima = alturaMaxima;
		this.alturaAtual = alturaAtual;
	}
	
	public Boolean getDobrado() {
		return dobrado;
	}

	public Double getAlturaMinima() {
		return alturaMinima;
	}

	public Double getAlturaMaxima() {
		return alturaMaxima;
	}

	public Double getAlturaAtual() {
		return alturaAtual;
	}

	public void definirAltura(double novaAltura) {
		alturaAtual = novaAltura;
	}
	
	public void dobrar() {
		dobrado = true;
	}
	
	public void desdobrar() {
		dobrado = false;
	}
	
	public void guardar() {
		dobrar();
		alturaAtual = alturaMinima;
	}
	
	public boolean prontoParaGuardar() {
		return ((dobrado == true) && (alturaAtual == alturaMinima));
	}
	
	public void usar() {
		desdobrar();
		alturaAtual = (alturaMaxima / 2) + 0.01;
	}
	
	public boolean prontoParaUsar() {
		return ((dobrado == false) && (alturaAtual >= ((alturaMaxima / 2) + 0.01)));
	}

	@Override
	public String toString() {
		return "TRIPÉ\nDOBRADO: " + dobrado + "\nALTURA MÍNIMA: " + alturaMinima + "\nALTURA MÁXIMA: " + alturaMaxima
				+ "\nALTURA ATUAL: " + alturaAtual;
	}
	
}
