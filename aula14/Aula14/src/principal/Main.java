package principal;

import java.util.Scanner;
import cambio.CurrencyConverter;
// import alunos.Student;
// import empregados.Empregado;
// import geometria.Retangulo;
// import geometria.Circulo;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		Empregado e = new Empregado();
		
		System.out.print("Nome: ");
		e.nome = sc.nextLine();
		
		System.out.print("Salário bruto: ");
		e.salarioBruto = sc.nextDouble();
		
		System.out.print("Impostos: ");
		e.imposto = sc.nextDouble();
		
		System.out.println("\nEmpregado: " + e.nome + ", R$ " + String.format("%.2f", e.salarioLiquido()));
		
		System.out.print("\nQual a porcentagem de aumento?");
		double porcentagem = sc.nextDouble();
		e.aumentarSalario(porcentagem);
		*/
		
		/*
		Retangulo r = new Retangulo();
		
		System.out.println("Digite a largura e altura do retângulo:");
		r.largura = sc.nextDouble();
		r.altura = sc.nextDouble();
		
		System.out.println(r);
		*/
		
		/*
		Student a = new Student();
		
		a.nome = sc.nextLine();
		a.n1 = sc.nextDouble();
		a.n2 = sc.nextDouble();
		a.n3 = sc.nextDouble();
		
		a.somarNotas();
		*/
		
		/*
		System.out.println(Circulo.PI);
		System.out.println(Circulo.circunferencia(3));
		System.out.println(Circulo.volume(3));
		*/
		
		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double value = sc.nextDouble();
		
		CurrencyConverter.converter(dollar, value);
		
		sc.close();
		
	}

}
