package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* Crie uma lista de números inteiros e encontre o maior e o menor valor. */

public class Ex_42_Listas {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 1; i<=5; i++) {
			System.out.print("Digite um valor inteiro: ");
			numeros.add(entrada.nextInt());
		}
		
		System.out.println("Maior valor inserido: " + Collections.max(numeros));
		System.out.println("Menor valor inserido: " + Collections.min(numeros));
		
		
	}

}
