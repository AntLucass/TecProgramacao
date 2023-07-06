package apresentacao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PainelSuperior extends JPanel {

	protected JLabel nomeJogador;
	protected JTextField inserirNome;
	protected String nome = "";
	protected Botao jogar;
	protected Botao relatorio;
	

	public PainelSuperior(JanelaPrincipal janela) {
		this.setLayout(new GridLayout(1, 3, 20, 1));
		this.setBackground(new Color(142,107,35));
		this.setPreferredSize(new Dimension(700,50));
		
		nomeJogador = new JLabel("Jogador: ");
		inserirNome = new JTextField();
		
		jogar = new Botao("Jogar", new Color(154,205,50));
		jogar.addActionListener(new IniciarJogo(inserirNome, nome, janela));
	
		relatorio = new Botao("Relatorio do Jogo", new Color(154,205,50));
		relatorio.addActionListener(new RelatorioDosJogos(janela));
		
		
		this.add(nomeJogador);
		this.add(inserirNome);
		this.add(jogar);
		
	}
	

	
	
	
	
public class IniciarJogo implements ActionListener {
	
	String nome;
	JTextField inputNome;
	JanelaPrincipal janela;
	
	public IniciarJogo(JTextField inputNome,String nome, JanelaPrincipal janela) {
		this.nome = nome;
		this.inputNome = inputNome;
		this.janela = janela;
	}

	public void actionPerformed(ActionEvent e) {
		this.nome = inputNome.getText();
		if (nome.length() > 0) {
			janela.painelSuperior.inserirNome.setEnabled(false);
			janela.jogador.setNome(nome);
			
			janela.setSize(1000,700);
			janela.setLocationRelativeTo(null);
			
			janela.painelPrincipal.setVisible(true);
			janela.painelSuperior.add(janela.painelSuperior.relatorio);
			
		}
	}
}
	
	
	
public class RelatorioDosJogos implements ActionListener {

	JanelaPrincipal janela;
	Tabela tabela;
	
	public RelatorioDosJogos(JanelaPrincipal janela) {
	
		tabela = new Tabela();
		tabela.setPreferredSize(new Dimension(900,400));
	}

	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, tabela, "Relatório Das Partidas", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
	
	
	
	
	
}

