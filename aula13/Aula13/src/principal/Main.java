package principal;

import java.util.Scanner;
// import geometria.Triangulo;
import produtos.Produto;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Digite as medidas do triângulo X:");
		x.ladoA = sc.nextDouble();
		x.ladoB = sc.nextDouble();
		x.ladoC = sc.nextDouble();
		
		System.out.println("Digite as medidas do triângulo Y:");
		y.ladoA = sc.nextDouble();
		y.ladoB = sc.nextDouble();
		y.ladoC = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.println("O valor da área de X é: " + areaX);
		System.out.println("O valor da área de Y é: " + areaY);

		if(areaX > areaY) {
			System.out.println("A área de X é maior!");
		}else {
			System.out.println("A área de Y é maior!");
		}
		*/
		
		Produto p = new Produto();
		
		System.out.println("Digite os dados do produto: ");
		
		System.out.print("Nome: ");
		p.nome = sc.nextLine();
		
		System.out.print("Preço: ");
		p.preco = sc.nextDouble();
		
		System.out.print("Quantidade em estoque: ");
		p.quantidade = sc.nextInt();
		
		System.out.println("Dados do produto: " + p.nome + ", R$ " + p.preco 
				+ ", " + p.quantidade + " unidades, Total: R$ " + p.valorTotalEmEstoque());
	
		// Adicionar
		System.out.print("\nDigite o número de produtos a serem adicionados ao estoque: ");
		int n = sc.nextInt();
		p.adicionarProdutos(n);
		
		// Remover
		System.out.print("\nDigite o número de produtos a serem removidos do estoque: ");
		n = sc.nextInt();
		p.removerProdutos(n);
		
	}

}
