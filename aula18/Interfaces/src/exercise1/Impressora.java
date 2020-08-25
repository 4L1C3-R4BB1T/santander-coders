package exercise1;

import java.util.ArrayList;
import java.util.List;

public class Impressora {

	private List<Imprimivel> imprimiveis = new ArrayList<Imprimivel>();
	
	public void imprimirTudo() {
		for (Imprimivel i : imprimiveis) {
			i.imprimir();
		}
	}

	public void adicionarImprimivel(Imprimivel umImprimivel) {
		imprimiveis.add(umImprimivel);
	}
	
}
