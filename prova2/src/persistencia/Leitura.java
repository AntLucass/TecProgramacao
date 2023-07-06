package persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import controle.Jogador;

public class Leitura {
	private ArrayList<Jogador> lista;

	public Leitura() {
		lista = new ArrayList<Jogador>();

		try {
			FileReader arquivo = new FileReader("Dados/dados");
			BufferedReader leitura = new BufferedReader(arquivo);
			while (leitura.ready()) {
				lista.add(separarDados(leitura.readLine()));
			}

		} catch (Exception e) {
		}
	}

	public ArrayList<String> getLinha() {
		ArrayList<String> dados = new ArrayList<>();
		try {
			FileReader arquivo = new FileReader("Dados/dados");
			BufferedReader leitura = new BufferedReader(arquivo);
			String linha = leitura.readLine();
			while (linha != null) {
				dados.add(linha);
				linha = leitura.readLine();
			}
			arquivo.close();
		} catch (Exception e) {
		}
		return dados;
	}


	private Jogador separarDados(String linha) {
		String dados[] = linha.split(";");
		Jogador jogador = new Jogador(dados[0]);
		        jogador.setNumeroRodadas(Integer.parseInt(dados[1]));
		        jogador.setNumeroBugs(Integer.parseInt(dados[2]));
		        jogador.setNumeroAlunos(Integer.parseInt(dados[3]));
		        jogador.setCelulasVazias(Integer.parseInt(dados[4]));
		        jogador.getPersonagem1().setPontos(Integer.parseInt(dados[5]));
				jogador.getPersonagem2().setPontos(Integer.parseInt(dados[6]));
				jogador.getPersonagem3().setPontos(Integer.parseInt(dados[7]));
				jogador.setPontuacao(Integer.parseInt(dados[8]));
		return jogador;
	}

	public ArrayList<Jogador> getLista() {
		return lista;
	}

}
