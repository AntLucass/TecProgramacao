package apresentacao;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OpcaoAtualizar extends JPanel{
	
	public OpcaoAtualizar(){
		
		setLayout(new GridLayout(5,2));
		
		JLabel matricula =  new JLabel("Matricula: ");
		JTextField caixamatricula = new JTextField();
		
		JTextField caixavertente = new JTextField();
		JLabel vertente = new JLabel("Vertente: ");
		
		Botao botaoDeAtualizar = new Botao("CONFIRMAR", Color.LIGHT_GRAY);
		
		this.add(matricula);
		this.add(caixamatricula);
		
		this.add(vertente);
		this.add(caixavertente);
		
		this.add(new JLabel());
		this.add(new JLabel());
		this.add(new JLabel());
		
		this.add(botaoDeAtualizar);
		setVisible(false);
	}
}