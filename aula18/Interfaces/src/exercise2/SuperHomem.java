package exercise2;

public class SuperHomem implements Voador {

	private Integer experiencia = 0;
	
	public SuperHomem() {
	}
	
	public SuperHomem(Integer experiencia) {
		this.experiencia = experiencia;
	}

	public Integer getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(Integer experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public void voar() {
		experiencia += 3;
		System.out.println("Estou voando como um campeão!\n");
	}
	
}
