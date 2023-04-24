package Listas;

public class Livro {

	private String nome;
	private String autor;
	private int ano;
	
	public Livro(String nome, String autor, int ano) {
		this.nome = nome;
		this.autor = autor;
		this.ano = ano;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected String getAutor() {
		return autor;
	}

	protected void setAutor(String autor) {
		this.autor = autor;
	}

	protected int getAno() {
		return ano;
	}

	protected void setAno(int ano) {
		this.ano = ano;
	}
	
    @Override
    public String toString() {
        return "Livro{" +
                "Título ='" + nome + '\'' +
                ", Autor ='" + autor + '\'' +
                ", Ano =" + ano +
                '}';
    }
	
}
