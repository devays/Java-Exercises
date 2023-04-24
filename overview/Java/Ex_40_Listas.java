package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* Crie uma lista de inteiros e ordene-a em ordem decrescente. */

public class Ex_40_Listas {

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 1; i<=5; i++) {
			System.out.print("Digite um valor: ");
			int valor = entrada.nextInt();
			numeros.add(valor);
		}
		
		
		Collections.sort(numeros, Collections.reverseOrder());
		System.out.println("Lista em ordem decrescente: " + numeros);

	}

}
