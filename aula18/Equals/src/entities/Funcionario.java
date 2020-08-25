package entities;

public class Funcionario {

	private String nome;
	private Integer numeroDeRegistro;
	
	public Funcionario() {
	}

	public Funcionario(String nome, Integer numeroDeRegistro) {
		this.nome = nome;
		this.numeroDeRegistro = numeroDeRegistro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumeroDeRegistro() {
		return numeroDeRegistro;
	}

	public void setNumeroDeRegistro(Integer numeroDeRegistro) {
		this.numeroDeRegistro = numeroDeRegistro;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (obj instanceof Funcionario) {
	      Funcionario qualquer = (Funcionario) obj;
	      return numeroDeRegistro.equals(qualquer.getNumeroDeRegistro());
	    }else {
	      return false;
	    }
	}
	
}
