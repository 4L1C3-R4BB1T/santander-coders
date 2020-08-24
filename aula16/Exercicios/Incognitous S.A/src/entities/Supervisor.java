package entities;

import java.time.LocalDate;

public class Supervisor extends PessoaFisica {
	
	public Supervisor() {
		super();
	}

	public Supervisor(Endereco endereco, String nome, String cpf, String email, String setor, LocalDate dataDeAdmissao, 
			Double salarioBase, Integer nit) {
		super(endereco, nome, cpf, email, setor, dataDeAdmissao, salarioBase, nit);
	}

	// BONIFICAÇÃO
	public void bonificacao() {
		double bonificacao = getSalarioBase() * 0.08;
		setSalarioLiquido(getSalarioBase() + bonificacao);
		System.out.println("Bonificação de R$ " + String.format("%.2f", bonificacao) + "\n");
	}
	
	// DEMITIR FUNCIONÁRIO
	public void demitir(Funcionario f) {
		f.setDataDeDemissao(LocalDate.now());
		System.out.println("Funcionário demitido!");
	}
	
	@Override
	public String toString() {
		return "\nSUPERVISOR" + getEndereco() + "\nNOME: " + getNome() + "\nCPF: " + getCpf() + "\nNIT: " + getNit() 
				+ "\nEMAIL: " + getEmail() + "\nSETOR: " + getSetor() + "\nDATA DE ADMISSÃO: " + getDataDeAdmissao() 
			    + "\nDATA DE DEMISSÃO: " + getDataDeDemissao() + "\nSALÁRIO BASE: " + String.format("%.2f", getSalarioBase());
	}
	
}
