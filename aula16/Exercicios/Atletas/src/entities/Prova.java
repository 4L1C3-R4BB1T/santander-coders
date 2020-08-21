package entities;

public class Prova {

	private Integer dificuldade;
	private Integer energiaNecessaria;
	
	public Prova() {
	}
	
	public Prova(Integer dificuldade, Integer energiaNecessaria) {
		this.dificuldade = dificuldade;
		this.energiaNecessaria = energiaNecessaria;
	}

	public Integer getDificuldade() {
		return dificuldade;
	}

	public Integer getEnergiaNecessaria() {
		return energiaNecessaria;
	}

	public boolean podeRealizar(Atleta atleta) {
		return ((atleta.getNivel() >= dificuldade) && (atleta.getEnergia() >= energiaNecessaria));
	}

	@Override
	public String toString() {
		return "PROVA\nDIFICULDADE: " + dificuldade + "\nENERGIA NECESSÁRIA: " + energiaNecessaria + "\n";
	}
	
}
