package entities;

public class Aluno {

	private String nome;
	private Integer numeroDeAluno;
	
	public Aluno() {
	}

	public Aluno(String nome, Integer numeroDeAluno) {
		this.nome = nome;
		this.numeroDeAluno = numeroDeAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumeroDeAluno() {
		return numeroDeAluno;
	}

	public void setNumeroDeAluno(Integer numeroDeAluno) {
		this.numeroDeAluno = numeroDeAluno;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (obj instanceof Aluno) {
	      Aluno qualquer = (Aluno) obj;
	      return numeroDeAluno.equals(qualquer.getNumeroDeAluno());
	    }else {
	      return false;
	    }
	}
	
}
