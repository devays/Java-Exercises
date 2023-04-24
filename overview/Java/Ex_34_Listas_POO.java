package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex_34_Listas_POO {

	public static void main(String[] args) {
		
		List<Pessoa2> pessoas = new ArrayList<Pessoa2>();
		
		Pessoa2 p1 = new Pessoa2("Allan", 20, "Masculino");
		Pessoa2 p2 = new Pessoa2("Luís", 24, "Masculino");
		Pessoa2 p3 = new Pessoa2("Vanessa", 22, "Femenino");
		
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);

		Collections.sort(pessoas, new IdadeComparator());
		
		for(Pessoa2 pessoa : pessoas) {
			System.out.println("Nome: " + pessoa.getNome() + " Idade: " + pessoa.getIdade() + " Sexo: " + pessoa.getSexo());
		}

	}

}

class IdadeComparator implements Comparator<Pessoa2>{
	@Override
	public int compare(Pessoa2 p1, Pessoa2 p2) {
		return p1.getIdade() - p2.getIdade();
	}
}

