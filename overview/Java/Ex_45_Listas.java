package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Crie uma lista de frutas e verifique se a fruta "banana" está presente na lista. */

public class Ex_45_Listas {

	public static void main(String[] args) {
		List<String> frutas = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		
		boolean possuiBanana = false;
		
		for(int i = 1; i<=5; i++) {
			System.out.print("Digite uma fruta: ");
			frutas.add(entrada.nextLine().toLowerCase());
		}
		
		for(int i = 0; i < frutas.size(); i++) {
			if(frutas.get(i).contains("banana")) {
				possuiBanana = true;
			}
		}
		
		if(possuiBanana) {
			System.out.println("\nA lista contém banana.");
		} else {
			System.out.println("\nA lista NÃO contém banana.");
		}

	}

}
