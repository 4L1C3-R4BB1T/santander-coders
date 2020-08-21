package application;

import entities.Cliente;
import entities.Conta;

public class Exercicio1 {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("João", "Silva");
		Cliente c2 = new Cliente("Pedro", "Souza");
		
		Conta conta1 = new Conta(12345, 0.00, c1);
		Conta conta2 = new Conta(54321, 0.00, c2);
		
		conta1.deposito(100.00);
		conta2.deposito(200.00);
		
		conta1.saque(200.00);
		conta2.saque(50.00);
				
	}

}
