package Listas;

public class Agenda {

	private String nome;
	private int telefone;
	
	public Agenda(String nome, int telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected int getTelefone() {
		return telefone;
	}

	protected void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
	
	
}
