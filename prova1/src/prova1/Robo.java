package prova1;

import java.util.Scanner;

public class Robo extends PecasDoJogo implements Movimentacao{

	
    protected String celulasPercorridas = "";
    protected int max = 0;
    protected String direcao = "";
	
	public Robo(int id, String nome, int posicaoY, int posicaoX, Plano plano) {
		super(id, plano);
		this.nome = nome;
		
		this.coordenadaY = posicaoY;
		this.coordenadaX = posicaoX;
		pontuacao = 0;
		visibilidade = true;
		
		this.introduzirPecaaCelula();
	}
	
	
	public String exibirPontuacao() {
		return this.nome + " tem " + pontuacao + " pontos";
	}
	
	
	public boolean pontuar(Celula celula) {
		for (PecasDoJogo peca : celula.pecasDoJogo) {
			if(peca.ePossivelPontuar() == true) {
				this.pontuacao = pontuacao + peca.pontuacao;	
				this.visibilidade =! this.visibilidade;
				
				if(peca.visibilidade == false)
					peca.visibilidade =! peca.visibilidade;
				
				return true;
			}
		}
		return false;
	}
	
	
	
	
	public Celula CelulaAtualDoRobo() {
		for (Celula celula : plano.listaDeCelulas) {
			if(celula.YdaCelula == coordenadaY && 
					celula.XdaCelula == coordenadaX) {
				return celula;
			}
		}
		return null;
	}

	
	
	public void computarPosicao(Robo robo) {
		
		robo.celulasPercorridas = celulasPercorridas + "(" + robo.coordenadaX + "," + robo.coordenadaY + ")";
	    
	}

	
	public void avancarNoPlano(int numeroDeCelulasParaAvancar) {
		
	}
	
	public void retrocederNoPlano(int numeroDeCelulasParaAvancar) {
		
	}
	
	
	protected static void testarvalora(Robo robo, int a) {
		try{
			System.out.println("Quantas casas deseja andar? \nO(A) " + robo.nome + " anda ate " + robo.max + " casas " + robo.direcao);
		Scanner scanear = new Scanner(System.in);
	     int i = scanear.nextInt();
		if(i <= robo.max) {
		        robo.avancarNoPlano(i);}else {
		    	 System.out.println("valor invalido");
		    	 testarvalora(robo, a);
		     }}catch(Exception e) {
		    	 System.out.println("Opcao invalida tente de novo");
		    		robo.testarvalora(robo, a);}
	}
	
	protected static void testarvalorr(Robo robo, int a) {
		try{
			System.out.println("Quantas casas deseja andar? \nO(A) " + robo.nome + " anda ate " + robo.max + " casas " + robo.direcao);
		Scanner scanear = new Scanner(System.in);
	     int i = scanear.nextInt();
		if(i <= robo.max) {
		        robo.retrocederNoPlano(i);}else {
		    	 System.out.println("valor invalido");
		    	 testarvalorr(robo, a);
		     }}catch(Exception e) {
		    	 System.out.println("Opcao invalida tente de novo");
		    		robo.testarvalorr(robo, a);}
	}
	
	
	
	public void avancarouretoceder(Robo robo) {
		
		try {
			System.out.println("Voce deseja avancar ou retroceder com o(a) " + robo.nome + "\n1- Para avancar\n2- Para retroceder");
			Scanner scanear = new Scanner(System.in);
		     int a = scanear.nextInt();
		     if(a == 1) {
			     testarvalora(robo, a);
			     robo.computarPosicao(robo);
			     }else {
			    	 if(a == 2) {
			    	 testarvalorr(robo, a);
			    	 robo.computarPosicao(robo);}
			    	 else {
			    		 System.out.println("Opcao invalida tente de novo");
			    		robo.avancarouretoceder(robo);
			    	 }
			     }
		             }catch(Exception e) {
			    	 System.out.println("Opcao invalida tente de novo");
			    		robo.avancarouretoceder(robo);
			     }
	}
	
	
       public boolean ePossivelPontuar() {
		
		return false;
	}
	
	
	
}