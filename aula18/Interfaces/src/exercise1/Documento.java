package exercise1;

public class Documento implements Imprimivel {

	private String nome;
	private String tipo;
	
	public Documento() {
	}
	
	public Documento(String nome, String tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void imprimir() {
		System.out.println("Sou um documento do Word!\nNOME: " + nome + " | TIPO: " + tipo + "\n");
	}

}
