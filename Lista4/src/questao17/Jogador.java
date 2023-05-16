package questao17;

public class Jogador {
	private String nome;
	private char simbolo;
	
	public Jogador(String nome, char simbolo) {
		super();
		this.setNome(nome);
		this.setSimbolo(simbolo);
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public char getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(char simbolo) {
		this.simbolo = simbolo;
	}

}
