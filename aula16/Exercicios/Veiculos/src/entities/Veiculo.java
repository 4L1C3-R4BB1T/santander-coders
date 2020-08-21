package entities;

public class Veiculo {

	private String marca;
	private String modelo;
	private Integer anoDeFabricacao;
	private String cor;
	private Double quilometragem;
	
	public Veiculo() {
	}
	
	public Veiculo(String marca, String modelo, Integer anoDeFabricacao, String cor, Double quilometragem) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoDeFabricacao = anoDeFabricacao;
		this.cor = cor;
		this.quilometragem = quilometragem;
	}

	@Override
	public String toString() {
		return "\nVEÍCULO \nMARCA: " + marca + "\nMODELO: " + modelo + "\nANO DE FABRICAÇÃO: " + anoDeFabricacao + "\nCOR: "
				+ cor + "\nQUILOMETRAGEM: " + quilometragem;
	}

}
