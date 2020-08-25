package entities;

import java.time.LocalDate;

public class Cheque {

	private Double valor;
	private String bancoEmissor;
	private LocalDate dataPagamento;

	public Cheque() {
	}
	
	public Cheque(Double valor, String bancoEmissor, LocalDate dataPagamento) {
		this.valor = valor;
		this.bancoEmissor = bancoEmissor;
		this.dataPagamento = dataPagamento;
	}

	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getBancoEmissor() {
		return bancoEmissor;
	}
	
	public void setBanco(String bancoEmissor) {
		this.bancoEmissor = bancoEmissor;
	}

	public LocalDate getDataPagamento() {
		return dataPagamento;
	}
	
	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	@Override
	public String toString() {
		return "\nCHEQUE\nVALOR: R$ " + String.format("%.2f", valor) + "\nBANCO EMISSOR: " + bancoEmissor 
				+ "\nDATA DO PAGAMENTO: " + dataPagamento + "\n";
	}
	
}
