package sistema;

import java.util.ArrayList;

public class ListaDeUsuarios {

	public ArrayList<Usuario> listaUsuarios;

	public ListaDeUsuarios() {
		listaUsuarios = new ArrayList<Usuario>();
		
	}
	
	public void setList(ArrayList<Usuario> lista) {
		listaUsuarios = lista;
	}
	public void addUsuario(Usuario usuario) {
		listaUsuarios.add(usuario);
	}
	
	public int getQuantidadeDeUsuarios() {
		return listaUsuarios.size();
	}
	
	public String relatorioDoUsuario() {
		String relatorio = "";
		
		for (Usuario usuario : listaUsuarios) {
			relatorio += usuario.getNome() + " ; " + usuario.getCpf() + " ; " + usuario.getMatricula() + " ; " + usuario.getVertente() +"\n";
		}
		
		return relatorio;
	}
}
