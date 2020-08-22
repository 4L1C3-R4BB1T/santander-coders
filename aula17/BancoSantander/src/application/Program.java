package application;

import java.util.Date;

import entities.Cheque;
import entities.Cliente;
import entities.Corrente;
import entities.Poupanca;

public class Program {

	public static void main(String[] args) {

		Cliente c1 = new Cliente(52436, "Silva", "7.432.235", "563.235.567-25");
		Cliente c2 = new Cliente(18372, "Guimarães", "1.234.567", "123.456.789-10");
		
		Corrente cc = new Corrente(c1);
		Poupanca cp = new Poupanca(c2);
		
		Cheque cheque = new Cheque(100.00, "Banco Santander", new Date("08/22/20"));

		cc.realizarDeposito(100.00);
		cp.realizarDeposito(100.00);
		
		cp.sacarQuantia(50.00);
		cp.sacarQuantia(100.00);
		cp.recolherJuros(1);
		cp.consultarSaldo();
		
		cc.sacarQuantia(50.00);
		cc.depositarCheque(cheque);
		cc.sacarQuantia(200.00);
		cc.consultarSaldo();
		
		// System.out.println(cc.getCheques());
		
	}

}
