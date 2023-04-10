import java.util.Scanner;

public class EstruturasdeRepeticao {

	public static void main(String[] args) {
		
		{//Questao 1
			   
			for (int a = 1; a <= 100; a++){
				if(a % 2 == 0) {
					System.out.println(a);
				}
			
			}
			
			System.out.println("\n");
			}
		   
		{//Questao 2
			   
			  int i = 0;
			  int soma = 0;
			  
			 while(i >= 0){
				    
				    System.out.println("Digite um numero: ");
					Scanner a = new Scanner(System.in);
					int b = a.nextInt();
					i = b;
					
					if(b>=0)
					soma = soma + b;
			}
			 
			System.out.println("soma = " + soma);
			
			System.out.println("\n");
			}
		
		{//Questao 3
			   
			  int i = 0;
			  int num = 3;
			  
			 while(i == 0){
				    System.out.println("Adivinhe o numero ente 1 e 100: ");
					Scanner a = new Scanner(System.in);
					int b = a.nextInt();
					
					if(b == num)
					i = 1;	
					else {
						if(b>num)
							 System.out.println("O numero correto e menor que esse ");
						else
							 System.out.println("O numero correto e maior que esse ");
					}
			 }
			 
			System.out.println("Numero correto");
			
			System.out.println("\n");
			}
		
		{//Questao 4
			   
			System.out.println("Voce quer a tabuada de qual numero ?");
			Scanner a = new Scanner(System.in);
			int b = a.nextInt();
			
			for (int i = 1; i <= 10; i++){
				
				System.out.println(b +" * "+ i +" = "+ b * i);
	
			}
			
			System.out.println("\n");
			}
		
		{//Questao 5
			   
			System.out.println("Digite um numero");
			Scanner a = new Scanner(System.in);
			int b = a.nextInt();
			
			for (int i = 0; i <= b; i++){
				
				for(int j = 0; j <= b; j++ ) 
				{
				System.out.println(i +" - "+ j);
				}
			}
			
			System.out.println("\n");
			}
		
		{//Questao 6
			   
			int matriz[][] = {{1,2,3},{2,1,4},{3,4,1}}; 
			int verificar = 0;
			
			for (int i = 0; i <= 2; i++){

				for(int j = 0; j <= 2; j++ ) 
				{
				if((matriz[i][j]) == (matriz[j][i])) {
					verificar = 1;}
				else
					verificar = 0;
				break;
				}
			}
			
			if(verificar == 1)
				System.out.println("Matriz simetrica");
			else
				System.out.println("Matriz nao simetrica");
			
			
			System.out.println("\n");
			}
		
		{//Questao 7
			   
			int i = 0;
			int j = 0;
			
			System.out.println("Digite um numero");
			Scanner a = new Scanner(System.in);
			int b = a.nextInt();
			
			while(i<=b){
				if(i % 2  !=  0 && i % 3 != 0 || i == 2 || i == 3) {
					j = i;}
			
			i++;
			}

			System.out.println("O maior primo e "+ j);
			
			System.out.println("\n");
			}
		
	}

}
