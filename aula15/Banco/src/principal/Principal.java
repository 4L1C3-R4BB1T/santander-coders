package principal;

import java.util.Scanner;
import banco.ContaBancaria;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número da conta: ");
		int numeroConta = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Digite o nome do titular da conta: ");
		String titularConta = sc.nextLine();
		
		ContaBancaria conta = new ContaBancaria(numeroConta, titularConta);
		
		System.out.println("Deseja realizar um depósito inicial? (s/n)");
		char option = sc.next().charAt(0);
		
		if (option == 's') {
			System.out.print("Digite o valor do depósito inicial: ");
			double valor = sc.nextDouble();
			conta.realizarDeposito(valor);
		}
		
		System.out.println("\nDados da conta: ");
		System.out.println(conta);
		
		System.out.print("\nDigite um valor para o depósito: ");
		double deposito = sc.nextDouble();
		conta.realizarDeposito(deposito);
		
		System.out.println("\nDados atualizados da conta: ");
		System.out.println(conta);
		
		System.out.print("\nDigite um valor para o saque: ");
		double saque = sc.nextDouble();
		conta.realizarSaque(saque);
		
		System.out.println("\nDados atualizados da conta: ");
		System.out.println(conta);
		
		sc.close();
		
	}

}
