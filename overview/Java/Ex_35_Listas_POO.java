package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* Crie uma classe Pessoa com atributos nome, idade e sexo. Em seguida, crie uma lista de pessoas e implemente um método para ordená-la em ordem alfabética pelo nome. */

public class Ex_35_Listas_POO {

	public static void main(String[] args) {
		
		List<Pessoa3> pessoas = new ArrayList<Pessoa3>();
		
		Pessoa3 p1 = new Pessoa3("Cláudio", 23, "Masculino");
		Pessoa3 p2 = new Pessoa3("Benver", 44, "Masculino");
		Pessoa3 p3 = new Pessoa3("Aaaola", 20, "Femenino");
		
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		
		 Collections.sort(pessoas, new Comparator<Pessoa3>() {
		     public int compare(Pessoa3 p1, Pessoa3 p2) {
		    	 return p1.getNome().compareTo(p2.getNome());
		        }
		    });
		
		
		for(Pessoa3 pessoa : pessoas) {
			System.out.println("Nome: " + pessoa.getNome() + " Idade: " + pessoa.getIdade() + " Sexo: " + pessoa.getSexo());
		}

	}

}
