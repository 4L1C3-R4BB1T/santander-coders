package application;

import exercise1.Contrato;
import exercise1.Documento;
import exercise1.Foto;
import exercise1.Impressora;
import exercise2.Aviao;
import exercise2.Pato;
import exercise2.SuperHomem;
import exercise2.TorreDeControle;

public class Program {

	public static void main(String[] args) {
	
		// IMPRESSORA
		Contrato c = new Contrato("Contrato de aluguel", "Aluguel");
		Foto f = new Foto("Foto da festa", "png");
		Documento d = new Documento("Exercícios", "doc");
		Impressora i = new Impressora();
		
		i.adicionarImprimivel(c);
		i.adicionarImprimivel(f);
		i.adicionarImprimivel(d);
		
		i.imprimirTudo();
		
		// VOADOR
		Pato p = new Pato();
		Aviao a = new Aviao();
		SuperHomem s = new SuperHomem();
		TorreDeControle t = new TorreDeControle();
		
		t.adicionarVoador(p);
		t.adicionarVoador(a);
		t.adicionarVoador(s);
		
		t.voarTodos();
		
	}

}
