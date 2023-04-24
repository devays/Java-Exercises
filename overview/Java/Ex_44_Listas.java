package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Crie uma lista de números inteiros e some todos os valores pares. */

public class Ex_44_Listas {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		
		int total = 0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("Digite um valor inteiro: ");
			numeros.add(entrada.nextInt());
		}
		
		for(int valores : numeros) {
			if(valores % 2 == 0) {
				total = total + valores;
			}
		}
		
		
		System.out.println("\nLista digitada: " + numeros);
		System.out.println("Soma apenas dos números pares: " + total);

	}

}
