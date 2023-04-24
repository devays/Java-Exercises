package Listas;

public class Aluno {

	private String nome;
	private int idade;
	private double nota1;
	private double nota2;
	private double nota3;
	
	public Aluno(String nome, int idade, double nota1, double nota2, double nota3) {
		this.nome = nome;
		this.idade = idade;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected int getIdade() {
		return idade;
	}

	protected void setIdade(int idade) {
		this.idade = idade;
	}

	protected double getNota1() {
		return nota1;
	}

	protected void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	protected double getNota2() {
		return nota2;
	}

	protected void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	protected double getNota3() {
		return nota3;
	}

	protected void setNota3(double nota3) {
		this.nota3 = nota3;
	}


	
	
	
}
