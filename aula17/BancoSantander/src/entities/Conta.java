package entities;

public abstract class Conta {

	private Cliente cliente;
	private Double saldo = 0.0;

	public Conta() {
	}
	
	public Conta(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Double getSaldo() {
		 return saldo;
	}
	
	public void realizarDeposito(double valor) {
		saldo += valor; 
	}
	
	public void sacarQuantia(double valor) {
		saldo -= valor;
	}
	
	public void consultarSaldo() {
		System.out.println("\nSALDO: R$ " + String.format("%.2f", getSaldo()));
	}
			
}
