package entities;

public class Coca {

	private Integer tamanho;
	private Double preco;
	
	public Coca() {
	}

	public Coca(Integer tamanho, Double preco) {
		this.tamanho = tamanho;
		this.preco = preco;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (obj instanceof Coca) {
	      Coca qualquer = (Coca) obj;
	      return tamanho.equals(qualquer.getTamanho());
	    }else {
	      return false;
	    }
	}
	
}

