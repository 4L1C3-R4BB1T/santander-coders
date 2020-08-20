package entities;

public class Endereco {

	private String rua;
	private Integer numero;
	private String bairro;
	private String cidade;
	private String estado;

	public Endereco() {
	}

	public Endereco(String rua, Integer numero, String bairro, String cidade, String estado) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "\nENDEREÇO\nRUA: " + rua + ", Nº: " + numero + ", BAIRRO: " + bairro + ", CIDADE: " + cidade + ", ESTADO: "
				+ estado;
	}
	
}

