package entities;

public class Passaro extends Animal {

	public Passaro() {
		super();
	}

	public Passaro(String nome) {
		super(nome);
	}

	@Override
	public void falar() {
		System.out.println("Piando...");
	}

	@Override
	public Double beberAgua() {
		return 20.0;
	}
	
}
