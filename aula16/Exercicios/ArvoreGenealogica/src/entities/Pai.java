package entities;

import java.util.ArrayList;

public class Pai extends Pessoa {

	private ArrayList<Filho> filhos;

	public Pai() {
		super();
	}
	
	public Pai(String nome, Integer idade) {
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
	
	public boolean paiDe(Filho filho) {
		for (Filho f : filhos) {
			if (f.equals(filho)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "PAI\nNOME: " + getNome() + "\nIDADE: " + getIdade() + "\n";
	}
	
}
