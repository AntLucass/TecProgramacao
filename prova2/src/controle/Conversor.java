package controle;

import java.util.ArrayList;

import controle.Jogador;
import persistencia.Leitura;
import persistencia.Salvar;

public class Conversor {
	private ArrayList<Jogador> listaJogadores;
	private Leitura leitura;

	public Conversor() {
		leitura = new Leitura();
		listaJogadores = leitura.getLista();
	}

	public void novoJogador(Jogador jogador) {
		listaJogadores.add(jogador);
		Salvar save = new Salvar();
		save.SalvarDados("Dado/dados", converterDados(), true);
	}
	
public void salvarRodada(Jogador jogador) {
		
		jogador.setNumeroRodadas(jogador.getJogo().qtdRodadas());
		jogador.setNumeroBugs(jogador.getJogo().qtdBugs());
		jogador.setNumeroAlunos(jogador.getJogo().qtdAluno());
		jogador.setCelulasVazias(jogador.getJogo().qtdCelulasVazias());
		jogador.setPontuacao(jogador.getJogo().pontosJogador());
		
		novoJogador(jogador);
		
		Salvar save = new Salvar();
		save.SalvarDados("Dados/dados", converterDados(), true);
	
	}
	

	public String[] dadosParaTabela(int i) {
		String[] dados;
		try {
			dados = leitura.getLinha().get(i).split(";");
			return dados;
		} catch (Exception e) {
			
		}
		return null;
	}
	
	
	public String converterDados() {
		String saida = "";
		for (Jogador jogador : listaJogadores) {
			saida = saida + jogador.getNome() + ";" + jogador.getNumeroRodadas() + ";" + jogador.getNumeroBugs() + ";"
					+ jogador.getNumeroAlunos() + ";" +jogador.getCelulasVazias() + ";" + jogador.getJogo().pontosPersonagem(0) 
					+ ";" + jogador.getJogo().pontosPersonagem(1) + ";" + jogador.getJogo().pontosPersonagem(2) + ";" 
					+ jogador.getJogo().pontosJogador() + "\n";
		}
		return saida;
	}
	
	public ArrayList<Jogador> getListaJogadores() {
		return listaJogadores;
	}

}