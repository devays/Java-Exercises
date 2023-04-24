package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* Crie uma classe "Livro" com nome, autor e ano de lançamento. Crie uma lista de livros e ordene por ano de lançamento. */
 
public class Ex_48_Listas_POO {

	public static void main(String[] args) {
		
		List<Livro> livros = new ArrayList<Livro>();
		
		
		Livro l1 = new Livro("Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
		Livro l2 = new Livro("Cem Anos de Solidão", "Gabriel Garcia Marquez", 2014);
		Livro l3 = new Livro("Dom Quixote", "Miguel de Cervantes", 1616);
		Livro l4 = new Livro("A Divina Comédia", "Dante Alighieri", 1321);
		
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
		livros.add(l4);
		 
		Collections.sort(livros, Comparator.comparingInt(Livro::getAno));
		
		System.out.println("Livros: " + livros.toString());

	}

}
