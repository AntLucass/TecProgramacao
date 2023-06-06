package lab2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela1 extends JFrame{

	

	public JLabel janela;
	public JPanel painel1;
	public JPanel painel2;
	
	public Janela1() {
		janela = new JLabel();
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(1,1));

		painel1 = criarPainel(Color.black);
		painel1.add(janela);
		janela.add(painel1, BorderLayout.NORTH);
	
		/*
		painel2 = criarPainel(Color.blue);
		painel2.add(janela);
		this.add(painel2);
		painel2.setLayout(new BorderLayout());
	    painel2.add(new Button("Okay"), BorderLayout.SOUTH);
	    painel2.setVisible(false);
		*/
		
		
		JButton botao1 = criarbotao(Color.GRAY,"Cadrastro");
		painel1.add(botao1);
		
		
		JButton botao2 = criarbotao(Color.GRAY,"test1");
		painel1.add(botao2);
		
		JButton botao3 = criarbotao(Color.GRAY,"test1");
		painel1.add(botao3);
		
		
		
		
		
		//painel2.setVisible(teladecadrastro());
	
		this.setVisible(true);
	}
	public JPanel criarPainel(Color c) {
		JPanel painel = new JPanel();
		painel.setBackground(c);
		return painel;}
	
	public JButton criarbotao(Color c, String s) {
		JButton b = new JButton(s);
		b.setBackground(c);
		return b;
		
	}
	
	public boolean teladecadrastro() {
		return true;
		
	}
	
	private class Cadrastro implements ActionListener{

		public Cadrastro() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}

	}
	
	
	
	
}
