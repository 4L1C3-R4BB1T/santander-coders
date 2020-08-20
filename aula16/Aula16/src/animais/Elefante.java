package animais;

public class Elefante extends Animal {

	private Integer tamanhoTromba;

	public Elefante() {
		super();
	}
	
	public Elefante(int quantidadeDePatas, String cor, String classificacao, Integer tamanhoTromba) {
		super(quantidadeDePatas, cor, classificacao);
		this.tamanhoTromba = tamanhoTromba;
	}

	public Integer getTamanhoTromba() {
		return tamanhoTromba;
	}

	public void setTamanhoTromba(Integer tamanhoTromba) {
		this.tamanhoTromba = tamanhoTromba;
	}
	
	@Override
	public void correr() {
		System.out.println("Correndo...");
	}

	@Override
	public String toString() {
		return "ELEFANTE\ntamanho da tromba(cm): " + tamanhoTromba + "\nquantidade de patas: " + getQuantidadeDePatas()
				+ "\ncor:" + getCor() + "\nclassificação: " + getClassificacao();
	}
	
}
