package apresentacao;

import java.awt.Color;

import javax.swing.JButton;

public class Botao extends JButton{
	protected int id;

	public Botao(String nome, Color cor) {
		this.setText(nome);
		this.setBackground(cor);
	}
	
	
}
