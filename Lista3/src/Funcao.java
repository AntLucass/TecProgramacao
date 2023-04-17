
public class Funcao {

	  public static int somatorio(int vetor[]) {
		int soma = 0;
		for(int i = 0; i < vetor.length; i++) {
			int j = vetor.length;
			j = j-1;
		if(i != 0 && i != j)
			soma = soma + vetor[i];
		}
		return soma;
	}
	
	  public static double media(int vetor[],int vet[]) {
			double soma = 0;
			double media = 0;
			
			for(int i = 0; i < vetor.length; i++) {
				soma = soma + vetor[i];
			}
			for(int i = 0; i < vet.length; i++) {
				soma = soma + vet[i];
			}
			int j = vetor.length + vet.length;
			
			media = soma/j ;
			return media;
		}
	
	  public static double mediaponderada(int nota[],int peso[]) {
			double soma = 0;
			double media = 0;
			int j = 0; 
			for(int i = 0; i < nota.length; i++) {
				soma = soma + nota[i] * peso[i];
				j = j + peso[i];
			}
			
			media = soma/j ;
			return media;
		}
	
	  public static int contagemdeelementos(int vetor[]) {
			int vezes = 0;
		
			for(int i = 0; i < vetor.length; i++) {
				if(vetor[i] == 2) {
					vezes = vezes + 1;
				}
			}
			
			return vezes;
		}
	  
	  public static int copiadevetor(int vetor[], int vetorcopia[]) {
		  
		  
		  for(int i = 0; i < vetor.length; i++) {
				vetorcopia[i] = vetor[i];
			}
		  
			for(int i = 0; i < vetorcopia.length; i++) {
				System.out.println(vetorcopia[i]);
			}
			 
			return 5;
		}
	  
	  public static int ordenacaocrescente(int vetor[], int vetorordenado[]) {
			int a = 0;
		    int x = vetor.length - 1;
		    
		    for(int i = 0; i < vetor.length; i++) {
				vetorordenado[i] = vetor[i];
			}
		    
		    
			for(int i = 0; i < vetorordenado.length; i++){
			 for(int j = 0; j < x; j++){
				if(vetorordenado[j] > vetorordenado[j+1]) {
					a = vetorordenado[j];
				    vetorordenado[j] = vetorordenado[j+1];
				    vetorordenado[j+1] = a;
				}
				}
			 }
			for(int i = 0; i < vetorordenado.length; i++) {
				System.out.println(vetorordenado[i]);
			}
		    
			
			return 6;
		}
	  
	  public static boolean verificacaodeordem(int vetor[]) {
			boolean a = false;
		    int x = vetor.length - 1;
			for(int i = 0; i < vetor.length; i++){
			 for(int j = 0; j < x; j++){
				if(vetor[j] > vetor[j+1]) {
					a = false;
					break;
				}
				else {
					a = true;}
				}
			 }
			
			return a;
		}
	  
	  public static int k_esimomaiorvalor(int vetor[], int vetorordenado[], int kmaior) {
			int a = 0;
		    int x = vetor.length - 1;
		    int b = vetor.length - kmaior;
		    
		    for(int i = 0; i < vetor.length; i++) {
				vetorordenado[i] = vetor[i];
			}
		    
		    
			for(int i = 0; i < vetorordenado.length; i++){
			 for(int j = 0; j < x; j++){
				if(vetorordenado[j] > vetorordenado[j+1]) {
					a = vetorordenado[j];
				    vetorordenado[j] = vetorordenado[j+1];
				    vetorordenado[j+1] = a;
				}
				}
			 }
			
				System.out.println("O " + b + " maior valor e: " + vetorordenado[kmaior]);
			
			return 8;
		}
	  
	  public static int k_esimomenorvalor(int vetor[], int vetorordenado[], int kmenor) {
			int a = 0;
		    int x = vetor.length - 1;
		    
		    for(int i = 0; i < vetor.length; i++) {
				vetorordenado[i] = vetor[i];
			}
		    
		    
			for(int i = 0; i < vetorordenado.length; i++){
			 for(int j = 0; j < x; j++){
				if(vetorordenado[j] > vetorordenado[j+1]) {
					a = vetorordenado[j];
				    vetorordenado[j] = vetorordenado[j+1];
				    vetorordenado[j+1] = a;
				}
				}
			 }
			
				System.out.println("O " + kmenor + " maior valor e: " + vetorordenado[kmenor-1]);
			
			return 9;
		}
	  
	  public static boolean verificacaodeigualdade(int vetor[],int vetor2[]) {
			boolean a = false;
		    
			for(int i = 0; i < vetor.length; i++){
  			 if(vetor[i] != vetor2[i]) {
					a = false;
					break;
				}
				else {
					a = true;}
				}
			
			return a;
		}
	  
	  public static int potenciacao(int b, int e) {
			int result = 1;
			
			for(int i = 0; i < e; i++) {
				result = result * b;
			}
			return result;
		}
	  
	  public static boolean primo(int num) {
			boolean a = false;
			
			if(num % 1  ==  0 && num % num == 0 && num % 2 != 0 && num != 2 && num % 3 != 0 && num != 3)
				a = true;
			else
				a = false;
			
			return a;
		}
	  
	  public static int buscaporocorrencias(int vetor[], int vetor3[], int vetorfinal[]) {
			
		    for(int i = 0; i < vetor.length; i++) {
				vetorfinal[i] = vetor[i];
			}
		    int a = vetor.length;
		    
		    for(int i = 0; i < vetor3.length; i++) {
				vetorfinal[a+i] = vetor3[i];
			}
		    
			for(int i = 0; i < vetorfinal.length; i++) {
				System.out.println(vetorfinal[i]);
			}
		    
			
			return 13;
		}
	  
	  public static int remocaodeelemento(int vetor[],int vetornovo[]) {
			
		
			for(int i = 0; i < vetor.length; i++) {
				if(vetor[i] != 2) {
					vetornovo[i] = vetor[i];
				}
			}
			
			for(int i = 0; i < vetornovo.length; i++) {
				System.out.println(vetornovo[i]);
			}
			
			return 14;
		}
	  
	  
	  
	  public static boolean verificacaoprimo(int num2) {
			boolean a = false;
			
			if(num2 % 2  !=  0 && num2 % 3 != 0 || num2 == 2 || num2 == 3)
				a = true;
			else
				a = false;
			
			return a;
		}
	  
	  
	  
	  

	  
	  
	  
	  
	  
	public static void main(String[] args) {
		
		int vetor[] = {2,3,4,9,7,4,2,1,2,12};
        int vet[] = {3,4,4,2,21};
        int nota[] = {7,8,9,5,10};
        int peso[] = {3,2,3,1,3};
        int vetorcopia[] = {1,1,1,1,1,1,1,1,1,1};
        int vetorordenado[] = {1,1,1,1,1,1,1,1,1,1};
        int kmaior = vetor.length - 3;
        int kmenor = 5;
        int vetor2[] = {2,3,4,9,7,4,2,1,2,12};
        int b = 3;
        int e = 7;
        int num = 9;
        int vetor3[] = {23,4,6,2,8,12,3};
        int vetorfinal[] = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int vetornovo[] = {0,0,0,0,0,0,0,0,0,0};
        
        int num2 = 57;
        
        
		  System.out.println("Questao 1 = " + somatorio(vetor)+"\n");
		  System.out.println("Questao 2 = " + media(vetor,vet)+"\n");
		  System.out.println("Questao 3 = " + mediaponderada(nota,peso)+"\n");
		  System.out.println("Questao 4 = " + contagemdeelementos(vetor)+"\n");
		  System.out.println("Questao 5 = " + copiadevetor(vetor,vetorcopia)+"\n");
		  System.out.println("Questao 6 = " + ordenacaocrescente(vetor, vetorordenado)+"\n");
		  System.out.println("Questao 7 = " + verificacaodeordem(vetor)+"\n");
		  System.out.println("Questao 8 = " + k_esimomaiorvalor(vetor,vetorordenado,kmaior)+"\n");
		  System.out.println("Questao 9 = " + k_esimomenorvalor(vetor,vetorordenado,kmenor)+"\n");
		  System.out.println("Questao 10 = " + verificacaodeigualdade(vetor,vetor2)+"\n");
		  System.out.println("Questao 11 = " + potenciacao(b,e)+"\n");
		  System.out.println("Questao 12 = " + primo(num)+"\n");
		  System.out.println("Questao 13 = " + buscaporocorrencias(vetor,vetor3,vetorfinal)+"\n");
		  System.out.println("Questao 14 = " + remocaodeelemento(vetor,vetornovo)+"\n");
		  System.out.println("Questao 16 = " + primo(num2)+"\n");
	}

}
