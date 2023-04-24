package Listas;

public class Funcionario {

	private String nome;
	private double salario;
	private String cargo;
	
	public Funcionario(String nome, double salario, String cargo) {
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected double getSalario() {
		return salario;
	}

	protected void setSalario(double salario) {
		this.salario = salario;
	}

	protected String getCargo() {
		return cargo;
	}

	protected void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	
}
