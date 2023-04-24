package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Crie uma classe Agenda que armazena uma lista de contatos (nome e telefone). Implemente métodos para adicionar, remover e buscar contatos. */

public class Ex_36_Listas_POO {

	public static void main(String[] args) {
		
		String nome;
		int telefone;
		
		List<Agenda> agenda = new ArrayList<Agenda>();
		Scanner entrada = new Scanner(System.in);
		
		Agenda a1 = new Agenda("Allan", 1197482030);
		Agenda a2 = new Agenda("Jao", 1495351230);
		Agenda a3 = new Agenda("Carlin", 1597321521);
		
		agenda.add(a1);
		agenda.add(a2);
		agenda.add(a3);
		
		System.out.println("Escolha o que fazer: ");
		System.out.println("1 - Adicionar uma nova pessoa");
		System.out.println("2 - Remover uma pessoa");
		System.out.println("3 - Pesquisar uma pessoa");
		
		int resposta = entrada.nextInt();
		
		if(resposta == 1) {
			System.out.println("Digite o nome: ");
			nome = entrada.next();
			System.out.println("Digite o telefone:");
			telefone = entrada.nextInt();
			System.out.println();
			Agenda a4 = new Agenda(nome, telefone);
			agenda.add(a4);
        }
		else if (resposta == 2) {
			System.out.println("Digite o nome: ");
			nome = entrada.next();
			boolean pessoaRemovida = false;
			for (Agenda pessoa : agenda) {
				if (pessoa.getNome().equals(nome)) {
					agenda.remove(pessoa);
					System.out.println("Pessoa removida com sucesso!\n");
					pessoaRemovida = true;
					break;
				}
			}
			if (!pessoaRemovida) {
				System.out.println("Não foi possível encontrar essa pessoa.\n");
			}
        }
		else if (resposta == 3) {
			System.out.println("Digite o nome: ");
			nome = entrada.next();
			boolean pessoaEncontrada = false;
			for (Agenda pessoa : agenda) {
				if (pessoa.getNome().equals(nome)) {
					System.out.println("\nPessoa encontrada.");
					System.out.println("Telefone: " + pessoa.getTelefone());
					System.out.println();
					pessoaEncontrada = true;
					break;
				}
			}
			if (!pessoaEncontrada) {
				System.out.println("Não foi possível encontrar essa pessoa.\n");
			}
		}
        else {
            System.out.println("Opção inválida!");
        }
		
		for(Agenda pessoas : agenda) {
			System.out.println("Nome: " + pessoas.getNome() + " Telefone: " + pessoas.getTelefone());
		}

	}

}
