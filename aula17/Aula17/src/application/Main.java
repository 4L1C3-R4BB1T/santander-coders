package application;

import java.util.ArrayList;
import java.util.List;

import entities.Animal;
import entities.Mamifero;
import entities.Passaro;

public class Main {

	public static void main(String[] args) {
		
		Animal mamifero = new Mamifero("Mam�fero");
		Animal passaro = new Passaro("P�ssaros");
		Animal animal = new Mamifero();
		
		List<Animal> lista = new ArrayList<>();
		
		lista.add(mamifero);
		lista.add(passaro);
		lista.add(animal);
		
		for (Animal a : lista) {
			if (a instanceof Mamifero) {
				System.out.println("� mam�fero...");
			}
			if (a instanceof Passaro) {
				System.out.println("� p�ssaro...");
			}
		}
			
	}

}
