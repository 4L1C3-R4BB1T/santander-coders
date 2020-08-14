package exercises;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 1 – Um funcionário de uma empresa recebe aumento salarial anualmente. Sabe-se que:
		//  a) Esse funcionário foi contratado em 1995, com o salário inicial de R$1000,00; 
		//  b) Em 1996 recebeu um aumento de 1,5% sobre o seu salário inicial;
		//  c) A partir de 1997 (inclusive), os aumentos salariais sempre corresponderam ao dobro do percentual do ano anterior. 
		// Faça um programa que determine o salário atual desse funcionário.
		
		/*
		double salario = 1000, percentual = 0.015;
		int anoAtual;
		
		System.out.print("Digite o ano atual: ");
		anoAtual = sc.nextInt();
		
		for(int ano = 1996; ano <= anoAtual; ano++) {
			salario += salario * percentual;
			percentual *= 2;
		}
		
		System.out.println("O valor do salário atual é R$ " + salario);
		*/
		
		
		
		
		// 2 - Faça um programa que leia um valor N inteiro e positivo, calcule e mostre 
		// o valor de E, conforme a fórmula a seguir:
		// E = 1 + 1! + 1 + 2! + 1 + 3! + ... + 1/N!
		
		/*
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		double e = 2;

		if (num > 0) {
			for (int i = 2; i <= num; i++) {
				double fatorial = 1;
				for (int j = 2; j <= i; j++) {
					fatorial *= j;
				}

				if (i == num) {
					e += (1 / fatorial);
				} else {
					e += (1 + fatorial);
				}
			}
			System.out.println("E = " + e);
		} else {
			System.out.println("O número digitado é inválido! O valor deve ser inteiro e positivo!");
		}
		*/
		
		
		
		
		// 3 - Faça um programa que leia um número N que indique quantos valores inteiros e
		// positivos devem ser lidos a seguir. Para cada número lido, mostre uma tabela contendo
		// o valor lido e o fatorial desse valor.
		
		/*
		System.out.print("Digite a quantidade de numeros a serem lidos: ");
		int n = sc.nextInt();

		if (n > 0) {
			for (int i = 0; i < n; i++) {
				System.out.print("Digite um número: ");
				int num = sc.nextInt();
				
				double fatorial = 1;
				for (int j = 2; j <= num; j++) {
					fatorial *= j;
				}

				System.out.println("Valor lido: " + num + " | Fatorial: " + fatorial);
			}
		} else {
			System.out.println("O número digitado é inválido! O valor deve ser inteiro e positivo!");
		}
		*/
		
		
		
		
		// 4 – Faça um programa que leia cinco pares de valores (a,b) todos inteiros e positivos,
		// um de cada vez. Mostre os números inteiros pares de a até b (inclusive).
		
		/*
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite um número: ");
			int a = sc.nextInt();
			
			System.out.print("Digite outro número: ");
			int b = sc.nextInt();
			
			if ((a >= 0) && (b >= 0)) {
				int maior = Math.max(a, b);
				int menor = Math.min(a, b);

				System.out.println("Números pares entre " + menor + " e " + maior);
				for (int j = menor; j <= maior; j++) {
					if (j % 2 == 0) {
						System.out.println(j);
					}
				}
			} else {
				System.out.println("Número inválido! Eles devem ser inteiros e positivos!");
				continue;
			}
		}
		*/
		
		
		
		
		// 5 – Faça um programa que leia dez conjuntos de dois valores, o primeiro representando
		// o número do aluno e o segundo representando a sua altura em centímetros. Encontre o aluno 
		// mais alto e o mais baixo. Mostre o número do aluno mais baixo e mais alto, junto com suas alturas.
		
		/*
		System.out.print("Digite o número do aluno: ");
		int numAlu = sc.nextInt();
			
		System.out.print("Digite a altura do aluno: ");
		double alturaAlu = sc.nextDouble();
		
		int maiorNum = numAlu, menorNum = numAlu;
		double maiorAltura = alturaAlu, menorAltura = alturaAlu;
		
		for (int i = 0; i < 9; i++) {
			System.out.print("Digite o número do aluno: ");
			numAlu = sc.nextInt();
				
			System.out.print("Digite a altura do aluno: ");
			alturaAlu = sc.nextDouble();
			
			if (alturaAlu > maiorAltura) {
				maiorAltura = alturaAlu;
				maiorNum = numAlu;
			} else if (alturaAlu < menorAltura) {
				menorAltura = alturaAlu;
				menorNum = numAlu;
			}
		}
		
		System.out.println("Aluno mais baixo");
		System.out.println("Nº: " + menorNum + " | Altura: " + menorAltura);
		System.out.println("Aluno mais alto");
		System.out.println("Nº: " + maiorNum + " | Altura: " + maiorAltura);
		*/
		
		
		
		
		// 6 – Faça um programa que leia um número de termos e um valor positivo para X, 
		// calcule e mostre o valor da série a seguir:
		// S = - (x^2/1!) + (x^3/2!) - (x^4/3!) + (x^5/4!) - (x^6/3!) + (x^7/2!) - (x^8/1!) + (x^9/2!) - (x^10/3!) + (x^11/4!) - ...
		
		/*
		int div = 1, exp = 2, aux = 1, ctrl = 4;
		double s = 0;

		System.out.print("Digite o número de termos: ");
		int termos = sc.nextInt();

		System.out.print("Digite um valor para X: ");
		int x = sc.nextInt();

		for (int i = 1; i <= termos; i++) {
			double fatorial = 1;
			for (int k = 2; k <= div; k++) {
				fatorial *= k;
			}

			if (i % 2 == 0) {
				s += (Math.pow(x, exp) / fatorial);
			} else {
				s -= (Math.pow(x, exp) / fatorial);
			}

			exp++;

			if (i == ctrl) {
				ctrl += 3;
				aux++;
			}

			if (aux % 2 == 0) {
				div--;
			} else {
				div++;
			}
		}

		System.out.println("S = " + s);
		*/
		
		
		
		
		// 7 – Faça um programa que monte os oito primeiros termos da sequência de Fibonacci.
		
		/*
		int a = 0, b = 1, num = 0;
		System.out.println("Primeiros oito termos da sequência de Fibonacci:");
		System.out.print(" | " + b + " | ");
		
		for (int i = 0; i < 7; i++) {
			num = a + b;
			a = b;
			b = num;
			System.out.print(num + " | ");
		}		
		*/
		
		
		
		
		// 8 – Faça um programa que leia o número de termos, determine e mostre os valores 
		// de acordo com a série abaixo:
		// Série: 2, 7, 3, 4, 21, 12, 8, 63, 48, 16, 189, 192, 32, 567, 768, 64, ...
		
		/*
		System.out.print("Digite a quantidade de termos: ");
		int termos = sc.nextInt();
		
		int pri = 1, seg = 2, n1 = 2, n2 = 7, n3 = 3;
		
		System.out.println("Sequência:");
		
		for (int i = 1; i <= termos; i++) {
			if (i == pri) {
				System.out.print(n1 + " | ");
				pri += 3;
				n1 *= 2; 
			} else if (i == seg) {
				System.out.print(n2 + " | ");
				seg += 3;
				n2 *= 3;
			} else {
				System.out.print(n3 + " | ");
				n3 *= 4;
			}
		}
		*/
		
		
		
		
		// 9 – Faça um programa que calcule a soma dos primeiros 50 números pares. 
		// Esse programa não recebe valor. Os primeiros números pares são 2, 4, 6, ...
		
		/*
		System.out.println("Soma dos 50 primeiros números pares");
		int soma = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				soma += i;
			}
		}
		
		System.out.println("SOMA = " + soma);
		*/
		
		
		
		
		// 10 – Faça um programa que receba um número inteiro maior que 1 e verifique se o
		// número é primo ou não. Mostrar mensagem de um número primo ou de um número não primo.
		
		
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		int divisores = 0;
		
		if (num > 1) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					divisores++;
					break;
				}
			}
			
			if (divisores == 0) {
				System.out.println("O número " + num + " é primo!");
			} else {
				System.out.println("O número " + num + " não é primo!");
			}
		} else {
			System.out.println("Número inválido! Ele deve ser positivo e maior que 1!");
		}
		
		
	}

}
