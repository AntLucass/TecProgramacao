package prova1;


public class RoboAndador extends Robo{
	
	public RoboAndador(int id, String nome, int posicaoY, int posicaoX, Plano plano) {
		super(id, nome, posicaoY, posicaoX, plano);
		caractere='A';
		max = 100;
		direcao = "verticalmente";
		
	}

	
	public void avancarNoPlano(int numeroDeCelulasParaAvancar) {
		for (Celula celula : plano.listaDeCelulas) {
			for (PecasDoJogo robo : celula.pecasDoJogo) {
				if(robo == this) {
					coordenadaY = celula.YdaCelula - numeroDeCelulasParaAvancar;
					    if(coordenadaY < 1) 
						   coordenadaY = 1;
				}
			}
		}
		this.introduzirPecaaCelula();
		this.pontuar(CelulaAtualDoRobo());
		
	}
	
	
	public void retrocederNoPlano(int numeroDeCelulasParaAvancar) {
		for (Celula celula : plano.listaDeCelulas) {
			for (PecasDoJogo robo : celula.pecasDoJogo) {
				if(robo == this) {
					coordenadaY = celula.YdaCelula + numeroDeCelulasParaAvancar;
					    if(coordenadaY > plano.tamanhoY)
						   coordenadaY = plano.tamanhoY;
				}
			}
			
		}
		this.introduzirPecaaCelula();
		this.pontuar(CelulaAtualDoRobo());
		
	}
	
	

}