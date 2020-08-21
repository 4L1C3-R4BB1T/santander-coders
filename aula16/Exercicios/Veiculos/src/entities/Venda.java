package entities;

public class Venda {

	private Cliente cliente;
	private Veiculo veiculo;
	private Double valorVenda;
	
	public Venda() {
	}
	
	public Venda(Cliente cliente, Veiculo veiculo, Double valorVenda) {	
		this.cliente = cliente;
		this.veiculo = veiculo;
		this.valorVenda = valorVenda;
	}

	@Override
	public String toString() {
		return "\nVENDA" + cliente + "\n" + veiculo + "\n\nVALOR DA VENDA: " 
				+ valorVenda + "\n\n-----------------------------";
	} 
	
}
