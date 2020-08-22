package entities;

public abstract class Animal implements Bicho {

	private String nome;
	
	public Animal() {
	}

	public Animal(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract void falar();
	
}
