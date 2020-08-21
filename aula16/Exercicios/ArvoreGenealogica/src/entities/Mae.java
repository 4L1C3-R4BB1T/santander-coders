package entities;

import java.util.ArrayList;

public class Mae extends Pessoa {

	private ArrayList<Filho> filhos;
	
	public Mae() {
		super();
	}
	
	public Mae(String nome, Integer idade) {
		super(nome, idade);
		this.filhos = new ArrayList<Filho>();
	}
	
	public void addFilho(Filho filho) {
		filhos.add(filho);
	}
	
	public String getFilhos() {
		String pRetorno = "";
		
		for (Filho f : filhos) {
			pRetorno += f + "\n";
		}
		return pRetorno;
	}
	
	public boolean maeDe(Filho filho) {
		for (Filho f : filhos) {
			if (f.equals(filho)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "MÃE\nNOME: " + getNome() + "\nIDADE: " + getIdade() + "\n";
	}
	
}
