package Listas;

import java.util.ArrayList;
import java.util.List;

/* Crie uma classe "Produto" com nome e preço. Crie uma lista de produtos e calcule o preço total da lista. */

public class Ex_47_Listas_POO {

	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<Produto>();
		
		double total = 0;
		
		Produto p1 = new Produto("Régua", 1.50);
		Produto p2 = new Produto("Lápis", 2.35);
		Produto p3 = new Produto("Agenda", 7.45);
		Produto p4 = new Produto("Caneta Preta", 4.99);

		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		
		for(Produto itens : produtos) {
			total = total + itens.getPreco();
		}
		
		System.out.println("Total da lista: " + total);
		
	}

}
