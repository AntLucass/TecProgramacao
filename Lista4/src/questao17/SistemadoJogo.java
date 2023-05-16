package questao17;

public abstract class SistemadoJogo {

	private char[][] plano = new char[3][3];
	private Jogador jogador1;
	private Jogador jogador2;
	
	
	public SistemadoJogo(Jogador J1, Jogador J2) {
		for (int i = 0; i < getPlano().length; i++) {
			for (int j = 0; j < getPlano().length; j++) {
				this.getPlano()[i][j] = ' ';
			}
		}
		this.jogador1 = J1;
		this.jogador2 = J2;
	}
	
	public char[][] getPlano() {
		return plano;
	}

	public void setPlano(char[][] grade) {
		this.plano = grade;
	}
	

	public void gradeJogo() {
		System.out.println(" " + getPlano()[0][0] + " | " + getPlano()[0][1] + " | " + getPlano()[0][2]);
		System.out.println("-----------");
		System.out.println(" " + getPlano()[1][0] + " | " + getPlano()[1][1] + " | " + getPlano()[1][2]);
		System.out.println("-----------");
		System.out.println(" " + getPlano()[2][0] + " | " + getPlano()[2][1] + " | " + getPlano()[2][2]);
	}
	
	
	
    public boolean Jogadadojogador1(char grade[][], int i, int j) {
		if(grade[i][j] == ' ' && i >= 0 && i <= 2 && j >= 0 && j <= 2) {
			grade[i][j] = jogador1.getSimbolo();
			return true;
		}else {
			return false;
		}
	}
	
	public boolean JogadadoJogador2(char grade[][], int i, int j) {
		if(grade[i][j] == ' ' && i >= 0 && i <= 2 && j >= 0 && j <= 2) {
			grade[i][j] = jogador2.getSimbolo();
			return true;
		}else {
			return false;
		}
	}
	
		
		public boolean VitoriaParaJogador1(char grade[][]) {
			if((grade[0][0] == jogador1.getSimbolo() && grade[0][1] == jogador1.getSimbolo() && grade[0][2] == jogador1.getSimbolo()) || 
			   (grade[1][0] == jogador1.getSimbolo() && grade[1][1] == jogador1.getSimbolo() && grade[1][2] == jogador1.getSimbolo()) || 
			   (grade[2][0] == jogador1.getSimbolo() && grade[2][1] == jogador1.getSimbolo() && grade[2][2] == jogador1.getSimbolo())) 
			{
				System.out.println("Parabens " + jogador1.getNome() + " voce ganhou!!!");
				return false;
			}else{
				if((grade[0][0] == jogador1.getSimbolo() && grade[1][0] == jogador1.getSimbolo() && grade[2][0] == jogador1.getSimbolo()) || 
				   (grade[0][1] == jogador1.getSimbolo() && grade[1][1] == jogador1.getSimbolo() && grade[2][1] == jogador1.getSimbolo()) || 
				   (grade[0][2] == jogador1.getSimbolo() && grade[1][2] == jogador1.getSimbolo() && grade[2][2] == jogador1.getSimbolo())) 
				{
				  System.out.println("Parabens " + jogador1.getNome() + " voce ganhou!!!");
				  return false;
				}else{
					if((grade[0][0] == jogador1.getSimbolo() && grade[1][1] == jogador1.getSimbolo() && grade[2][2] == jogador1.getSimbolo()) || 
					   (grade[0][2] == jogador1.getSimbolo() && grade[1][1] == jogador1.getSimbolo() && grade[2][0] == jogador1.getSimbolo())) 
					{
						System.out.println("Parabens " + jogador1.getNome() + " voce ganhou!!!");
						return false;
					}else{
						return true;}
			      }
		        }
		      }
	
		public boolean VitoriaParaJogador2(char grade[][]) {
			if((grade[0][0] == jogador2.getSimbolo() && grade[0][1] == jogador2.getSimbolo() && grade[0][2] == jogador2.getSimbolo()) || 
			   (grade[1][0] == jogador2.getSimbolo() && grade[1][1] == jogador2.getSimbolo() && grade[1][2] == jogador2.getSimbolo()) || 
			   (grade[2][0] == jogador2.getSimbolo() && grade[2][1] == jogador2.getSimbolo() && grade[2][2] == jogador2.getSimbolo())) 
			{
				System.out.println("Parabens " + jogador2.getNome() + " voce ganhou!!!");
				return false;
			}else{
				if((grade[0][0] == jogador2.getSimbolo() && grade[1][0] == jogador2.getSimbolo() && grade[2][0] == jogador2.getSimbolo()) || 
				   (grade[0][1] == jogador2.getSimbolo() && grade[1][1] == jogador2.getSimbolo() && grade[2][1] == jogador2.getSimbolo()) || 
				   (grade[0][2] == jogador2.getSimbolo() && grade[1][2] == jogador2.getSimbolo() && grade[2][2] == jogador2.getSimbolo())) 
				{
				    System.out.println("Parabens " + jogador2.getNome() + " voce ganhou!!!");
				  return false;
				}else{
					if((grade[0][0] == jogador2.getSimbolo() && grade[1][1] == jogador2.getSimbolo() && grade[2][2] == jogador2.getSimbolo()) || 
					   (grade[0][2] == jogador2.getSimbolo() && grade[1][1] == jogador2.getSimbolo() && grade[2][0] == jogador2.getSimbolo())) 
					{
						System.out.println("Parabens " + jogador2.getNome() + " voce ganhou!!!");
						return false;
					}else{
						return true;}
			       }
		         }
		       }
	
}
