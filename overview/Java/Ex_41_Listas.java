package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Crie uma lista de strings e remova todas as ocorrências de uma determinada palavra informada pelo usuário. */

public class Ex_41_Listas {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 1; i<=5; i++) {
			System.out.print("Digite algumas palavras: ");
			String palavrasUser = entrada.nextLine();
			palavras.add(palavrasUser);
		}
		
		System.out.print("Digite uma palavra para verificar se há na lista: ");
		String palavraBuscada = entrada.nextLine().toLowerCase();
		
		if(palavras.contains(palavraBuscada)) {
			System.out.println("A palavra está na lista! ");
		} else {
			System.out.println("A palavra não está na lista.");
		}
		
		System.out.println("Lista completa: " + palavras);
		
	}

}
