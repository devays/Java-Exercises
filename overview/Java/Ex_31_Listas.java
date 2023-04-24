package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Crie uma lista de números inteiros e calcule o produto de todos os elementos. */

public class Ex_31_Listas {

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		
		int produto = 1;
		
		for(int i = 1; i<=5; i++) {
			System.out.print("Digite um número: ");
			numeros.add(entrada.nextInt());
		}
		
		for(int i = 0; i < numeros.size(); i++) {
			produto = produto * numeros.get(i);
		}
		
		System.out.println(produto);
	}

}
