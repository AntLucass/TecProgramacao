package prova1;

import java.util.ArrayList;

public class Celula {

	protected int YdaCelula;
	protected int XdaCelula;
	protected ArrayList<PecasDoJogo> pecasDoJogo;
	
	public Celula(int posicaoY, int posicaoX) {
		this.YdaCelula = posicaoY;
		this.XdaCelula = posicaoX;
		
		pecasDoJogo = new ArrayList<PecasDoJogo>();
	}

	
}
