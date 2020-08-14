package principal;

import java.util.Scanner;
import pessoas.Cliente;
import pessoas.Funcionario;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Cliente c = new Cliente();
		Funcionario f = new Funcionario();

		// Inserindo valores em Cliente
		c.nome = "Pedro";
		c.cpf = "123.456.789-10";
		c.telefone = "12345-6789";
		c.valorMensalidade = 250.45;

		// Inserindo valores em Funcionário
		f.nome = "Márcio";
		f.cpf = "321.654.987-01";
		f.telefone = "54321-9876";
		f.turno = "Manhã";
		f.salario = 1500;

		System.out.println("-------- CALCULAR MENSALIDADE --------\n");
		System.out.print("Digite a quantidade de meses para calcular a mensalidade: ");
		int mes = sc.nextInt();
		System.out.println("Valor = R$ " + c.calcularMensalidade(mes));

		System.out.println("\n-------- CALCULAR HORAS DE TREINO --------\n");
		System.out.print("Digite a quantidade de dias: ");
		int dias = sc.nextInt();
		System.out.print("Digite a quantidade de horas diárias de treino: ");
		int horasDiarias = sc.nextInt();
		System.out.println("Horas de treino =  " + c.calcularHorasTreino(dias, horasDiarias));

		System.out.println("\n-------- CALCULAR HORAS DE TRABALHO --------\n");
		System.out.print("Digite a quantidade de dias: ");
		dias = sc.nextInt();
		System.out.print("Digite a quantidade de horas diárias de trabalho: ");
		horasDiarias = sc.nextInt();
		System.out.println("Horas de treino =  " + f.calcularHorasTrabalhadas(dias, horasDiarias));

		System.out.println("\n-------- MODIFICAR TURNO --------\n");
		System.out.print("Digite o novo turno: ");
		String turno = sc.next();
		f.alterarTurno(turno);
		System.out.println("Novo turno - " + f.turno);
		
		c.imprimirCliente();
		f.imprimirFuncionario();

	}

}
