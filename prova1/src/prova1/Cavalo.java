package prova1;


public class Cavalo extends Robo{

	public Cavalo(int id, String nome, int posicaoY, int posicaoX, Plano plano) {
		super(id, nome, posicaoY, posicaoX, plano);
		caractere ='C';
		max = 2;
		direcao = "diagonalmente";
	}
	
	public void avancarNoPlano(int numeroDeCelulasParaAvancar) { 
		for (Celula celula : plano.listaDeCelulas) {
			for (PecasDoJogo robo : celula.pecasDoJogo) {
				if(robo == this) {
				   coordenadaY = celula.YdaCelula - numeroDeCelulasParaAvancar;
				   coordenadaX = celula.XdaCelula - numeroDeCelulasParaAvancar;
					
					if(coordenadaY < 1) { 
						coordenadaY = 1;}
					if(coordenadaX < 1) {
					    coordenadaX = 1;}
				}
			}
		}
		this.introduzirPecaaCelula();
		this.pontuar(CelulaAtualDoRobo());
		
	}
	
	public void retrocederNoPlano(int numeroDeCelulasParaAvancar) {
		for (Celula celula : plano.listaDeCelulas) {
			for (PecasDoJogo robo : celula.pecasDoJogo) {
				if(robo==this) {
				   coordenadaY = celula.YdaCelula + numeroDeCelulasParaAvancar;
				   coordenadaX = celula.XdaCelula + numeroDeCelulasParaAvancar;
					
					if(coordenadaY > plano.tamanhoY) {
						coordenadaY = plano.tamanhoY;}
					if(coordenadaX > plano.tamanhoX) {
						coordenadaX = plano.tamanhoX;}
				}
			}
		}
		this.introduzirPecaaCelula();
		this.pontuar(CelulaAtualDoRobo());
		
	}
	

}