package sistema;

import java.util.ArrayList;

public class ListaDeClientes {

	public ArrayList<Cliente> listaClientes;

	public ListaDeClientes() {
		listaClientes = new ArrayList<Cliente>();
		
	}
	
	public void setList(ArrayList<Cliente> lista) {
		listaClientes = lista;
	}
	public void addClienteToList(Cliente cliente) {
		listaClientes.add(cliente);
	}
	
	public int getQuantidadeDeClientes() {
		return listaClientes.size();
	}
	
	public String relatorioDeClientes() {
		String relatorio = "";
		
		for (Cliente cliente : listaClientes) {
			relatorio +=cliente.getName() + " -SEPARAR DADOS- " + cliente.getCpf() + 
					" -SEPARAR DADOS- " + cliente.getMatricula() + " -SEPARAR DADOS- " + cliente.getVertente() +"\n";
		}
		
		return relatorio;
	}
}