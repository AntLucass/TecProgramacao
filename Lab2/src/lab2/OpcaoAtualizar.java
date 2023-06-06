package lab2;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OpcaoAtualizar extends JPanel{
	private JTextField mat;
	private JTextField vert;
	private JLabel matricula;
	private JLabel vertente;
	private JButton botaoDeAtualizar;
	
	public OpcaoAtualizar(){
		
		setLayout(new GridLayout(5,3));
		mat = new JTextField();
		vert = new JTextField();
		matricula =  new JLabel("Matricula: ");
		vertente = new JLabel("Vertente: ");
		botaoDeAtualizar = new JButton("CONFIRMAR");
		
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
		
		add(botaoDeAtualizar);
		setVisible(false);
	}
}