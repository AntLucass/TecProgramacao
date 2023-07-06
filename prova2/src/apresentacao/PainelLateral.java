package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controle.Jogador;
import controle.Jogo;



public class PainelLateral extends JPanel {

	protected Botao personagem1;
	protected Botao personagem2;
	protected Botao personagem3;
	protected Botao verificar;
	protected Botao proximaRodada;
	protected Botao sair;
	protected JLabel pontosJogador;
	protected JLabel perso1pts;
	protected JLabel perso2pts;
	protected JLabel perso3pts;
	protected JLabel numerobug;
	protected JLabel numeroalu;
	protected Jogo jogo;
	protected Tabuleiro tabuleiro;
	protected JanelaPrincipal janela;

	
  public PainelLateral(JanelaPrincipal janela, Tabuleiro tabuleiro, Jogo rodada, Jogador jogador) {
	   this.setLayout(new GridLayout(3, 1));
	   this.setBackground(new Color(68,14,11));
	   this.tabuleiro = tabuleiro;
	   this.jogo = rodada;
	   this.janela = janela;
	
	   
	    ImageIcon aluno = new ImageIcon("aluno.png");
		aluno.setImage(aluno.getImage().getScaledInstance(30, 30, 40));
		ImageIcon bug = new ImageIcon("bug.png");
		bug.setImage(bug.getImage().getScaledInstance(30, 30, 40));
		
		ImageIcon solucopont = new ImageIcon("soluco.png");
		solucopont.setImage(solucopont.getImage().getScaledInstance(50, 70, 50));
		ImageIcon banguelapont = new ImageIcon("banguela.png");
		banguelapont.setImage(banguelapont.getImage().getScaledInstance(49, 75, 50));
		ImageIcon astridpont = new ImageIcon("astrid.png");
		astridpont.setImage(astridpont.getImage().getScaledInstance(50, 70, 50));
		
		ImageIcon soluco = new ImageIcon("soluco.png");
		soluco.setImage(soluco.getImage().getScaledInstance(110, 200, 50));
		ImageIcon banguela = new ImageIcon("banguela.png");
		banguela.setImage(banguela.getImage().getScaledInstance(100, 220, 50));
		ImageIcon astrid = new ImageIcon("astrid.png");
		astrid.setImage(astrid.getImage().getScaledInstance(130, 250, 50));
		
		
		JPanel pontuacao = new JPanel();
		pontuacao.setBackground(new Color(68,14,11));
		pontuacao.setLayout(new GridLayout(3, 1));
		JPanel barraPts = new JPanel();
		barraPts.setBackground(new Color(142,107,35));
		barraPts.add(new JLabel("Pontuacao: "));
		pontosJogador = new JLabel("0");
		barraPts.add(pontosJogador);
		JPanel AlunoBug = new JPanel();
		AlunoBug.setBackground(new Color(142,107,35));
		numeroalu = new JLabel("0");
		numerobug = new JLabel("0");
		AlunoBug.add(new JLabel("Total: "));
		AlunoBug.add(new JLabel(aluno));
		AlunoBug.add(numeroalu);
		AlunoBug.add(new JLabel(bug));
		AlunoBug.add(numerobug);
		
		JPanel pontuacaoPersonagens = new JPanel();
		pontuacaoPersonagens.setBackground(new Color(142,107,35));
		perso1pts = new JLabel("0");
		perso2pts = new JLabel("0");
		perso3pts = new JLabel("0");
		
		pontuacaoPersonagens.add(new JLabel(solucopont));
		pontuacaoPersonagens.add(perso1pts);
		
		pontuacaoPersonagens.add(new JLabel(banguelapont));
		pontuacaoPersonagens.add(perso2pts);
		
		pontuacaoPersonagens.add(new JLabel(astridpont));
		pontuacaoPersonagens.add(perso3pts);
		pontuacao.add(barraPts);
		pontuacao.add(AlunoBug);
		pontuacao.add(pontuacaoPersonagens);
		
		
		JPanel PainelDePersonagens = new JPanel();
		PainelDePersonagens.setBackground(new Color(139,69,19));
		
		Botao botao1 = new Botao("", new Color(142,107,35));
		botao1.setIcon(soluco);
	    botao1.setPreferredSize(new Dimension(100,200));
	    botao1.addActionListener(new acionarPersonagem(botao1, 0));
	    
	    Botao botao2 = new Botao("",new Color(142,107,35));
	    botao2.setIcon(banguela);
		botao2.setPreferredSize(new Dimension(100,200));
		botao2.addActionListener(new acionarPersonagem(botao2, 1));
		
		Botao botao3 = new Botao("", new Color(142,107,35));
		botao3.setPreferredSize(new Dimension(100,200));
		botao3.setIcon(astrid);
		botao3.addActionListener(new acionarPersonagem(botao3, 2));
		
		PainelDePersonagens.add(botao1);
		PainelDePersonagens.add(botao2);
		PainelDePersonagens.add(botao3);
		
		
		JPanel painelDeAcoes = new JPanel();
		painelDeAcoes.setBackground(new Color(68,14,11));
		painelDeAcoes.setLayout(new GridLayout(3, 1));
		
		verificar = new Botao("Verificar", new Color(154,205,50));
		verificar.addActionListener(new Verificar());
		
		proximaRodada = new Botao("Proxima rodada", new Color(154,205,50));
		proximaRodada.addActionListener(new ProximaRodada(botao1, botao2, botao3));
		
		sair = new Botao("Sair", Color.red);
		sair.addActionListener(new Sair());
		
		painelDeAcoes.add(verificar);
		painelDeAcoes.add(proximaRodada);
		painelDeAcoes.add(sair);
		
		
		this.add(pontuacao, BorderLayout.NORTH);
		this.add(PainelDePersonagens, BorderLayout.CENTER);
		this.add(painelDeAcoes, BorderLayout.SOUTH);
		
		this.setVisible(true);
}

  
  
  
  public class acionarPersonagem implements ActionListener{
		Botao botao;
		int Id;
		
		public acionarPersonagem(Botao botao, int Id) {
			this.botao = botao;
			this.Id = Id;
			
		}

		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < 64; i++) {
				if (tabuleiro.listaDeBotoes.get(i).getBackground() == Color.black)
					tabuleiro.listaDeBotoes.get(i).setEnabled(false);
				   
				else
					tabuleiro.listaDeBotoes.get(i).setEnabled(true);
				
			}
			tabuleiro.jogador.setBotatual(Id);
			botao.setEnabled(false);
			jogo.setPersonagem(Id);
		}
	}
  
  
  
         public class Verificar implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			jogo.verificarCelula();
			pontosJogador.setText("" + jogo.pontosJogador());
			perso1pts.setText("" + jogo.pontosPersonagem(0));
			perso2pts.setText("" + jogo.pontosPersonagem(1));
			perso3pts.setText("" + jogo.pontosPersonagem(2));
			numeroalu.setText("" + jogo.qtdAluno());
			numerobug.setText("" + jogo.qtdBugs());
			String relatorio = "Numero de Rodadas: " + jogo.numRodadas 
					+ "\n" + jogo.personagem1.getNome() + "\n" + jogo.personagem1.getRelato()
					+ "\n\n" + jogo.personagem2.getNome() + "\n" + jogo.personagem2.getRelato()
					+ "\n\n" + jogo.personagem3.getNome() + "\n" + jogo.personagem3.getRelato();
			JOptionPane.showMessageDialog(null, relatorio, "Relatório Atual da Partida", JOptionPane.INFORMATION_MESSAGE);
			
			if(jogo.fimDeJogo()) {
				JOptionPane.showMessageDialog(null, "Parabens! \nVoce resgatou todos os alunos!");
				jogo.finalizarJogo(janela);
			}
		}
	}
  
  
  
  
       public class ProximaRodada  implements ActionListener {
		Botao personagem1;
		Botao personagem2;
		Botao personagem3;
		
		public ProximaRodada(Botao personagem1, Botao personagem2, Botao persogagem3) {
			this.personagem1 = personagem1;
			this.personagem2 = personagem2;
			this.personagem3 = persogagem3;
		}

		public void actionPerformed(ActionEvent e) {
			jogo.proximaRodada();
			personagem1.setEnabled(true);
			personagem2.setEnabled(true);
			personagem3.setEnabled(true);
			jogo.personagem1.setRelato("");
			jogo.personagem2.setRelato("");
			jogo.personagem3.setRelato("");
		}
	}

  
  
  
  public class Sair implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			jogo.finalizarJogo(janela);
			
		}

	}
  
  
}
