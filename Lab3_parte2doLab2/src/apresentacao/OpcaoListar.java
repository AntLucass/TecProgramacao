package apresentacao;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class OpcaoListar extends JPanel{
	
	public OpcaoListar() {
		
		String[] colunas = {"Nome", "CPF", "Matricula", "Vertente"};
		Object[][] dados = {{"AAAA", "11111111111", "111111", "AAAAAAAA"},{"BBBB", "22222222222", "222222", "BBBBBBBB"},{"CCCC", "33333333333", "333333", "CCCCCCCC"}};
		
		JTable tabela = new JTable(dados, colunas);
		JScrollPane scrollPane = new JScrollPane(tabela);
		this.add(tabela);
		
		this.setVisible(false);
	}
}