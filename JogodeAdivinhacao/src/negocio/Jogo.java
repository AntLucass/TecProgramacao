package negocio;

import apresentacao.*;
import java.util.Random;

public class Jogo {

	private Jogador jogador;
	private Tela tela;
	private Terminal terminal;
	private int numeroEscolhido;
	private boolean jogando;
    private Random random = new Random();
	
	public Jogo() {
		tela = new Tela();
		terminal = new Terminal();
		jogador = new Jogador();
		numeroEscolhido = random.nextInt(100);;
		jogando = true;
	}

	public void inciarJogoGUI() {
		jogador.setNome(tela.entradaDados("Qual e o seu nome?"));
		tela.mesagem("Seja bem vindo: " + jogador.getNome());
		jogadas();
	}

	public void solicitarNumero() {
		try {
			 String numero = tela.entradaDados("Informe um Numero:");
			  int num = Integer.parseInt(numero);
			  jogador.addNumero(num);
			  verificarAcerto(num);
		      }catch(Exception e) {
		    	 tela.mesagem("Voce inseriu um caractere diferente do solicitado\nInsira um numero Inteiro");
		    	 solicitarNumero();
		     }
		
	}

	public void jogadas() {
		do {
			solicitarNumero();
		} while (jogando);

		fimDoJogo();
	}

	private void fimDoJogo() {

		String numeros = "";
		for (Integer numero : jogador.getListaNumeros()) {
			numeros += " - " + numero;
		}
		tela.mesagem("Numeros apostados: " + numeros);
	}

	public boolean verificarMenor(int numero) {
		if (numero < numeroEscolhido)
			return true;

		return false;
	}

	public void verificarAcerto(int num) {
		if (num == numeroEscolhido) {
			tela.mesagem("Parabens voce Acertou! \nNumero de tentativas Total: " + jogador.getNumeroTentativa());
			jogando = false;
		} else {
			tela.mesagem("Deu ruim, voce Errou!\n" + verificarProximidade(num) + "\nNumero de Tentativas ate agora: " + jogador.getNumeroTentativa());
			jogador.setNumeroTentativa();
		}
	}

	
	public String verificarProximidade(int numero) {
		if(verificarMenor(numero)) {
			return "Tente um numero maior";
		}else {
			return "Tente um numero menor";
		}
	}
	
	
	
	
	
	
	
	public void inciarJogoTerminal() {
		jogador.setNome(terminal.entradaNome());
		terminal.mesagem("Seja bem vindo: " + jogador.getNome());
	}
	
	// public void verificarAcerto() {
	// do {
	// if (solicitarNumero() == numeroEscolhido) {
	// jogador.setNumeroTentativa();
	// tela.mesagem("Parabens voce acertou! numero de tentativas: " +
	// jogador.getNumeroTentativa());
	// return;
	// } else {
	// tela.mesagem("Deu ruim, voce errou");
	// jogador.setNumeroTentativa();
	// }
	// } while (true);
	// }
}
