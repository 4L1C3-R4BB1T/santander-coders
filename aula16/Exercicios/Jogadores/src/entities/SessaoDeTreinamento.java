package entities;

public class SessaoDeTreinamento {
	
	private Integer experiencia;
	
	public SessaoDeTreinamento() {
	}
	
	public SessaoDeTreinamento(Integer experiencia) {
		this.experiencia = experiencia;
	}
	
	public Integer getExperiencia() {
		return experiencia;
	}

	public void treinarA(JogadorDeFutebol jogador) {
		jogador.correr();
		jogador.fazerGol();
		jogador.correr();
		experiencia++;
		
		System.out.println("\nExperi�ncia inicial: " + jogador.getExperiencia());
		jogador.setExperiencia(jogador.getExperiencia() + experiencia);
		System.out.println("Experi�ncia final: " + jogador.getExperiencia());
		
		experiencia = 0;
	}
	
}
