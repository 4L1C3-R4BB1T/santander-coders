package entities;

public class Papagaio extends Passaro {
	
	public Papagaio() {
		super();
	}

	public Papagaio(String nome) {
		super(nome);
	}

	@Override
	public void falar() {
		System.out.println("Aaaaaaaaaa...");
	}
	
}
