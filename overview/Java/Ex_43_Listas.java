package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Crie uma lista de nomes de cores em inglês e remova as cores que contenham a letra "u". */

public class Ex_43_Listas {

	public static void main(String[] args) {
		List<String> cores = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 1; i<=5; i++) {
			System.out.print("Digite uma cor em INGLÊS: ");
			cores.add(entrada.nextLine());
		}
		
		for(int i = 0; i < cores.size(); i++) {
			if(cores.get(i).contains("u")) {
				cores.remove(i);
				i--;
			}
			
			
		}
		
		System.out.println("Cores: " + cores);

	}

}
