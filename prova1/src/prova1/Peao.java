package prova1;


public class Peao extends Robo{

	public Peao(int id, String nome, int posicaoY, int posicaoX, Plano plano) {
		super(id, nome, posicaoY, posicaoX, plano);
		caractere ='P';
		max = 1;
		direcao = "horizontalmente";
	}

	
	public void avancarNoPlano(int numeroDeCelulasParaAvancar) {
		for (Celula celula : plano.listaDeCelulas) {
			for (PecasDoJogo robo : celula.pecasDoJogo) {
				if(robo == this) {
				   coordenadaX = celula.XdaCelula + numeroDeCelulasParaAvancar;
					if(coordenadaX > plano.tamanhoX)
						coordenadaX = plano.tamanhoX;
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
				   coordenadaX = celula.XdaCelula - numeroDeCelulasParaAvancar;
					 if(coordenadaX < 1)
						coordenadaX = 1;
				}
			}
		}
		this.introduzirPecaaCelula();
		this.pontuar(CelulaAtualDoRobo());
		
	}
	
}