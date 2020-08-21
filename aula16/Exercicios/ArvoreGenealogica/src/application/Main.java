package application;

import entities.Filho;
import entities.Mae;
import entities.Pai;

public class Main {

	public static void main(String[] args) {

		Mae m1 = new Mae("Maria", 35);
		Mae m2 = new Mae("Mirian", 40);
		
		Pai p1 = new Pai("Pedro", 38);
		Pai p2 = new Pai("Carlos", 43);
		
		Filho f1 = new Filho("João", 12, m1, p1);
		Filho f2 = new Filho("Gustavo", 10, m2, p1);
		Filho f3 = new Filho("Julia", 3, m1, p2);
		
		m1.addFilho(f1);
		m1.addFilho(f3);
		
		m2.addFilho(f2);
		
		p1.addFilho(f1);
		p1.addFilho(f2);
		
		p2.addFilho(f3);
		
		System.out.println(m1.getNome() + " é mãe de " + f1.getNome() + "? " + m1.maeDe(f1));
		System.out.println(m1.getNome() + " é mãe de " + f2.getNome() + "? " + m1.maeDe(f2));
		System.out.println(m1.getNome() + " é mãe de " + f3.getNome() + "? " + m1.maeDe(f3));
		
		System.out.println("------------------------------");
		
		System.out.println(m2.getNome() + " é mãe de " + f1.getNome() + "? " + m2.maeDe(f1));
		System.out.println(m2.getNome() + " é mãe de " + f2.getNome() + "? " + m2.maeDe(f2));
		System.out.println(m2.getNome() + " é mãe de " + f3.getNome() + "? " + m2.maeDe(f3));
		
		System.out.println("------------------------------");
		
		System.out.println(p1.getNome() + " é pai de " + f1.getNome() + "? " + p1.paiDe(f1));
		System.out.println(p1.getNome() + " é pai de " + f2.getNome() + "? " + p1.paiDe(f2));
		System.out.println(p1.getNome() + " é pai de " + f3.getNome() + "? " + p1.paiDe(f3));
		
		System.out.println("------------------------------");
		
		System.out.println(p2.getNome() + " é pai de " + f1.getNome() + "? " + p2.paiDe(f1));
		System.out.println(p2.getNome() + " é pai de " + f2.getNome() + "? " + p2.paiDe(f2));
		System.out.println(p2.getNome() + " é pai de " + f3.getNome() + "? " + p2.paiDe(f3));
		
		System.out.println("------------------------------");
		
		System.out.println(f1.getNome() + " e " + f2.getNome() + " tem a mesma mãe? " + Filho.temAmesmaMae(f1, f2));
		System.out.println(f1.getNome() + " e " + f3.getNome() + " tem a mesma mãe? " + Filho.temAmesmaMae(f1, f3));
		System.out.println(f2.getNome() + " e " + f3.getNome() + " tem a mesma mãe? " + Filho.temAmesmaMae(f2, f3));
		
		System.out.println("------------------------------");
		
		System.out.println(f1.getNome() + " e " + f2.getNome() + " tem o mesmo pai? " + Filho.temOmesmoPai(f1, f2));
		System.out.println(f1.getNome() + " e " + f3.getNome() + " tem o mesmo pai? " + Filho.temOmesmoPai(f1, f3));
		System.out.println(f2.getNome() + " e " + f3.getNome() + " tem o mesmo pai? " + Filho.temOmesmoPai(f2, f3));

		System.out.println("------------------------------");
		
		System.out.println(f1.getNome() + " e " + f2.getNome() + " são meio irmãos? " + Filho.saoMeioIrmaos(f1, f2));
		System.out.println(f1.getNome() + " e " + f3.getNome() + " são meio irmãos? " + Filho.saoMeioIrmaos(f1, f3));
		System.out.println(f2.getNome() + " e " + f3.getNome() + " são meio irmãos? " + Filho.saoMeioIrmaos(f2, f3));
	
	}

}
