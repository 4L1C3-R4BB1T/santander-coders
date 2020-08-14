package pessoas;

public class Funcionario extends Pessoa {

	public String turno;
	public double salario;

	public double calcularHorasTrabalhadas(int dias, double horasDiarias) {
		return dias * horasDiarias;
	}

	public void alterarTurno(String turno) {
		this.turno = turno;
	}

	public void imprimirFuncionario() {
		System.out.println("\n-------- DADOS FUNCIONÁRIO --------\n");	
		System.out.println("NOME: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("TELEFONE: " + telefone);
		System.out.println("TURNO DE TRABALHO: " + turno);
		System.out.println("SALÁRIO: R$ " + salario);
	}
	
}
