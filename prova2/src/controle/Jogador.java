package controle;

public class Jogador {

	private String nome;
	private int Pontuacao;
	private int botatual;
	private Jogo jogo;
	private Personagem personagem1;
	private Personagem personagem2;
	private Personagem personagem3;
	private int numeroRodadas;
	private int numeroBugs;
	private int numeroAlunos;
	private int celulasVazias;
	
	public Jogador(String nome) {
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontuacao() {
		return Pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		Pontuacao = pontuacao;
	}

	public int getBotatual() {
		return botatual;
	}

	public void setBotatual(int botatual) {
		this.botatual = botatual;
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	public int getNumeroRodadas() {
		return numeroRodadas;
	}

	public void setNumeroRodadas(int numeroRodadas) {
		this.numeroRodadas = numeroRodadas;
	}

	public int getNumeroBugs() {
		return numeroBugs;
	}

	public void setNumeroBugs(int numeroBugs) {
		this.numeroBugs = numeroBugs;
	}

	public int getNumeroAlunos() {
		return numeroAlunos;
	}

	public void setNumeroAlunos(int numeroAlunos) {
		this.numeroAlunos = numeroAlunos;
	}

	public int getCelulasVazias() {
		return celulasVazias;
	}

	public void setCelulasVazias(int celulasVazias) {
		this.celulasVazias = celulasVazias;
	}

	public Personagem getPersonagem1() {
		return personagem1;
	}

	public void setPersonagem1(Personagem personagem1) {
		this.personagem1 = personagem1;
	}

	public Personagem getPersonagem2() {
		return personagem2;
	}

	public void setPersonagem2(Personagem personagem2) {
		this.personagem2 = personagem2;
	}

	public Personagem getPersonagem3() {
		return personagem3;
	}

	public void setPersonagem3(Personagem personagem3) {
		this.personagem3 = personagem3;
	}
	
	

}
