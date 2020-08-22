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
		System.out.println("\nDep�sito realizado!");
	}
	
	public void sacarQuantia(double valor) {
		if(valor > saldo) {
			System.out.println("\nA quantia � maior que o saldo dispon�vel!");
			System.out.println("OPERA��O CANCELADA");
		} else {
			saldo -= valor; 
			System.out.println("\nSaque realizado!");
		}
	}
	
	public void consultarSaldo() {
		System.out.println("\nSALDO: R$ " + String.format("%.2f", getSaldo()));
	}
		
}
