package pessoas;

public class Cliente extends Pessoa {

	public double valorMensalidade;

	public double calcularMensalidade(int mes) {
		return valorMensalidade * mes;
	}

	public double calcularHorasTreino(int dias, double horasDiarias) {
		return dias * horasDiarias;
	}
	
	public void imprimirCliente() {
		System.out.println("\n-------- DADOS CLIENTE --------\n");
		System.out.println("NOME: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("TELEFONE: " + telefone);
		System.out.println("VALOR DA MENSALIDADE: R$ " + valorMensalidade);
	}

}
