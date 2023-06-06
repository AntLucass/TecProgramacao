package lab2;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OpcaoDeletar extends JPanel{
	private JTextField mat;
	private JLabel matricula;
	private JButton botaoDeDeletar;
	
	public OpcaoDeletar() {
		
		setLayout(new GridLayout(2,2));
		mat = new JTextField();
		matricula =  new JLabel("Matricula: ");
		botaoDeDeletar = new JButton("DELETAR");

		add(matricula);
		add(mat);	
		add(new JLabel(" "));
		add(new JLabel(" "));
		
		add(botaoDeDeletar);
		setVisible(false);
	}
}