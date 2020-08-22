package entities;

public class BemTeVi extends Passaro {
	
	public BemTeVi() {
		super();
	}

	public BemTeVi(String nome) {
		super(nome);
	}

	@Override
	public void falar() {
		System.out.println("Bem te vi...");
	}

}
