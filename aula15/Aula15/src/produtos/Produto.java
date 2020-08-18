package produtos;

public class Produto {

	// Wrappers para atributos
	private String nome;
	private Double preco;
	private Integer quantidade;
	
	//Tipos primitivos para métodos

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto() {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double valorTotalEmEstoque() {
		return this.preco * this.quantidade;
	}
	
	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;	
	}
	
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
	
}
