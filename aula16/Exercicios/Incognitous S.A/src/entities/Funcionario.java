package entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Funcionario {

	private Endereco endereco;
	private String nome;
	private String cpf;
	private String email;
	private String setor;
	private LocalDate dataDeAdmissao;
	private LocalDate dataDeDemissao;
	private Double salarioBase;
	
	private Double salarioLiquido;
	private Boolean deFerias = false;
	private LocalDate dataUltimaFerias;
	
	public Funcionario() {
	}
	
	public Funcionario(Endereco endereco, String nome, String cpf, String email, String setor, 
			LocalDate dataDeAdmissao, Double salarioBase) {
		this.endereco = endereco;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.setor = setor;
		this.dataDeAdmissao = dataDeAdmissao;
		this.salarioBase = salarioBase;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSetor() {
		return setor;
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public LocalDate getDataDeAdmissao() {
		return dataDeAdmissao;
	}
	
	public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}
	
	public LocalDate getDataDeDemissao() {
		return dataDeDemissao;
	}
	
	public void setDataDeDemissao(LocalDate dataDeDemissao) {
		this.dataDeDemissao = dataDeDemissao;
	}
	
	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Double getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(Double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	public Boolean getDeFerias() {
		return deFerias;
	}

	public LocalDate getDataUltimaFerias() {
		return dataUltimaFerias;
	}

	// CONSULTAR CONTRACHEQUE
	public void consultarContraCheque() {
		System.out.println("Consultando contra-cheque...");
		System.out.println("Sal�rio base: R$ " + salarioBase);
		
		// SE SAL�RIO L�QUIDO = NULL
		if (salarioLiquido == null) {
			salarioLiquido = salarioBase;
		}
		
		System.out.println("Sal�rio l�quido: R$ " + salarioLiquido + "\n");
	}
	
	// REQUISITAR F�RIAS
	public void requisitarFerias() {
		LocalDate admissao = dataDeAdmissao;
		LocalDate hoje = LocalDate.now();
		
		// CALCULA A DIFEREN�A DE MESES
		long mesesA = admissao.until(hoje, ChronoUnit.MONTHS);
		
		// SE A DATA DE ADMISS�O >= 11 MESES 
		if (mesesA > 10) {
			LocalDate ferias = getDataUltimaFerias();
			
			// SE A DATA DAS �LTIMAS F�RIAS = NULL
			if (ferias == null) {
				dataUltimaFerias = LocalDate.now();
				deFerias = true;
				System.out.println("De f�rias...\n");
			} else {
				long mesesF = ferias.until(hoje, ChronoUnit.MONTHS);
				
				// SE A DATA DAS �LTIMAS F�RIAS >= 4 MESES
				if (mesesF > 3) {
					dataUltimaFerias = LocalDate.now();
					deFerias = true;
					System.out.println("De f�rias...\n");
				} else {
					System.out.println("O funcion�rio n�o pode tirar f�rias agora! A data das �ltimas f�rias � inferior a 4 meses!\n");
				}
			}
		} else {
			System.out.println("O funcion�rio n�o pode tirar f�rias agora! A data de admiss�o � inferior a 11 meses!\n");
		}			
	}
	
	// VOLTAR DAS F�RIAS 
	public void voltarDasFerias() {
		if (!deFerias) {
			System.out.println("O funcion�rio n�o estava de f�rias!\n");
		} else {
			deFerias = false;
			System.out.println("Voltei para o trabalho!\n");
		}
	}
	
	// TRABALHAR
	public void trabalhar() {
		if (deFerias) {
			System.out.println("O funcion�rio n�o pode trabalhar pois est� de f�rias!\n");
		} else {
			System.out.println("Trabalhando...\n");
		}
	}
	
	// PEDIR DEMISS�O
	public void pedirDemissao() {
		dataDeDemissao = LocalDate.now();
		System.out.println("Demiss�o pedida!\n");
	}
	
	// SOLICITAR AUMENTO
	public void solicitarAumento() {
		if (!deFerias) {
			System.out.println("Aumento aprovado!\n"); 
		} else {
			System.out.println("Aumento negado!\n");
		}
	}
	
}
