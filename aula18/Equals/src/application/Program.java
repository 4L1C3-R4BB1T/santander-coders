package application;

import java.util.ArrayList;
import java.util.List;

import entities.Aluno;
import entities.Coca;
import entities.Funcionario;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro", 123456789);
		Pessoa p2 = new Pessoa("João", 123456789);
		
		System.out.println(p1.equals(p2));
		
		Coca c1 = new Coca(2, 5.00);
		Coca c2 = new Coca(2, 5.00);
	
		System.out.println(c1.equals(c2));
		
		List<Aluno> alunos = new ArrayList<>();
		
		Aluno a1 = new Aluno("Maria", 1);
		Aluno a2 = new Aluno("Amanda", 2);
		Aluno a3 = new Aluno("Pedro", 3);
		Aluno a4 = new Aluno("Leon", 4);
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		
		Aluno a5 = new Aluno("Marina", 3);
		
		System.out.println(alunos.contains(a5));
		
		List<Funcionario> funcionarios = new ArrayList<>();
		
		Funcionario f1 = new Funcionario("Maria", 1);
		Funcionario f2 = new Funcionario("Amanda", 2);
		Funcionario f3 = new Funcionario("Pedro", 3);
		Funcionario f4 = new Funcionario("Leon", 4);
		
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		funcionarios.add(f4);
		
		Funcionario f5 = new Funcionario("Marina", 3);
		
		System.out.println(funcionarios.contains(f5));
		 
	}

}
