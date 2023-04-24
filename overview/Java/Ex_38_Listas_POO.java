package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Crie uma classe Aluno com atributos nome, idade e notas (lista de doubles). 
 * Implemente um método que calcula a média das notas e outro que verifica se o aluno foi aprovado (média maior ou igual a 7). */ 

public class Ex_38_Listas_POO {

	public static void main(String[] args) {
		
		List<Aluno> listaAlunos = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		
		double media = 0;
		boolean aprovado = false;
		
		Aluno a1 = new Aluno("Allan", 20, 9.5, 7.8, 8.8);
		Aluno a2 = new Aluno("Paulo", 55, 3.6, 9.8, 8.1);
		Aluno a3 = new Aluno("Jean", 14, 8.2, 7.3, 4.6);
		
		listaAlunos.add(a1);
		listaAlunos.add(a2);
		listaAlunos.add(a3);
		
		double total = 0;
		
		for(Aluno aluno : listaAlunos) {
			total = aluno.getNota1() + aluno.getNota2() + aluno.getNota3();
			media = total / listaAlunos.size();
			if(media >= 7) {
				aprovado = true;
			} else {
				aprovado = false;
			}
		    System.out.println("Nome: " + aluno.getNome() + " - Soma das notas: " + total + " - Média: " + String.format("%.2f", media) + " - Aprovado? " + aprovado);
		}
		
		
		
		
		
		

	}

}
