package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* Crie uma lista de nomes de filmes e ordene a lista em ordem alfabética inversa. */

public class Ex_46_Listas {

	public static void main(String[] args) {
		List<String> filmes = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 1; i<=5; i++) {
			System.out.print("Digite o nome de um filme: ");
			filmes.add(entrada.nextLine());
		}
		
		Collections.sort(filmes, Collections.reverseOrder());
		System.out.println();
		
		for(String valores : filmes) {
			System.out.println("Filme: " + valores);
		}
	}

}
