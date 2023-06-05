package prova1;

import java.util.Random;

public class Pontuadores extends PecasDoJogo{
	
	
	public Pontuadores(int id, Plano plano) {
		super(id, plano);
	
		Random random = new Random();
        boolean controle = false;
	
      do{
		 coordenadaX = random.nextInt(plano.tamanhoX);
		 coordenadaY = random.nextInt(plano.tamanhoY);
		    
	       for(Celula celula : plano.listaDeCelulas) {
		       if(celula.XdaCelula == coordenadaX &&
		          celula.YdaCelula == coordenadaY) 
		        {
			       this.introduzirPecaaCelula();
			       controle = true;
		        }
	    }
		}while(controle == false);
	}
	
	
	public boolean achouAlunoOuBug() {
		if(visibilidade == true) {
			Celula celulaDoAluno = this.CelulaAtualDaPeca();
			celulaDoAluno.pecasDoJogo.remove(0);
			this.visibilidade = false;
			
			for (PecasDoJogo peca : celulaDoAluno.pecasDoJogo) {
				if(peca.visibilidade == false)
					peca.visibilidade =! peca.visibilidade;
				
				System.out.println(peca.nome + " achou um " + this.nome + "\nE recebeu a pontuacao de: " + this.pontuacao);
			}
			
		}
		return true;}
	

	
	public boolean ePossivelPontuar() {
		return true;
	}


	
}