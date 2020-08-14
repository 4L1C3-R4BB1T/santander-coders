package produtos;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;
	
	public double valorTotalEmEstoque() {
		return this.preco * this.quantidade;
	}
	
	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
		
		System.out.println("Dados atualizados: " + this.nome + ", R$ " + this.preco 
				+ ", " + this.quantidade + " unidades, Total: R$ " + valorTotalEmEstoque());
	}
	
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
		
		System.out.println("Dados atualizados: " + this.nome + ", R$ " + this.preco 
				+ ", " + this.quantidade + " unidades, Total: R$ " + valorTotalEmEstoque());
	}
}
