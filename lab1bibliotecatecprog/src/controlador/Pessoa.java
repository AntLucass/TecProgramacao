package controlador;

public abstract class Pessoa implements ValidacaoEmprestimo, MaxPublicacoes, PagamentoTP{

	protected  int matricula;
	protected String nome;
	protected float tps;
	protected String tipo;
	protected int maxpublicacoes;
	protected int numdepublicacoes;
	
	public Pessoa(int matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.tps = 0;
		this.numdepublicacoes = 0;
	}
	
	
}
