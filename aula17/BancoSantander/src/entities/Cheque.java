package entities;

import java.util.Date;

public class Cheque {

	private Double valor;
	private String bancoEmissor;
	private Date dataPagamento;

	public Cheque() {
	}
	
	public Cheque(Double valor, String bancoEmissor, Date dataPagamento) {
		this.valor = valor;
		this.bancoEmissor = bancoEmissor;
		this.dataPagamento = dataPagamento;
	}

	public Double getValor() {
		return valor;
	}

	public String getBancoEmissor() {
		return bancoEmissor;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}
	
	@Override
	public String toString() {
		return "\nCHEQUE\nVALOR: R$ " + String.format("%.2f", valor) + "\nBANCO EMISSOR: " + bancoEmissor 
				+ "\nDATA DO PAGAMENTO: " + dataPagamento + "\n";
	}
	
}
