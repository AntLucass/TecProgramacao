package sistema;

public class Usuario { 

	private String nome;
	private String cpf;
	private int matricula;
	private String vertente;
	
	
	public Usuario(String nome, String cpf, int matricula, String vertente) {
		
super();
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.vertente = vertente;
	}


	public String getVertente() {
		return vertente;
	}


	public void setVertente(String vertente) {
		this.vertente = vertente;
	}


	public String getNome() {
		return nome;
	}


	public String getCpf() {
		return cpf;
	}


	public int getMatricula() {
		return matricula;
	}
	
	
	
}
