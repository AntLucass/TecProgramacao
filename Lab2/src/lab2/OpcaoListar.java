package lab2;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class OpcaoListar extends JPanel{
	JButton lista;
	JTable tabela;
	JScrollPane scrollPane;
	
	public OpcaoListar() {
		
		lista = new JButton("Listar");
		String[] colunas = {"Nome", "CPF", "Matricula", "Vertente"};
		Object[][] dados = {{"Nome", "CPF", "Matricula", "Vertente"}};
		tabela = new JTable(dados, colunas);
		scrollPane = new JScrollPane(tabela);
		this.add(tabela);
		this.setVisible(false);
	}
}