package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Crie uma lista de nomes de times de futebol e remova todos os times cujo nome começa com a letra "S". */

public class Ex_32_Listas {

	public static void main(String[] args) {
		
		List<String> times = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 1; i<=5; i++) {
			System.out.print("Digite um time de futebol: ");
			times.add(entrada.nextLine());
		}
		
		for(int i = 0; i < times.size(); i++) {
			if(times.get(i).toLowerCase().startsWith("s")) {
				times.remove(i);
				i--;
			}
		}
		
		System.out.println("\nTimes que não começam com a letra S: " + times);
	}

}
