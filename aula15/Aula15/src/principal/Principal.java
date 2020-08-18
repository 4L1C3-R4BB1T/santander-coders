package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import produtos.Produto;

public class Principal {

	public static void main(String[] args) {
		
		/*
		Produto tv = new Produto("TV", 900.00, 10);

		Produto monitor = new Produto("Monitor", 900.0);
	
		System.out.println(monitor.getNome());

		tv.setNome("Televisão");
		System.out.println(tv.getNome());
		*/
		
		List<Produto> lista = new ArrayList();
		
		lista.add( new Produto("TV", 900.00, 10) );		
		
		lista.add( new Produto("Microondas", 200.00, 100) );
		
		/*
		double soma = 0.0;
		for (int i = 0; i < lista.size(); i++) {
			// System.out.println(lista.get(i));
			soma += lista.get(i).getPreco();
		}
		System.out.println("Soma: " + soma); 
		*/
		
		/*
		for (Produto p : lista) {
			soma += p.getPreco();
		}
		
		System.out.println("Soma: " + soma); 
		*/
		
		// lista.remove(index);
		
		lista.stream().forEach(x -> System.out.println(x)); 
		
		List<Produto> r = lista.stream()
				.filter(x -> x.getPreco() < 300)
				.collect(Collectors.toList());
		
		r.stream().forEach(x -> System.out.println(x));
		
	}

}
