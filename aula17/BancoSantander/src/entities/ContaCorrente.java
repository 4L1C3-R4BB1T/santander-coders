package entities;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente extends Conta {
	
	private Double chequeEspecial;
	private List<Cheque> cheques = new ArrayList<Cheque>();

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(Cliente cliente, Double chequeEspecial) {
		super(cliente);
		this.chequeEspecial = chequeEspecial;
	}
	
	public Double getLimiteChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(Double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public List<Cheque> getCheques() {
		return cheques;
	}
	
	public void depositarCheque(Cheque cheque) {
		realizarDeposito(cheque.getValor()); 
		cheques.add(cheque);
	}
	
	@Override
	public void sacarQuantia(double valor) {
		if (valor > getSaldo()) {
			double diferenca = valor - getSaldo();
			if (chequeEspecial - diferenca >= 0) {
				super.sacarQuantia(valor - diferenca);
				chequeEspecial -= diferenca;
				System.out.println("\nCheque especial utilizado para o excedente de R$ " + String.format("%.2f", diferenca));
			} else {
				System.out.println("\nO valor requisitado ultrapassa o saldo disponível!");
			}
		} else {
			super.sacarQuantia(valor);
			System.out.println("\nSaque realizado!");
		}
	}
	
	@Override
	public String toString() {
		return "\nCONTA CORRENTE\nCHEQUE ESPECIAL: R$ " + String.format("%.2f", chequeEspecial) + getCliente() + "\nSALDO: R$ " + String.format("%.2f", getSaldo());
	}
	
}
