package application;

import entities.JogadorDeFutebol;
import entities.SessaoDeTreinamento;

public class Exercicio2 {

	public static void main(String[] args) {

		JogadorDeFutebol jogador1 = new JogadorDeFutebol("Neymar", 100, 0, 0, 0);
		JogadorDeFutebol jogador2 = new JogadorDeFutebol("Messi", 100, 0, 0, 0);
	
		SessaoDeTreinamento sessao1 = new SessaoDeTreinamento(0);
		SessaoDeTreinamento sessao2 = new SessaoDeTreinamento(0);
			
		sessao1.treinarA(jogador1);
		sessao1.treinarA(jogador1);
				
		sessao2.treinarA(jogador2);
		
	}

}
