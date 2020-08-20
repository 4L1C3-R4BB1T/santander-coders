package animais;

public class Animal {

	private int quantidadeDePatas;
	private String cor;
	private String classificacao;
	
	public Animal() {
	}

	public Animal(int quantidadeDePatas, String cor, String classificacao) {
		this.quantidadeDePatas = quantidadeDePatas;
		this.cor = cor;
		this.classificacao = classificacao;
	}

	public int getQuantidadeDePatas() {
		return quantidadeDePatas;
	}

	public void setQuantidadeDePatas(int quantidadeDePatas) {
		this.quantidadeDePatas = quantidadeDePatas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	
	public void correr() {
		System.out.println("Estou correndo...");
	}

	@Override
	public String toString() {
		return "ANIMAL\nquantidade de patas: " + quantidadeDePatas + "\ncor: " + cor + "\nclassificação: " + classificacao;
	}
	
}

