package sistema;

import java.io.BufferedReader;
import java.io.FileReader;


public class Reader {

	private ListaDeClientes listaDeClientes;
	private Writer writer;
	
	public Reader() {
		listaDeClientes = new ListaDeClientes();
		writer = new Writer();
	}
	
	public void lerDadosDosClientes(String diretorio) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(diretorio));
			
			while(reader.ready()) {
				listaDeClientes.addClienteToList(separarClientes(reader.readLine()));
			}
			
			reader.close();
		}catch(Exception e) {
			
		}
	}
	
	public void exclusaoDeAluno(String diretorio, String matricula) {
		for (Cliente cliente : listaDeClientes.listaClientes) {
			if(cliente.getMatricula()==Integer.parseInt(matricula)) {
				listaDeClientes.listaClientes.remove(cliente);
			}
		}
		
		writer.writeData(diretorio, listaDeClientes.relatorioDeClientes(), false);
		
	}
	
	public ListaDeClientes getListaDeClientes() {
		return listaDeClientes;
	}
	
	
	private Cliente separarClientes(String linha) {
		String dadosAux[] = linha.split(" -SEPARAR DADOS- ");
		
		return new Cliente(dadosAux[0], dadosAux[1], Integer.parseInt(dadosAux[2]), dadosAux[3]);
	}
	
	
}