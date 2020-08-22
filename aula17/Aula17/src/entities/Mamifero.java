package entities;

public class Mamifero extends Animal {

	public Mamifero() {
		super();
	}

	public Mamifero(String nome) {
		super(nome);
	}
	
	public void beberLeite() {
		System.out.println("Bebendo leite...");
	}
	
	@Override 
	public void falar() {
		System.out.println("Estou falando...");
	}
	
	@Override
	public Double beberAgua() {
		return 20.0;
	}
	
}
