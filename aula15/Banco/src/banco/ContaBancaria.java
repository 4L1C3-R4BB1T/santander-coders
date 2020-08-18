package banco;

public class ContaBancaria {

	private int numeroConta;
	private String titularConta;
	private double saldoConta;
	
	public ContaBancaria(int numeroConta, String titularConta) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getTitularConta() {
		return titularConta;
	}
	
	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}
	
	public double getSaldoConta() {
		return saldoConta;
	}
	
	public void realizarDeposito(double valor) {
		saldoConta += valor;
	}
	
	public void realizarSaque(double valor) {
		saldoConta -= valor + 5.00;
	}
	
	@Override
	public String toString() {
		return "Conta " + getNumeroConta() + ", Titular: " + getTitularConta() 
			+ ", Saldo: R$ " + String.format("%.2f", getSaldoConta());
	}
	
}
