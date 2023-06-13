package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela extends JFrame {
	
	protected JPanel menu;
	protected JPanel painelGeral;
	protected OpcaoCadastro cadastro;
	protected OpcaoListar listar;
	protected OpcaoAtualizar atualizar;
	protected OpcaoDeletar deletar;
	protected ArrayList<JPanel> paineis;
	
	public Janela() {
		
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout(2, 1));
		this.setTitle("Laboratorio 3");
		
		menu = new JPanel();
		menu.setBackground(Color.darkGray);
		painelGeral = new JPanel();
		painelGeral.setLayout(new GridBagLayout());
		
		cadastro = new OpcaoCadastro();
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
		
		
		Botao botaoDeCadastrar = new Botao("Cadastrar", Color.LIGHT_GRAY);
		botaoDeCadastrar.addActionListener(new MostrarPainel(0));
		menu.add(botaoDeCadastrar);
		
		Botao botaoDeListar = new Botao("Listar", Color.LIGHT_GRAY);
		botaoDeListar.addActionListener(new MostrarPainel(1));
		menu.add(botaoDeListar);
		
		Botao botaoDeAtualizar = new Botao("Atualizar", Color.LIGHT_GRAY);
		botaoDeAtualizar.addActionListener(new MostrarPainel(2));
		menu.add(botaoDeAtualizar);
		
		Botao botaoDeDeletar = new Botao("Deletar", Color.LIGHT_GRAY);
		botaoDeDeletar.addActionListener(new MostrarPainel(3));
		menu.add(botaoDeDeletar);
		

		this.add(menu, BorderLayout.NORTH);
		this.add(painelGeral, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	
	
	
private class MostrarPainel implements ActionListener {
	
	int opcao;
	public MostrarPainel(int opcao) {
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