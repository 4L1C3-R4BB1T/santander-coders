package entities;

public class Vaca extends Mamifero {

	public Vaca() {
		super();
	}

	public Vaca(String nome) {
		super(nome);
	}

	@Override
	public void falar() {
		System.out.println("Muuuuu...");
	}
	
}
