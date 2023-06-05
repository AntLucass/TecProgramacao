package prova1;

public class Aluno extends Pontuadores{

	public Aluno(int id, Plano plano) {
		super(id, plano);
		nome = "Aluno";
		pontuacao = 10;
		caractere = '@';
		visibilidade = false;
	}

}
