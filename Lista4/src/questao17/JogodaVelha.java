package questao17;

import java.util.Scanner;


public class JogodaVelha extends SistemadoJogo {

	public JogodaVelha(Jogador J1, Jogador J2) {
		super(J1, J2);
		
		Scanner coordenadaprovisoria = new Scanner(System.in);
		boolean controle = true;
		int vezesjogadas = 0;

		
		System.out.println("\nOla " + J1.getNome() + " voce sera o " + J1.getSimbolo());
		System.out.println("E " + J2.getNome() + " voce sera o " + J2.getSimbolo());
		System.out.println("Inicio do Jogo!\n");


		do{
			gradeJogo();
			if(VitoriaParaJogador1(getPlano()) && VitoriaParaJogador2(getPlano())) {		

				     do{
					    if(vezesjogadas < 9){
						try{
							System.out.println("\n" + J1.getNome() + " digite a posicao que deseja colocar o " + J1.getSimbolo());
							 System.out.println("Qual a coordenada i");
							  int i = coordenadaprovisoria.nextInt();
							 System.out.println("Qual a coordenada j");
							  int j = coordenadaprovisoria.nextInt();
							controle = Jogadadojogador1(getPlano(), i, j);
							vezesjogadas++;
						}catch(ArrayIndexOutOfBoundsException e) {
							System.out.println("Posicao invallida, tente novamente");
							controle = false;
						}
					    }else{
						  controle = false;
					         }
				        }while(controle == false);

				
				        if(vezesjogadas == 9) {
					        System.out.println("Empate!");
					        return;
				            }

				     do{
					    if(vezesjogadas < 9){
					    try{
							System.out.println("\n" + J2.getNome() + " digite a posicao que deseja colocar o " + J2.getSimbolo());
							 System.out.println("Qual a coordenada i");
							  int i = coordenadaprovisoria.nextInt();
							 System.out.println("Qual a coordenada j");
							  int j = coordenadaprovisoria.nextInt();
							controle = JogadadoJogador2(getPlano(),i,j);
							vezesjogadas++;
						}catch(ArrayIndexOutOfBoundsException e) {
							System.out.println("Posicao invallida, tente novamente");
							controle = false;
						}
					    }else{
						  controle = false;
					         }
				        }while(controle == false);

				         if(vezesjogadas == 9) {
					         System.out.println("Empate!");
					         return;
				             }
	       }else{
		     controle = false;
			    }
			
		}while(controle);
		
	}
}
