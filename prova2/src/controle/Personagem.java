package controle;

import java.util.Scanner;

public class Personagem{
	
	private String nome;
	private int id;
	private int pontos;
	private int numeroAlunos;
	private int numeroBugs;
	private String relato = "";
	
	public Personagem(String nome, int id) {
		this.setNome(nome);
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public int getnumeroAlunos() {
		return numeroAlunos;
	}
	public void setnumeroAlunos(int numeroAlunos) {
		this.numeroAlunos = numeroAlunos;
	}
	public int getnumeroBugs() {
		return numeroBugs;
	}
	public void setnumeroBugs(int numeroBugs) {
		this.numeroBugs = numeroBugs;
	}
	public String getRelato() {
		return relato;
	}
	public void setRelato(String relato) {
		this.relato = relato;
	}
		
}