package questao17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		boolean a = true;
		char simbolo2 = 0;
		Scanner nomeprovisorio = new Scanner(System.in);
		
		System.out.println("Vamos iniciar o Jogo da Velha, comecando pelo nome dos participantes");
		 System.out.println("Qual o nome do jogador 1");
		  String nome1 = nomeprovisorio.next();
		 System.out.println("Qual o simbolo do jogador 1, (X ou O)");
		  char simbolo1 = nomeprovisorio.next().charAt(0);
		   Jogador jogador1 = new Jogador(nome1,simbolo1);
		
		 System.out.println("Qual o nome do jogador 2");
		  String nome2 = nomeprovisorio.next();
		   do{
			System.out.println("Qual o simbolo do jogador 2, que seja diferente do simbolo do jogador 1");
		    char simbol2 = nomeprovisorio.next().charAt(0);
		    if(simbol2 == simbolo1)
		    	a = false;
		    else {
		    	simbolo2 = simbol2;
		    	a = true;}
		   }while(a == false);
		 Jogador jogador2 = new Jogador(nome2,simbolo2);
		 
		JogodaVelha inicio = new JogodaVelha(jogador1, jogador2);
		
	}

}
