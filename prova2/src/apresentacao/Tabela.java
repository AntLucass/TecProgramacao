package apresentacao;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import controle.Conversor;

import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Tabela extends JPanel {

	public Tabela() {
		this.setLayout(new BorderLayout());
		String[] colunas = { "Jogador", "Numero de Rodadas", "Bugs encontrados", "Alunos resgatados", "Celulas Vazias",
				"Soluco", "Banguela", "Astrid", "Pontuacao" };
		DefaultTableModel modelo = new DefaultTableModel(colunas,0);
		
		JTable tabela = new JTable(modelo);
		JScrollPane scrollPane = new JScrollPane(tabela);
		this.add(scrollPane, BorderLayout.CENTER);
		
		Conversor lista = new Conversor();
		preencherTabela(lista, modelo);
		
	}

	public void preencherTabela(Conversor lista , DefaultTableModel modelo) {
		int i = 0;
		boolean verifica = false;
		do {
			if (lista.dadosParaTabela(i) != null) {
				modelo.addRow(lista.dadosParaTabela(i));
				i++;
				verifica = true;
			} else {
				verifica = false;
			}
		} while (verifica);
	}

}