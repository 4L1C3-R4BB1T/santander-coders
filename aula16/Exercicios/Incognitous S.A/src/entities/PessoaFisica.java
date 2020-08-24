package entities;

import java.time.LocalDate;

public class PessoaFisica extends Funcionario {

	private Integer nit;

	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(Endereco endereco, String nome, String cpf, String email, String setor, 
			LocalDate dataDeAdmissao, Double salarioBase, Integer nit) {
		super(endereco, nome, cpf, email, setor, dataDeAdmissao, salarioBase);
		this.nit = nit;
	}

	public Integer getNit() {
		return nit;
	}

	public void setNit(Integer nit) {
		this.nit = nit;
	}
	
	@Override
	public String toString() {
		return "\nFUNCION�RIO - PESSOA F�SICA" + getEndereco() + "\nNOME: " + getNome() + "\nCPF: " + getCpf() + "\nNIT: " + getNit() 
				+ "\nEMAIL: " + getEmail() + "\nSETOR: " + getSetor() + "\nDATA DE ADMISS�O: " + getDataDeAdmissao() 
			    + "\nDATA DE DEMISS�O: " + getDataDeDemissao() + "\nSAL�RIO BASE: " + String.format("%.2f", getSalarioBase());
	}

}
