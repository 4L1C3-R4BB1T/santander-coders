package exercise2;

public class Pato implements Voador {

	private Integer energia = 0;
	
	public Pato() {
	}
	
	public Pato(Integer energia) {
		this.energia = energia;
	}

	public Integer getEnergia() {
		return energia;
	}

	public void setEnergia(Integer energia) {
		this.energia = energia;
	}

	@Override
	public void voar() {
		energia -= 5;
		System.out.println("Estou voando como um pato!\n");
	}
	
}
