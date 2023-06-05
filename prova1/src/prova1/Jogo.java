package prova1;

import java.util.ArrayList;
import java.util.Scanner;


public class Jogo {
	
	protected Jogador jogador;
	protected boolean controle = true;
	
	public Jogo() {
		int tamanhoX = 0;
		int tamanhoY = 0;


		System.out.println("--------- Seja bem vindo a Ilha Java ---------");
		System.out.println("Alguns alunos ao se aventurarem pela ilha se perderam\n"
				+ "Voce tem a missao de encontrar eles, mas cuidado com os bugs\n"
				+ "Para essa missao voce tera a ajuda de alguns robos:\n"
				+ "O Robo Andador, o Peao, a Torre, o Bispo, o Cavalo, o Rei e a Rainha.\n");
		System.out.println("Para iniciar digite o seu nome:");
		Scanner scanear = new Scanner(System.in);
		String nome = scanear.nextLine();
		Jogador jogador = new Jogador(nome);
		
		tamanhoX = determinarTamanhoX(tamanhoX);
		tamanhoY = determinarTamanhoY(tamanhoY);
		
		Plano planoDoJogo = new Plano(tamanhoX, tamanhoY);
	
		
		ArrayList<Robo> listaDeRobos;
        listaDeRobos = new ArrayList<Robo>();
		
		Robo roboAndador = new RoboAndador(0, "Robo Andador", tamanhoY, 7, planoDoJogo);
		roboAndador.celulasPercorridas = "(" + roboAndador.coordenadaX + "," + roboAndador.coordenadaY + ")";
		listaDeRobos.add(roboAndador.getId(), roboAndador);
		
		Peao peao  = new Peao(1, "Peao", tamanhoY, 6, planoDoJogo);
		peao.celulasPercorridas = "(" + peao.coordenadaX + "," + peao.coordenadaY + ")";
		listaDeRobos.add(peao.getId(), peao);
		
		Torre torre = new Torre(2, "Torre", tamanhoY, 1, planoDoJogo);
		torre.celulasPercorridas = "(" + torre.coordenadaX + "," + torre.coordenadaY + ")";
		listaDeRobos.add(torre.getId(), torre);
		
		Bispo bispo = new Bispo(3, "Bispo", tamanhoY, 2, planoDoJogo);
		bispo.celulasPercorridas = "(" + bispo.coordenadaX + "," + bispo.coordenadaY + ")";
		listaDeRobos.add(bispo.getId(), bispo);
		
		Cavalo cavalo = new Cavalo(4, "Cavalo", tamanhoY, 5, planoDoJogo);
		cavalo.celulasPercorridas = "(" + cavalo.coordenadaX + "," + cavalo.coordenadaY + ")";
		listaDeRobos.add(cavalo.getId(), cavalo);
		
		Rei rei = new Rei(5, "Rei", tamanhoY, 3, planoDoJogo);
		rei.celulasPercorridas = "(" + rei.coordenadaX + "," + rei.coordenadaY + ")";
		listaDeRobos.add(rei.getId(), rei);
		
		Rainha rainha = new Rainha(6, "Rainha", tamanhoY, 4, planoDoJogo);
		rainha.celulasPercorridas = "(" + rainha.coordenadaX + "," + rainha.coordenadaY + ")";
		listaDeRobos.add(rainha.getId(), rainha);
		
		
		
		ArrayList<Pontuadores> listaDeAlunoseBugs;
		listaDeAlunoseBugs = distribuirAlunoseBugs(tamanhoY, tamanhoY, planoDoJogo);
		

		int alunosnoplano = numerodealunos(listaDeAlunoseBugs);
		planoDoJogo.exibirPlano();
		System.out.println(jogador.getNome() + " " + alunosnoplano + " alunos se perderam na ilha, encontre-os");
		System.out.println();
		
		do {
			
		for(Robo robo: listaDeRobos) {
			System.out.println(jogador.getNome());
			robo.avancarouretoceder(robo);
			System.out.println();
		    }
		
		    planoDoJogo.exibirPlano();
		    System.out.println();
		
		achouAlgo(listaDeAlunoseBugs);
		System.out.println();
		    
		for(Robo robo: listaDeRobos) {
			System.out.println(robo.nome +" tem " + robo.pontuacao +" pontos, e esta na cooordenada "+"("+ robo.coordenadaX + "," + robo.coordenadaY + ")");
		}
		System.out.println();

		controle = continuarJogando();
		
		}while(controle == true);
		
		
		
		fimDeJogo(listaDeRobos, jogador);
		
		
}
		
		
		
	
	private static int determinarTamanhoX(int tamanhoX) {
		try{
			System.out.println("Qual o tamanho x da Ilha, no minimo 7");
		Scanner scanear = new Scanner(System.in);
	     int a = scanear.nextInt();
	     if(a < 7 || a > 100){
	    	 System.out.println("tamanho invalido tente de novo");
	    	 determinarTamanhoX(tamanhoX);
	     }else{
	    	 tamanhoX = a;}
	    	 }catch(Exception e) {
	    	        System.out.println("Opcao invalido tente de novo");
	    	        determinarTamanhoX(tamanhoX);
	     }
		return tamanhoX;
	}


		
	  private static int determinarTamanhoY(int tamanhoY) {
		try{
			System.out.println("Qual o tamanho y da Ilha, no minimo 7");
		Scanner scanear = new Scanner(System.in);
	     int a = scanear.nextInt();
	     if(a < 7 || a > 100){
	    	 System.out.println("tamanho invalido tente de novo");
	    	 determinarTamanhoY(tamanhoY);
	     }else{
	    	 tamanhoY = a;}
	    	 }catch(Exception e) {
	    	        System.out.println("Opcao invalido tente de novo");
	    	        determinarTamanhoY(tamanhoY);
	     }
		return tamanhoY;
	}
	

	
	
	private static ArrayList<Pontuadores> distribuirAlunoseBugs(int tamanhoX, int tamanhoY, Plano planoDoJogo) {
		ArrayList<Pontuadores> listaDeAlunoseBugs;
		listaDeAlunoseBugs = new ArrayList<Pontuadores>();

			quantidadeDeAlunos(tamanhoX, tamanhoY, listaDeAlunoseBugs, planoDoJogo);
			System.out.println();
			quantidadeDeBugs(tamanhoX, tamanhoY, listaDeAlunoseBugs, planoDoJogo);
	
		return listaDeAlunoseBugs;
	}
	
	
	
	private static void quantidadeDeAlunos(int tamanhoX, int tamanhoY, ArrayList<Pontuadores> listaDeAlunoseBugs, Plano planoDoJogo){
		int quantidadeDeAlunos = 0;
	try {
		System.out.println("Digite quantos Alunos deseja na Ilha: \nO maximo de Alunos e " + (tamanhoX*tamanhoY)/4);
		Scanner scanear = new Scanner(System.in);
		quantidadeDeAlunos = scanear.nextInt();
		if(quantidadeDeAlunos > ((tamanhoX*tamanhoY)/4) || quantidadeDeAlunos < 0){
			System.out.println("Quantidade invalida");
			quantidadeDeAlunos(tamanhoX,tamanhoY,listaDeAlunoseBugs, planoDoJogo);
		}else{
			for(int a = 0; a < quantidadeDeAlunos; a++) {
				listaDeAlunoseBugs.add(new Aluno(a,planoDoJogo));
			}
			
		}
		}catch(Exception e) {
			System.out.println("Opcao invalida");
			quantidadeDeAlunos(tamanhoX,tamanhoY,listaDeAlunoseBugs, planoDoJogo);
		}
	}
	
	
	
	
	private static void quantidadeDeBugs(int tamanhoX, int tamanhoY, ArrayList<Pontuadores> listaDeAlunoseBugs, Plano planoDoJogo){
		int quantidadeDeBugs = 0;
	try {
		System.out.println("Digite quantos Bugs deseja na Ilha: \nO maximo de Bugs e " + (tamanhoX*tamanhoY)/4);
		Scanner scanear = new Scanner(System.in);
		quantidadeDeBugs = scanear.nextInt();
		if(quantidadeDeBugs > (tamanhoX*tamanhoY)/4 || quantidadeDeBugs < 0) {
			System.out.println("Quantidade invalida");
			quantidadeDeBugs(tamanhoX,tamanhoY,listaDeAlunoseBugs, planoDoJogo);
		}else{
			for(int a = 0; a < quantidadeDeBugs; a++) {
				listaDeAlunoseBugs.add(new Bug(a,planoDoJogo));
			}
		}
		}catch(Exception e) {
			System.out.println("Opcao invalida");
			quantidadeDeBugs(tamanhoX, tamanhoY, listaDeAlunoseBugs, planoDoJogo);}
	}
	
	
	
	
	
	private static int numerodealunos(ArrayList<Pontuadores> listaDeAlunoseBugs) {
	int alunosnoplano = 0;
	for(Pontuadores alunooubug: listaDeAlunoseBugs) {
		if(alunooubug.nome == "Aluno") {
			alunosnoplano = alunosnoplano + 1;
		}
	}
	return alunosnoplano;
	}
	
	
	
	
	private static void achouAlgo(ArrayList<Pontuadores> listaDeAlunoseBugs) {
	for (PecasDoJogo peca : listaDeAlunoseBugs) {
		if(peca instanceof Aluno)
			((Aluno)peca).achouAlunoOuBug();
				
		if(peca instanceof Bug)
			((Bug)peca).achouAlunoOuBug();
		
			}
	}
	
	
	
	private static boolean continuarJogando() {
		boolean controle = true;
		try{
			System.out.println("Voce deseja continuar\n1- Para continuar\n2- Para sair");
		Scanner scanear = new Scanner(System.in);
	     int a = scanear.nextInt();
	     if(a == 2) {
	    	 controle = false;}
	    	 }catch(Exception e) {
	    	        System.out.println("Opcao invalida tente de novo");
	    	        continuarJogando();
	     }
		return controle;
	}
	
	
	
	
	private static void fimDeJogo(ArrayList<Robo> listaDeRobos, Jogador jogador) {
	System.out.println();
		
	   String roboganhador = "";
	   int pontos = -1000000;
	for (Robo robos : listaDeRobos) {
		if(robos.pontuacao > pontos) {
			pontos = robos.pontuacao;
		}
	}
	for (Robo robo : listaDeRobos) {
		if(pontos == robo.pontuacao) {
			roboganhador = roboganhador + robo.nome +", ";
		}
	}
	System.out.println("Fim de Jogo \nObrigado por jogar "+jogador.getNome() + " o robo ganhador foi:\n"  + roboganhador + "com " + pontos + " pontos");
	

	System.out.println();
	for(Robo robo: listaDeRobos) {
		System.out.println(robo.nome + " percorreu as coordenadas " + robo.celulasPercorridas);
	}
	}
	
	
	
	
}
