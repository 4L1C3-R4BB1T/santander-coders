package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.Endereco;
import entities.Funcionario;
import entities.Gerente;
import entities.PessoaFisica;
import entities.Supervisor;

public class Program {

	public static void main(String[] args) {

		List<Funcionario> funcionarios = new ArrayList<>();
		
		Endereco e = new Endereco("Rua ABC", 20, "Boa Vizinhança", "Cidadezinha", "Estado Azul");
		Funcionario f = new PessoaFisica(e, "João", "111.111.111-11", "meuemail1@gmail.com", "TI", LocalDate.of(2019, 8, 1), 1000.00, 24345157);
		Supervisor s = new Supervisor(e, "Carlos", "333.333.333-33", "meuemail3@gmail.com", "TI", LocalDate.of(2020, 6, 3), 1500.00, 1235162);
		Gerente g = new Gerente(e, "Pedro", "222.222.222-22", "meuemail2@gmail.com", "TI", LocalDate.of(2019, 2, 23), 2000.00, 1248762);
		
		funcionarios.add(f);                         
		funcionarios.add(g);
		funcionarios.add(s);
		
		for (Funcionario func : funcionarios) {
			System.out.println(func);
		}
		
	}

}



		
		