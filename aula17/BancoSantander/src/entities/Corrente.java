package entities;

import java.util.ArrayList;
import java.util.List;

public class Corrente extends Conta {
	
	private List<Cheque> cheques = new ArrayList<Cheque>();

	public Corrente() {
		super();
	}

	public Corrente(Cliente cliente) {
		super(cliente);
	}
	
	public String getCheques() {
		String pRetorno = "";
		
		for (Cheque c : cheques) {
			pRetorno += c;
		}
		
		return pRetorno;
	}
	
	public void depositarCheque(Cheque cheque) {
		realizarDeposito(cheque.getValor()); 
		cheques.add(cheque);
	}
	
	@Override
	public void sacarQuantia(double valor) {
		if(valor > getSaldo()) {
			double diferenca = valor - getSaldo();
			valor -= diferenca;
			System.out.println("\nCheque especial utilizado para o excedente de R$ " + String.format("%.2f", diferenca));
		} 
		super.sacarQuantia(valor);
	}
	
}
