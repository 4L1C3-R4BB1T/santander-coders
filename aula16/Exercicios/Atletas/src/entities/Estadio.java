package entities;

import java.util.ArrayList;
import java.util.List;

public class Estadio {

	private ArrayList<Prova> provas; 	
	
	public Estadio() {
		this.provas = new ArrayList<Prova>();
	}
	
	public void addProva(Prova prova) {
		provas.add(prova);
	}
	
	public String getProvas() {
		String pRetorno = "";
		
		for (int i = 0; i < provas.size(); i++) {
			pRetorno += provas.get(i) + "\n";
		}
		return pRetorno;
	}
	
	public List<Prova> realizarProvas(Atleta atleta) { 
		List<Prova> provasConcluidas = new ArrayList<Prova>();
		
		for (Prova p : provas) {			
			if (p.podeRealizar(atleta)) {
				provasConcluidas.add(p);
			}
		}
		return provasConcluidas;
	}
	
	public int qtdProvasConcluidas(Atleta atleta) { 
		int qtd = 0;
		
		for (Prova p : provas) {			
			if (p.podeRealizar(atleta)) {
				qtd++;
			}
		}
		return qtd;
	}
	
	public static void ganharMedalha(Atleta a1, Atleta a2, Estadio e) {
		if (e.qtdProvasConcluidas(a1) > e.qtdProvasConcluidas(a2)) {
			System.out.println(a1.getNome() + " ganhou a medalha de ouro!\n");
		} else if (e.qtdProvasConcluidas(a2) > e.qtdProvasConcluidas(a1)) {
			System.out.println(a2.getNome() + " ganhou a medalha de ouro!\n");
		} else {
			System.out.println("Os dois atletas concluiram a mesma quantidade de provas!\n");
		}
	}
	
}
