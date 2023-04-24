package Listas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/* Crie uma lista de nomes de animais e exiba quantas vezes cada animal aparece na lista. */

public class Ex_30_Listas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		List<String> animais = new ArrayList<>();

		// Lendo a lista de animais do usuário
		for(int i = 1; i <= 5; i++) {
		    System.out.print("Digite o nome de um animal: ");
		    animais.add(entrada.nextLine());
		}

		// Contando quantas vezes cada animal apareceu na lista
		Map<String, Integer> contagemAnimais = new HashMap<>();
		for(String animal : animais) {
		    if(contagemAnimais.containsKey(animal)) {
		        contagemAnimais.put(animal, contagemAnimais.get(animal) + 1);
		    } else {
		        contagemAnimais.put(animal, 1);
		    }
		}

		// Exibindo os resultados
		for(Map.Entry<String, Integer> entry : contagemAnimais.entrySet()) {
		    String animal = entry.getKey();
		    int quantidade = entry.getValue();
		    System.out.println("\nO animal " + animal + " apareceu " + quantidade + " vez(es) na lista.");
		}
		
		
	}

}
