package application;

import entities.Cliente;
import entities.Concessionaria;
import entities.Veiculo;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Veiculo carro = new Veiculo("Volkswagen", "Gol", 2015, "Vermelho", 20000.00);
		
		Cliente cliente1 = new Cliente("Joao", "Silva", "99999-9999");
		Cliente cliente2 = new Cliente("Paulo", "Filho", "99999-9998");
		
		Concessionaria c = new Concessionaria();
		
		c.registrarVendaVeiculo(carro, cliente1, 25000.00);
		c.registrarVendaVeiculo(carro, cliente2, 25000.00);
		
		System.out.println("LISTA DE VENDAS\n" + c.getVendas());
		
	}

}
