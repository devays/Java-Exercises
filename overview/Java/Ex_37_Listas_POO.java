package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Crie uma classe VetorInt que armazena uma lista de números inteiros. 
 * Implemente métodos para adicionar, remover e buscar elementos na lista, além de um método que retorna a média dos valores na lista. */ 

public class Ex_37_Listas_POO {

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		
		int media = 0;
		int total = 0;
		
		numeros.add(5);
		numeros.add(2);
		numeros.add(7);
		
		
		
		System.out.println("Escolha o que você quer fazer: ");
		System.out.println("1 - Adicionar um valor");
		System.out.println("2 - Remover um valor");
		System.out.println("3 - Buscar um valor");
		System.out.print("Digite uma opção: ");
		int resposta = entrada.nextInt();
		
		if(resposta == 1) {
			System.out.print("\nDigite um valor que você queira adicionar: ");
			int valor = entrada.nextInt();
			while(numeros.contains(valor)) {
				System.out.print("Já existe esse valor, digite outro: ");
				valor = entrada.nextInt();
			}
			System.out.println("\nValor adicionado com sucesso!");
			numeros.add(valor);
		}
		
		else if(resposta == 2) {
			System.out.print("\nDigite um valor: ");
			int valor = entrada.nextInt();
			int index = numeros.indexOf(valor);
		    if(index != -1) {
		        numeros.remove(index);
		    } else {
				System.out.println("Não existe esse número.");
			}
		}
		
		else if(resposta == 3) {
			System.out.print("\nDigite um número para verificar: ");
			int valor = entrada.nextInt();
			if(numeros.contains(valor)) {
				System.out.println("O número existe na lista!");
			} else {
				System.out.println("O número não existe na lista!");
			}
		} else {
			System.out.println("Alternativa incorreta!");
		}
		
		for(int valores : numeros) {
			total = total + valores;
			media = total / numeros.size();
		}
		
		System.out.println("\nLista dos número: " + numeros);
		System.out.println("Média dos resultados: " + media);
		

	}

}
