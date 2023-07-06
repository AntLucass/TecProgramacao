package controle;

import java.util.ArrayList;
import java.util.Random;

public class Plano {
	
	private int alunosTotais;
	private int bugsTotais;
	private ArrayList<Celula> listaCelulas;
	private ArrayList<Integer> celulasComBug;
	private ArrayList<Integer> celulasComAluno;

	public Plano() {
		alunosTotais = 16;
		bugsTotais = 16;
		
		listaCelulas = new ArrayList<Celula>();
		celulasComBug = new ArrayList<Integer>();
		celulasComAluno = new ArrayList<Integer>();
		
		for (int i = 0; i < 64; i++) {
			listaCelulas.add(new Celula(i));
		}
		sortearAlunos(listaCelulas.size());
		sortearBugs(listaCelulas.size());
	}
	

	private void sortearBugs(int tamanho) {
		Random random = new Random();
		int celulaSorteada;
		
		for (int i = 0; i < bugsTotais;) {
			celulaSorteada = random.nextInt(tamanho - 1);
			
			if (listaCelulas.get(celulaSorteada).getAluno() == false)
			{
				listaCelulas.get(celulaSorteada).setBug(true);
				celulasComBug.add(celulaSorteada);
				i++;
			}
		}
	}

	private void sortearAlunos(int tamanho) {
		Random random = new Random();
		int celulaSorteada;
		
		for (int i = 0; i < alunosTotais;) {
			celulaSorteada = random.nextInt(tamanho - 1);
			
			if (listaCelulas.get(celulaSorteada).getBug() == false)
			{
				listaCelulas.get(celulaSorteada).setAluno(true);
				celulasComAluno.add(celulaSorteada);
				i++;
			}
		}
	}

	
	
	public ArrayList<Celula> getListaCelulas() {
		return listaCelulas;
	}
	
	public void setListaCelulas(ArrayList<Celula> listaDecelulas) {
		this.listaCelulas = listaDecelulas;
		
	}
	
	public ArrayList<Integer> getCelulasComBug() {
		return celulasComBug;
	}

	public ArrayList<Integer> getCelulasComAluno() {
		return celulasComAluno;
	}

	

	
}