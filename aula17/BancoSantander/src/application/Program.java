package application;

import java.time.LocalDate;

import entities.Cheque;
import entities.Cliente;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {

		Cliente c1 = new Cliente(52436, "Silva", "7.432.235", "563.235.567-25");
		Cliente c2 = new Cliente(18372, "Guimarães", "1.234.567", "123.456.789-10");
		
		ContaCorrente cc = new ContaCorrente(c1, 200.00);
		ContaPoupanca cp = new ContaPoupanca(c2, 0.0011);
		
		Cheque cheque = new Cheque(100.00, "Banco Santander", LocalDate.of(2020, 8, 6));

		cc.realizarDeposito(100.00);
		cc.consultarSaldo();
		cc.depositarCheque(cheque);
		cc.sacarQuantia(250.00);
		cc.consultarSaldo();
	
		System.out.println("\n---------------------------------------------");
		
		cp.realizarDeposito(100.00);
		cp.consultarSaldo();
		cp.sacarQuantia(50.00);
		cp.sacarQuantia(100.00);
		cp.recolherJuros();
		cp.consultarSaldo();
		
	}

}
