package entities;

import java.util.ArrayList;

public class Concessionaria {

	private ArrayList<Venda> vendas; 
	
	public Concessionaria() {
		this.vendas = new ArrayList<Venda>();
	}
	
	public void registrarVendaVeiculo(Veiculo veiculo, Cliente cliente, double valor) {
		vendas.add(new Venda(cliente, veiculo, valor));
	}
	
	public String getVendas() {
		String pRetorno = "";
		
		for (int i = 0; i < vendas.size(); i++) {
			pRetorno += vendas.get(i) + "\n";
		}
		return pRetorno;
	}
	
}
