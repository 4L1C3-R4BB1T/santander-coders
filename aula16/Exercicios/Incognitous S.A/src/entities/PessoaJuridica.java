package entities;

import java.time.LocalDate;

public class PessoaJuridica extends Funcionario {

	private String cnpj;

	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(Endereco endereco, String nome, String cpf, String email, String setor,
			LocalDate dataDeAdmissao, Double salarioBase, String cnpj) {
		super(endereco, nome, cpf, email, setor, dataDeAdmissao, salarioBase);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString() {
		return "\nFUNCIONÁRIO - PESSOA JURÍDICA" + getEndereco() + "\nNOME: " + getNome() + "\nCPF: " + getCpf() + "\nCNPJ: " + getCnpj() 
				+ "\nEMAIL: " + getEmail() + "\nSETOR: " + getSetor() + "\nDATA DE ADMISSÃO: " + getDataDeAdmissao() 
			    + "\nDATA DE DEMISSÃO: " + getDataDeDemissao() + "\nSALÁRIO BASE: " + String.format("%.2f", getSalarioBase());
	}
	
}
