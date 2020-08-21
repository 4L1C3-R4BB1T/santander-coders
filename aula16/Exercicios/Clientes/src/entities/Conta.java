package entities;

public class Conta {

	private Integer numeroConta;
	private Double saldo;
	private Cliente titular;

	public Conta() {
	}
	
	public Conta(Integer numeroConta, Double saldo, Cliente titular) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.titular = titular;
	}
	
	public Integer getNumeroConta() {
		return numeroConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public void deposito(double quantia) {
		saldo += quantia;
		System.out.println("\nDepósito:");
		System.out.println("Saldo atual: " + saldo); 
	}
	
	public void saque(double quantia) {
		if ((saldo - quantia) < 0) {
			System.out.println("\nSaldo insuficiente.");
		} else {
			saldo -= quantia;
			System.out.println("\nSaque:");
			System.out.println("Saldo atual: " + saldo);
		}
	}
	
}
