package controlador;

import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<Emprestimo> listaEmprestimo;
	
	public Biblioteca() {
	   listaEmprestimo = new ArrayList<Emprestimo>();
	}
	
	public void addEmprestimo(Emprestimo e) {
		listaEmprestimo.add(e);
	}

	public ArrayList<Emprestimo> getListaEmprestimo() {
		return listaEmprestimo;
	}
	
	
}
