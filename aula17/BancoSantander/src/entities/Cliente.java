package entities;

public class Cliente {

	private Integer numero;
	private String sobrenome;
	private String rg;
	private String cpf;
	
	public Cliente() {
	}
	
	public Cliente(Integer numero, String sobrenome, String rg, String cpf) {
		this.numero = numero;
		this.sobrenome = sobrenome;
		this.rg = rg;
		this.cpf = cpf;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getRg() {
		return rg;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return "\nCLIENTE\nNÚMERO: " + numero + "\nSOBRENOME: " + sobrenome + "\nRG: " + rg + "\nCPF: " + cpf;
	}
	
}

