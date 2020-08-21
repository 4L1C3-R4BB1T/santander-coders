package entities;

public class JogadorDeFutebol {

	private String nome;
	private Integer energia;
	private Integer alegria;
	private Integer gols;
	private Integer experiencia;
	
	public JogadorDeFutebol() {
	}
	
	public JogadorDeFutebol(String nome, Integer energia, Integer alegria, Integer gols, Integer experiencia) {
		this.nome = nome;
		this.energia = energia;
		this.alegria = alegria;
		this.gols = gols;
		this.experiencia = experiencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getEnergia() {
		return energia;
	}

	public Integer getAlegria() {
		return alegria;
	}

	public Integer getGols() {
		return gols;
	}

	public Integer getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	public void fazerGol() {
		energia -= 5;
		alegria += 10;
		gols++;
		System.out.println("\nGOOOOL!"); 
	}
	
	public void correr() {
		energia -= 10;
		System.out.println("\nCansei"); 
	}
	
}
