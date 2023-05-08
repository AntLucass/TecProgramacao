package controlador;

public class Servidor extends Pessoa {

	public Servidor(int matricula, String nome) {
		super(matricula, nome);
		this.tipo ="Servidor";
		
	}

	public int verificarDias() {
		return 15;
	}

	public int maxPublicacoes() {
		return 7;
	}

	public float pagamentotp() {
		return 15;
	}

}
