package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Contato;
import entities.Endereco;

public class Main {

	// Escopo global
	static Scanner sc = new Scanner(System.in);
	static List<Contato> contatos = new ArrayList<Contato>();
	
	public static void main(String[] args) {
		
		boolean loop = true;
		
		do {
			System.out.print("***** Menu Principal ******\n"
							+ "[ 1 ] Adicionar Contato\n"
							+ "[ 2 ] Excluir Contato\n"
							+ "[ 3 ] Listar Contatos\n"
							+ "[ 4 ] Pesquisar Contato\n"
							+ "[ 0 ] Encerrar o Programa\n"
							+ "\nOpção Desejada: ");
			int op = sc.nextInt();
			
			System.out.println("");
			
			switch (op) {
			case 1:
				adicionarContato();
				break;
			case 2:
				excluirContato();
				break;
			case 3: 
				listarContatos();
				break;
			case 4: 
				pesquisarContato();
				break;
			case 0:
				System.out.println("Obrigado! Volte sempre!");
				loop = false;
				break;
			default: 
				System.out.println("Digite uma opção válida!");
			}
		} while (loop);
			
	}

	public static void adicionarContato() {
		// Contato
		System.out.print("ID: ");
		Integer id = sc.nextInt();
		
		System.out.print("Digite o nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Digite a idade: ");
		Integer idade = sc.nextInt();
		
		System.out.print("Digite o telefone: ");
		sc.nextLine();
		String telefone = sc.nextLine();
		
		// Endereço
		System.out.print("Digite a rua: ");
		String rua = sc.nextLine();
		
		System.out.print("Digite o nº: ");
		Integer numero = sc.nextInt();
		
		System.out.print("Digite o bairro: ");
		sc.nextLine();
		String bairro = sc.nextLine();
		
		System.out.print("Digite a cidade: ");
		String cidade = sc.nextLine();
		
		System.out.print("Digite o estado: ");
		String estado = sc.nextLine();
		
		contatos.add(new Contato(id, nome, idade, telefone, new Endereco(rua, numero, bairro, cidade, estado)));	
		
		System.out.println("Contato adicionado!\n");
	}
	
	public static void excluirContato() {
		System.out.print("Digite o ID do contato a ser excluído: ");
		int id = sc.nextInt();
		
		int index = procurarId(id);
		
		if (index == -1) {
			System.out.println("Não exite contato para o ID informado!\n");
		} else {
			contatos.remove(index);
			System.out.println("Contato excluído!\n");
		}
	}
	
	public static void pesquisarContato() {
		System.out.print("Digite o ID do contato: ");
		int id = sc.nextInt();
		
		int index = procurarId(id);
		
		if (index == -1) {
			System.out.println("Não exite contato para o ID informado!\n");
		} else {
			System.out.println(contatos.get(index) + "\n");
		}
	}

	public static void listarContatos() {
		if (contatos.isEmpty() ) {
			System.out.println("Não há contatos na lista!\n");
		} else {
			for (Contato c : contatos) {
				System.out.println(c + "\n");
			}
		}
	}
	
	// Método auxiliar para verificar se existe o ID na lista
	public static int procurarId(int id) {
		int flag = 0;
		
		for(Contato c : contatos) {
			if(c.getId() == id) {
				return flag;
			}
			flag++;
		}
		return -1;
	}

}





