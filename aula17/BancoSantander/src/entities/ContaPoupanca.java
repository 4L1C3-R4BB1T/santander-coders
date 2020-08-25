package entities;

public class ContaPoupanca extends Conta {

	private Double taxaJuros;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Cliente cliente, Double taxaJuros) {
		super(cliente);
		this.taxaJuros = taxaJuros;
	}
	
	public Double getTaxaJuros() {
		return taxaJuros;
	}
	
	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public void recolherJuros() {
		super.realizarDeposito(getSaldo() * taxaJuros);
		System.out.println("\nJuros recolhido!");
	}
	
	@Override
	public void sacarQuantia(double valor) {
		if (valor > getSaldo()) {
			System.out.println("\nSaldo insuficiente para o valor requisitado!");
		} else {
			super.sacarQuantia(valor);
			System.out.println("\nSaque realizado!");
		}
	}

	@Override
	public String toString() {
		return "\nCONTA POUPANÇA\nTAXA DE JUROS: " + taxaJuros + getCliente() + "\nSALDO: " + String.format("%.2f", getSaldo());
	}
	
}
