package exercise2;

public class Aviao implements Voador {

	private Integer horasDeVoo = 0;
	
	public Aviao() {
	}
	
	public Aviao(Integer horasDeVoo) {
		this.horasDeVoo = horasDeVoo;
	}

	public Integer getHorasDeVoo() {
		return horasDeVoo;
	}

	public void setHorasDeVoo(Integer horasDeVoo) {
		this.horasDeVoo = horasDeVoo;
	}

	@Override
	public void voar() {
		horasDeVoo += 13;
		System.out.println("Estou voando como um avião!\n");
	}
	
}
