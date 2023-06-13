package apresentacao;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.FileWriter;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import sistema.Cliente;
import sistema.ListaDeClientes;
import sistema.Reader;
import sistema.Writer;

public class OpcaoCadastro extends JPanel{
	
	JTextField caixanome;
	JTextField caixacpf;
	JTextField caixamatricula;
	JTextField caixavertente;
	
	public OpcaoCadastro() {
		
		setLayout(new GridLayout(6,2));
		
		JLabel nome = new JLabel("Nome: ");
		JTextField caixanome = new JTextField();
		
		JLabel cpf = new JLabel("CPF: ");
		JTextField caixacpf = new JTextField();
		
		JLabel matricula =  new JLabel("Matricula: ");
		JTextField caixamatricula = new JTextField();
		
		JLabel vertente = new JLabel("Vertente: ");
		JTextField caixavertente = new JTextField();	
		
		Botao botaoDeCadastro = new Botao("CADASTRAR", Color.LIGHT_GRAY);
	
		this.add(nome);
		this.add(caixanome);
		
		this.add(cpf);
		this.add(caixacpf);
		
		this.add(matricula);
		this.add(caixamatricula);

		this.add(vertente);
		this.add(caixavertente);
		
		this.add(new JLabel());
		this.add(new JLabel());
		this.add(new JLabel());
		
		this.add(botaoDeCadastro);
		setVisible(false);
	}
	
	public void actionPerformed(ActionEvent e) {
		String textoDigitado="";
		Cliente cliente = new Cliente(caixanome.getText(), caixacpf.getText(), Integer.parseInt(caixamatricula.getText()), caixavertente.getText());
		ListaDeClientes listaClientes = new ListaDeClientes();
		listaClientes.addClienteToList(cliente);
		
		Writer writer = new Writer();
		writer.writeData("dados/dadosDosAlunos.txt", listaClientes.relatorioDeClientes(), false);
		
		
	}
}