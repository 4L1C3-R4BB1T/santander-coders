package entities;

public class Atleta {

	private String nome;
	private Integer nivel;
	private Integer energia;
	
	public Atleta() {
	}
	
	public Atleta(String nome, Integer nivel, Integer energia) {
		this.nome = nome;
		this.nivel = nivel;
		this.energia = energia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNivel() {
		return nivel;
	}
	
	public Integer getEnergia() {
		return energia;
	}
	
	public static void melhorAtleta(Atleta a1, Atleta a2, Prova p) {		
		if (p.podeRealizar(a1) && p.podeRealizar(a2) && a1.getNivel() == a2.getNivel()) {
			System.out.println("Os dois atletas conseguiram concluir a prova e possuem o mesmo nível!\n");
		} else if ((p.podeRealizar(a1)) && (a1.getNivel() >= a2.getNivel())) {
			System.out.println(a1.getNome() + " é melhor!\n");
		} else if ((p.podeRealizar(a2)) && (a2.getNivel() >= a1.getNivel())){
			System.out.println(a2.getNome() + " é melhor!\n");
		} else {
			System.out.println("Nenhum dos atletas conseguiu concluir a prova!\n");
		}
	}

	@Override
	public String toString() {
		return "ATLETA\nNOME: " + nome + "\nNÍVEL: " + nivel + "\nENERGIA: " + energia + "\n";
	}
	
}
