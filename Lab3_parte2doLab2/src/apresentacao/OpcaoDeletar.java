package apresentacao;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OpcaoDeletar extends JPanel{
	
	public OpcaoDeletar() {
		
		setLayout(new GridLayout(4,2));
		
		JLabel matricula =  new JLabel("Matricula: ");
		JTextField caixamatricula = new JTextField();
		
		Botao botaoDeDeletar = new Botao("DELETAR", Color.LIGHT_GRAY);
		
		this.add(matricula);
		this.add(caixamatricula);	
		
		this.add(new JLabel());
		this.add(new JLabel());
		this.add(new JLabel());
		
		this.add(botaoDeDeletar);
		setVisible(false);
	}
}