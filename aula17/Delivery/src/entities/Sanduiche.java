package entities;

public class Sanduiche extends Lanches {

	private String ingredientes[];

	public Sanduiche() {
		super();
	}
	
	public Sanduiche(Double preco, int n) {
		super(preco);
		ingredientes = new String[n];
	}

	public String getIngredientes() {
		String pRetorno = "";
		
		for (int i = 0; i < ingredientes.length; i++) {
			pRetorno += ingredientes[i] + "\n";
		}
		
		return pRetorno;
	}
	
	public void addIngrediente(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}
		
	@Override
	public void calcularPrecoEtempo(double distancia) {
		System.out.println("\nO tempo até a entrega chegar será de " + (distancia * 10 + 15) + " minutos.");
		super.calcularPrecoEtempo(distancia);
	}
	
}
