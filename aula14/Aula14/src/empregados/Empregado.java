package empregados;

public class Empregado {

	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumentarSalario(double porcentagem) {
		double salario = salarioLiquido() + (salarioBruto * (porcentagem/100));
		System.out.println("\nDados atualizados : " + nome + ", R$ " + String.format("%.2f", salario));
	}
	
}

