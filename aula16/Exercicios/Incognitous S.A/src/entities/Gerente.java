package entities;

import java.time.LocalDate;

public class Gerente extends PessoaFisica {

	public Gerente() {
		super();
	}

	public Gerente(Endereco endereco, String nome, String cpf, String email, String setor, LocalDate dataDeAdmissao, 
			Double salarioBase,Integer nit) {
		super(endereco, nome, cpf, email, setor, dataDeAdmissao, salarioBase, nit);
	}

	// BONIFICAÇÃO
	public void bonificacao() {
		double bonificacao = getSalarioBase() * 0.12;
		setSalarioLiquido(getSalarioBase() + bonificacao);
		System.out.println("Bonificação de R$ " + String.format("%.2f", bonificacao) + "\n");
	}
	
	// DEMITIR FUNCIONÁRIO
	public void demitir(Funcionario f) {
		f.setDataDeDemissao(LocalDate.now());
		System.out.println("Funcionário demitido!\n");
	}
	
	// DEMITIR SUPERVISOR
	public void demitir(Supervisor s) {
		s.setDataDeDemissao(LocalDate.now()); 
		System.out.println("Supervisor demitido!\n");
	}
	
	// REAJUSTE FUNCIONÁRIO
	public void reajustarSalario(Funcionario f, Double valor) {
		double salarioNovo = valor;
		if (salarioNovo < f.getSalarioBase()) {
			System.out.println("O novo salário não pode ser menor que o salário atual!\n");
		} else {
			f.setSalarioBase(salarioNovo);
		}
	}
	
	// REAJUSTE SUPERVISOR
	public void reajustarSalario(Supervisor s, Double valor) {
		double salarioNovo = valor;
		if (salarioNovo < s.getSalarioBase()) {
			System.out.println("O novo salário não pode ser menor que o salário atual!\n");
		} else {
			s.setSalarioBase(salarioNovo);
		}
	}
	
	@Override
	public String toString() {
		return "\nGERENTE" + getEndereco() + "\nNOME: " + getNome() + "\nCPF: " + getCpf() + "\nNIT: " + getNit() 
				+ "\nEMAIL: " + getEmail() + "\nSETOR: " + getSetor() + "\nDATA DE ADMISSÃO: " + getDataDeAdmissao() 
			    + "\nDATA DE DEMISSÃO: " + getDataDeDemissao() + "\nSALÁRIO BASE: " + String.format("%.2f", getSalarioBase());
	}
	
}
