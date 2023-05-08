package controlador;

public class Aluno extends Pessoa {

	
	public Aluno(int matricula, String nome) {
		super(matricula, nome);
		this.tipo ="Aluno";
	}

	public int verificarDias() {
		return 10;
	}

	public int maxPublicacoes() {
		return 5;
	}

	public float pagamentotp() {
		return 10 ;
	}


}
