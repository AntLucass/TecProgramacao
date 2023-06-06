
package lab2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela extends JFrame {
	
	protected JButton botaoDeCadastrar;
	protected JButton botaoDeListar;
	protected JButton botaoDeAtualizar;
	protected JButton botaoDeDeletar;
	protected JPanel menu;
	protected JPanel painelGeral;
	protected OpcaoCadastro cadastro;
	protected OpcaoListar listar;
	protected OpcaoAtualizar atualizar;
	protected OpcaoDeletar deletar;
	protected ArrayList<JPanel> paineis;
	
	
	public Janela() {
		
		this.setSize(500, 500);
		//this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout(2, 1));
		
		menu = new JPanel();
		menu.setBackground(Color.darkGray);
		painelGeral = new JPanel();
		painelGeral.setLayout(new GridBagLayout());
		
		cadastro = new OpcaoCadastro();
		cadastro.setBackground(Color.DARK_GRAY);
		listar = new OpcaoListar();
		atualizar = new OpcaoAtualizar();
		deletar = new OpcaoDeletar();
		
		painelGeral.add(cadastro);
		painelGeral.add(listar);
		painelGeral.add(atualizar);
		painelGeral.add(deletar);
		
		paineis = new ArrayList<JPanel>();
		paineis.add(0, cadastro);
		paineis.add(1, listar);
		paineis.add(2, atualizar);
		paineis.add(3, deletar);
		
		
		
		botaoDeCadastrar = new JButton("Cadastrar");
		botaoDeCadastrar.setBackground(Color.LIGHT_GRAY);
		botaoDeCadastrar.addActionListener(new showPaineis(0));
		menu.add(botaoDeCadastrar);
		
		botaoDeListar = new JButton("Listar");
		botaoDeListar.setBackground(Color.LIGHT_GRAY);
		botaoDeListar.addActionListener(new showPaineis(1));
		menu.add(botaoDeListar);
		
		botaoDeAtualizar = new JButton("Atualizar");
		botaoDeAtualizar.setBackground(Color.LIGHT_GRAY);
		botaoDeAtualizar.addActionListener(new showPaineis(2));
		menu.add(botaoDeAtualizar);
		
		botaoDeDeletar = new JButton("Deletar");
		botaoDeDeletar.setBackground(Color.LIGHT_GRAY);
		botaoDeDeletar.addActionListener(new showPaineis(3));
		menu.add(botaoDeDeletar);
		

		this.add(menu, BorderLayout.NORTH);
		this.add(painelGeral, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	
	
private class showPaineis implements ActionListener {
		int opcao;
		public showPaineis(int opcao) {
			this.opcao = opcao;
		}
		public void actionPerformed(ActionEvent e) {
			for(int i = 0; i< paineis.size(); i++) {
				paineis.get(i).setVisible(false);
			}
			
			if(paineis.get(opcao).isVisible())
				paineis.get(opcao).setVisible(false);
			else
				paineis.get(opcao).setVisible(true);
		}
}
}