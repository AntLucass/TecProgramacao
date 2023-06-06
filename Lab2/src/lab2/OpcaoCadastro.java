package lab2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class OpcaoCadastro extends JPanel{

	private JTextField nom;
	private JTextField cpf;
	private JTextField mat;
	private JTextField vert;
	private JLabel nome;
	private JLabel CPF;
	private JLabel matricula;
	private JLabel vertente;
	private JButton botaoDeCadastro;
	
	public OpcaoCadastro() {
		
		setLayout(new GridLayout(9,3));
		nom = new JTextField();
		cpf = new JTextField();
		mat = new JTextField();
		vert = new JTextField();
		
		nome = new JLabel("Nome: ");
		CPF = new JLabel("CPF: ");
		matricula =  new JLabel("Matricula: ");
		vertente = new JLabel("Vertente: ");
		botaoDeCadastro = new JButton("CADASTRAR");
	
		add(nome);
		add(nom);
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(new JLabel(" "));
		
		add(CPF);
		add(cpf);
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(new JLabel(" "));
		
		add(matricula);
		add(mat);
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(new JLabel(" "));
		
		add(vertente);
		add(vert);
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(new JLabel(" "));
		
		add(botaoDeCadastro);
		setVisible(false);
	}
}