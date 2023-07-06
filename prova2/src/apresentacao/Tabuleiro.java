package apresentacao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import controle.Celula;
import controle.Jogador;
import controle.Plano;
import controle.Jogo;


public class Tabuleiro extends JPanel {
	protected Plano plano = new Plano();
	protected Celula celula;
	protected ArrayList<Celula> listaDecelulas = plano.getListaCelulas();
	protected ArrayList<Botao> listaDeBotoes;
	protected Jogador jogador;
	protected ImageIcon soluco = new ImageIcon("soluco.png");
	protected ImageIcon banguela = new ImageIcon("banguela.png");
	protected ImageIcon astrid = new ImageIcon("astrid.png");
	protected Jogo jogo;
	


	public Tabuleiro(Jogo rodada, Jogador jogador) {
		
		this.setPreferredSize(new Dimension(800,800));
		this.setLayout(new GridLayout(8,8));
		this.setBackground(Color.LIGHT_GRAY);
		this.jogador = jogador;		
		this.jogo = rodada;
		
		listaDeBotoes = new ArrayList<Botao>();
		int indice = 0;
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				  if (j % 2 == 0 && i%2 != 0 || j % 2 != 0 && i%2 == 0) {
				  Botao botao = new Botao("", new Color(85,107,47));
				  botao.addActionListener(new botaoDaCelula(indice));
				  celula = new Celula(indice);
				  
				  plano.getListaCelulas().add(celula);
				  botao.setEnabled(false);
				  botao.id = indice;
				
				 indice++;
				 listaDeBotoes.add(botao);
				 this.add(botao);
				 
				  }else {
					  Botao botao = new Botao("", new Color(154,205,50));
					  botao.addActionListener(new botaoDaCelula(indice));
 	     			  celula = new Celula(indice);
 	     			  
 					  plano.getListaCelulas().add(celula);
 					  botao.setEnabled(false);
 					  botao.id = indice;
					 
				 indice++;
				 listaDeBotoes.add(botao);
				 this.add(botao);
				 }
					
			}
			  
		}
		
		plano.setListaCelulas(listaDecelulas);
	}
	
	
	
	private class botaoDaCelula implements ActionListener{
		int cel;
		
		public botaoDaCelula(int celula) {
			cel = celula;
			
		}
		
		public void actionPerformed(ActionEvent e) {
			for(int i = 0;i<64;i++) {
				
				listaDeBotoes.get(i).setEnabled(false);
				JButton a = (JButton) e.getSource();
				a.setIcon(verificarPersonagem(jogador.getBotatual()));
				
			}
			listaDeBotoes.get(cel).setBackground(Color.black);
			jogo.setCelula(cel);
		}
	}

		
		private Icon verificarPersonagem(int a) {
			ImageIcon icone = null;
	
			if(a==0) {
				icone = soluco;
				icone.setImage(icone.getImage().getScaledInstance(50, 70, 50));
				
			}else {
				if(a==1) {
					icone = banguela;
					icone.setImage(icone.getImage().getScaledInstance(49, 75, 50));
					
				}else {
					if(a==2) {
					icone = astrid;
					icone.setImage(icone.getImage().getScaledInstance(50, 70, 50));
					
					}
				}
			}
				
			return icone;
		}
}
	
	
	

