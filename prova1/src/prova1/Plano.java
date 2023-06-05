package prova1;

import java.util.ArrayList;

public class Plano {

	protected ArrayList<Celula> listaDeCelulas;
	protected int tamanhoX;
	protected int tamanhoY;
	
	public Plano(int tamanhox, int tamanhoy) {
		
		listaDeCelulas = new ArrayList<Celula>();
		
		this.tamanhoX = tamanhox;
		this.tamanhoY = tamanhoy;
		
		for (int i = 1; i <= tamanhoy; i++) {
			for (int j = 1; j <= tamanhox; j++) {
				Celula celula = new Celula(i, j);
				listaDeCelulas.add(celula);
				
			}
		}
	}
	
	public void exibirPlano() {
		for (Celula celula : listaDeCelulas) {
			if(celula.pecasDoJogo.isEmpty() == false) {
				if(celula.pecasDoJogo.get(celula.pecasDoJogo.size()-1).visibilidade) {
					System.out.print("|" + celula.pecasDoJogo.get(celula.pecasDoJogo.size()-1).caractere + "|");
				}else if(celula.pecasDoJogo.get(0).visibilidade){
					System.out.print("|" + celula.pecasDoJogo.get(0).caractere + "|");
				}else {
					System.out.print("| |");
				}
			}else {
				System.out.print("| |");
			}
			if(celula.XdaCelula % tamanhoX==0) {
				System.out.println();
			}
		}
	}
}
