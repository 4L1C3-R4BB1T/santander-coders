package entities;

public class Poupanca extends Conta {

	public Poupanca() {
		super();
	}

	public Poupanca(Cliente cliente) {
		super(cliente);
	}

	public void recolherJuros(int meses) {
		double juros = getSaldo() * 0.0011 * meses;
		System.out.println("\nJUROS: R$ " + String.format("%.2f", juros));
	}
	
}
