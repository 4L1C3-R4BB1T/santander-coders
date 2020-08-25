package exercise2;

import java.util.ArrayList;
import java.util.List;

public class TorreDeControle {

private List<Voador> voadores = new ArrayList<Voador>();
	
	public void voarTodos() {
		for (Voador v : voadores) {
			v.voar();
		}
	}

	public void adicionarVoador(Voador umVoador) {
		voadores.add(umVoador);
	}
 
}
