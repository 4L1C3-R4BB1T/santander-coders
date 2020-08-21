package entities;

public class Filho extends Pessoa {

	private Mae mae;
	private Pai pai;
	
	public Filho() {
		super();
	}
	
	public Filho(String nome, Integer idade, Mae mae, Pai pai) {
		super(nome, idade);
		this.mae = mae;
		this.pai = pai;
	}

	public Mae getMae() {
		return mae;
	}

	public void setMae(Mae mae) {
		this.mae = mae;
	}

	public Pai getPai() {
		return pai;
	}

	public void setPai(Pai pai) {
		this.pai = pai;
	}
	
	public static boolean temAmesmaMae(Filho filho1, Filho filho2) {
		return (filho1.getMae().equals(filho2.getMae()));
	}
	
	public static boolean temOmesmoPai(Filho filho1, Filho filho2) {
		return (filho1.getPai().equals(filho2.getPai()));
	}
	
	public static boolean saoMeioIrmaos(Filho filho1, Filho filho2) {
		if ((filho1.getMae().equals(filho2.getMae())) || (filho1.getPai().equals(filho2.getPai()))) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "FILHO\nNOME: " + getNome() + "\nIDADE: " + getIdade() + "\n" + mae + "\n" + pai + "\n";
	}
	
}
