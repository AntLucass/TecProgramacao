package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controle.Jogador;
import controle.Jogo;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class JanelaPrincipal extends JFrame{
	public PainelSuperior painelSuperior;
	public Jogo jogo;
	public Tabuleiro tabuleiro;
	public PainelLateral painelLateral;
	public JPanel painelPrincipal;
	public Jogador jogador;
	public Image imagem = Toolkit.getDefaultToolkit().getImage("verificado.png");
			
	
	public JanelaPrincipal() {
		this.setSize(700, 100);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setResizable(false);
		this.setTitle("prova 2");
		this.setIconImage(imagem);
		
		jogador = new Jogador("");
		jogo = new Jogo();
		jogador.setJogo(jogo);
		tabuleiro = new Tabuleiro(jogo, jogador);
		painelLateral = new PainelLateral(this, tabuleiro , jogo, jogador);
		
		painelPrincipal = new JPanel();
		painelPrincipal.setLayout(new BorderLayout());
		painelPrincipal.setPreferredSize(new Dimension(1000,700));
		painelPrincipal.add(tabuleiro, BorderLayout.CENTER);
		painelPrincipal.add(painelLateral, BorderLayout.EAST);
	    painelPrincipal.setVisible(false);
	
		painelSuperior = new PainelSuperior(this);
		
		this.add(painelSuperior, BorderLayout.NORTH);
		this.add(painelPrincipal, BorderLayout.CENTER);
		this.setVisible(true);
	}

}
