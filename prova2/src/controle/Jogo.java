package controle;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import apresentacao.JanelaPrincipal;
import apresentacao.Tabela;
import persistencia.Leitura;
import persistencia.Salvar;

public class Jogo {
	public Plano plano;
	public ArrayList<Personagem> listaPersonagens;
	public Personagem personagem1;
	public Personagem personagem2;
	public Personagem personagem3;
	public ArrayList<Integer> celulasDaRodada;
	public ArrayList<Integer> personagensDaRodada;
	public int numRodadas;
	public Leitura ler;
	public Salvar save;
	public ArrayList<String> relatorioDasPartidas; 
	public Jogador jogador;
	public Conversor lista;


	public Jogo() {
		plano = new Plano();
		celulasDaRodada = new ArrayList<Integer>();
		personagensDaRodada = new ArrayList<Integer>();
		listaPersonagens = new ArrayList<Personagem>();
		lista = new Conversor();
		
		personagem1 = new Personagem("Soluco" ,1);
		personagem2 = new Personagem("Banguela" ,2);
		personagem3 = new Personagem("Astrid", 3);
		listaPersonagens.add(personagem1);
		listaPersonagens.add(personagem2);
		listaPersonagens.add(personagem3);
		
		
	}

	public void setPersonagem(int personagem) {
		personagensDaRodada.add(personagem);
	}

	public void setCelula(int celula) {
		celulasDaRodada.add(celula);
	}

	public void proximaRodada() {
		numRodadas++;
		personagensDaRodada.clear();
		celulasDaRodada.clear();
	}

	public void verificarCelula() {
		for (int i = 0; i < personagensDaRodada.size(); i++) {
			Personagem roboAux = listaPersonagens.get(personagensDaRodada.get(i));
			Celula celulaAux = plano.getListaCelulas().get(celulasDaRodada.get(i));
			temAlunoOuBug(celulaAux, roboAux);
			
			celulaAux.setCelulaVisitada(true);;
		}
	}

	public void temAlunoOuBug(Celula celula, Personagem robo) {
		if (celula.getAluno() == true){
			robo.setnumeroAlunos(robo.getnumeroAlunos() + 1);
			robo.setPontos(robo.getPontos() + 10);
			robo.setRelato("Achou um Aluno");
			celula.setAluno(false);
		}
		else{
			if (celula.getBug() == true) {
				robo.setnumeroBugs(robo.getnumeroBugs() + 1);
				robo.setPontos(robo.getPontos() - 15);
				robo.setRelato("Achou um Bug");
				celula.setBug(false);
			}
			else {
				robo.setRelato("Achou nada");
			}
		}
	}

	
	public int qtdAluno() {
		int nAlu = 0;
		for (int i = 0; i < listaPersonagens.size(); i++) {
			nAlu = nAlu + listaPersonagens.get(i).getnumeroAlunos();
		}
		return nAlu;
	}
	
	public int qtdBugs() {
		int nbug = 0;
		for (int i = 0; i < listaPersonagens.size(); i++) {
			nbug = nbug + listaPersonagens.get(i).getnumeroBugs();
		}
		return nbug;
	}
	
	
	public int pontosJogador() {
		int pts = 0;
		for (int i = 0; i < listaPersonagens.size(); i++) {
			pts = pts + listaPersonagens.get(i).getPontos();
		}
		return pts;
	}
	
	
	public int pontosPersonagem(int i) {
		return listaPersonagens.get(i).getPontos();
	}

	
	public int qtdRodadas() {
		return numRodadas;
	}

	public int qtdCelulasVazias() {
		return ((3 * qtdRodadas()) - qtdAluno() - qtdBugs());
	}
	
	public boolean fimDeJogo() {
		boolean controle = true;
		for(Celula cel: plano.getListaCelulas()) {
			if(cel.getAluno() == true) 
				controle = false;
		}
		return controle;
	}

	public void finalizarJogo(JanelaPrincipal janela) {
		Jogador jogador = janela.jogador;
		lista.salvarRodada(jogador);
		
		String textofinal = ("Obrigado " + jogador.getNome() + " por Jogar A Ilha Java v2\n" 
		+ "Sua Pontuacao foi: " + jogador.getPontuacao() + "\n Voce jogou "+ jogador.getNumeroRodadas() + " rodadas\nE achou " + jogador.getCelulasVazias() 
		+ " celulas vazias\nAchou " + jogador.getNumeroAlunos() + " alunos e " + jogador.getNumeroBugs() + " bugs\n"
		+ "\nSoluco fez " + personagem1.getPontos() + " pontos\nE achou "+ personagem1.getnumeroAlunos() + " alunos e "+ personagem1.getnumeroBugs()+" bugs \n\n"
		+ "Banguela fez " + personagem2.getPontos() + " pontos\nE achou "+ personagem2.getnumeroAlunos() + " alunos e "+ personagem2.getnumeroBugs()+" bugs \n\n"
		+ "Astrid fez " + personagem3.getPontos() + " pontos\nE achou "+ personagem3.getnumeroAlunos() + " alunos e "+ personagem3.getnumeroBugs()+" bugs \n\n\n");
		
		JOptionPane.showInternalConfirmDialog(null, textofinal + "Veja agora a Tabela de Pontuacao ", "Final", JOptionPane.DEFAULT_OPTION);
		
		   janela.dispose();
		   Tabela tabela = new Tabela();
		   tabela.setPreferredSize(new Dimension(900,400));
		   JOptionPane.showMessageDialog(null, tabela, "Relatório Das Partidas", JOptionPane.INFORMATION_MESSAGE);
        
	
			
		}
		
	
}