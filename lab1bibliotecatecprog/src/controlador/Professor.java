package controlador;

public class Professor extends Pessoa {

	public Professor(int matricula, String nome) {
		super(matricula, nome);
		this.tipo ="Professor";
	}

	public int verificarDias() {
		return 20;
	}

	public int maxPublicacoes() {
		return 10;
	}

	public float pagamentotp() {
		return 25;
	}

}
