package entities;

public class Cliente {

	private String nome;
	private String sobrenome;
	private String contato;
	
	public Cliente() {
	}
	
	public Cliente(String nome, String sobrenome, String contato) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.contato = contato;
	}

	@Override
	public String toString() {
		return "\nCLIENTE \nNOME: " + nome + "\nSOBRENOME: " + sobrenome + "\nCONTATO: " + contato;
	}

}
