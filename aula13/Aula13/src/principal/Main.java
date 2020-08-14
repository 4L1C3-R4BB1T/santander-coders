package principal;

import java.util.Scanner;
//import geometria.Triangulo;
import produtos.Produto;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Digite as medidas do tri�ngulo X:");
		x.ladoA = sc.nextDouble();
		x.ladoB = sc.nextDouble();
		x.ladoC = sc.nextDouble();
		
		System.out.println("Digite as medidas do tri�ngulo Y:");
		y.ladoA = sc.nextDouble();
		y.ladoB = sc.nextDouble();
		y.ladoC = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.println("O valor da �rea de X �: " + areaX);
		System.out.println("O valor da �rea de Y �: " + areaY);

		if(areaX > areaY) {
			System.out.println("A �rea de X � maior!");
		}else {
			System.out.println("A �rea de Y � maior!");
		}
		*/
		
		Produto p = new Produto();
		
		System.out.println("Digite os dados do produto: ");
		
		System.out.print("Nome: ");
		p.nome = sc.nextLine();
		
		System.out.print("Pre�o: ");
		p.preco = sc.nextDouble();
		
		System.out.print("Quantidade em estoque: ");
		p.quantidade = sc.nextInt();
		
		System.out.println("Dados do produto: " + p.nome + ", R$ " + p.preco 
				+ ", " + p.quantidade + " unidades, Total: R$ " + p.valorTotalEmEstoque());
	
		//Adicionar
		System.out.print("\nDigite o n�mero de produtos a serem adicionados ao estoque: ");
		int n = sc.nextInt();
		p.adicionarProdutos(n);
		
		//Remover
		System.out.print("\nDigite o n�mero de produtos a serem removidos do estoque: ");
		n = sc.nextInt();
		p.removerProdutos(n);
		
	}

}
