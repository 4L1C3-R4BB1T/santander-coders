package entities;

public class Pessoa {

	private String nome;
	private Integer rg;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, Integer rg) {
		this.nome = nome;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getRg() {
		return rg;
	}

	public void setRg(Integer rg) {
		this.rg = rg;
	}

	@Override
	public boolean equals(Object obj) {
	    if (obj instanceof Pessoa) {
	      Pessoa qualquer = (Pessoa) obj;
	      return rg.equals(qualquer.getRg());
	    }else {
	      return false;
	    }
	}
	
}
