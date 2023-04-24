package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Crie uma classe Funcionario com atributos nome, salário e cargo. 
 * Implemente um método que reajusta o salário de acordo com um percentual informado pelo usuário.*/

public class Ex_39_Listas_POO {

	public static void main(String[] args) {
		
		List<Funcionario> func = new ArrayList<Funcionario>();
		Scanner entrada = new Scanner(System.in);
		
		int percentual = 0;
		double porcentagem = 0;
		
		
		Funcionario f1 = new Funcionario("Claudecir", 4000, "Gerente de Vendas");
		Funcionario f2 = new Funcionario("Aldo", 2000.52, "Gestor de Tráfego");
		Funcionario f3 = new Funcionario("João Gomes", 6500.32, "Analista de Projetos");
		
		func.add(f1);
		func.add(f2);
		func.add(f3);
		
		System.out.println("Digite um percentual, e ele irá somar com o valor do salário: ");
		percentual = entrada.nextInt();
		porcentagem = percentual / 100;
		
		
		for(Funcionario imp : func) {
			double salario = imp.getSalario();
			double acrescimo = salario * (percentual / 100.0);
			salario += acrescimo;
			imp.setSalario(salario);
			System.out.println("Nome: " + imp.getNome() + " - Salário: " + imp.getSalario() + " - Cargo: " + imp.getCargo());
		}
	

	}

}
