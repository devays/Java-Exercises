package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_33_Listas {

	public static void main(String[] args) {
		
		List<String> valores = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 1; i<=5; i++) {
			System.out.print("Digite uma string: ");
			valores.add(entrada.nextLine());
		}
		
		for(int i = 0; i < valores.size(); i++) {
			if(!valores.get(i).toLowerCase().startsWith("a")) {
				valores.remove(i);
				i--;
			}
			
		}
		
		System.out.println("Valores: " + valores);

	}

}
