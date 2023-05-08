package controlador;

public class IniciarBiblioteca {

	public static void main(String[] args) {
		
		
		
		//Clientes da Biblioteca TecProg
		Pessoa aluno = new Aluno(30305, "Joao");
		Pessoa aluno2= new Aluno(2552, "Marcos");
		Pessoa aluno3= new Aluno(2312, "Marcia");
		
		Pessoa professor = new Professor(2525, "Mateus");
		Pessoa professor2 = new Professor(565, "jonas");
		
		Pessoa servidor = new Servidor(898, "Michelle");
		Pessoa servidor2 = new Servidor(982, "Thales");
		
		//Publicacoes da Biblioteca TecProg
		Publicacao livro = new Livro("Java como programa", 2020, "Deitel", 10);
		Publicacao livro2 = new Livro("Python como programa", 2019, "Oliveira", 10);
		Publicacao livro3 = new Livro("Como programa em Java", 2022, "Deitel", 20);
		Publicacao livro4 = new Livro("Como ser aprovado em Tecnicas de Programacao", 2023, "Geovana e Caua", 10);
		
		Publicacao revista = new Revista("INDICO: inclusao digital necessaria para sociedade atual", 2023, "Geovana e Caua", 8);
		Publicacao revista2 = new Revista("inteligencia artificial aplicada", 2023, "Amora",10);

		Publicacao artigo = new Artigo("Um comparativo de desempenho entre Java e Python", 2021, "Silva", 4);
		Publicacao artigo2 = new Artigo("Um comparativo entre o Eclipse e VsCode", 2023, "Cordeiro", 5);
		
		Biblioteca bib= new Biblioteca();
		Emprestimo e1= new Emprestimo(aluno, artigo);
		Emprestimo e2= new Emprestimo(professor, revista);
		Emprestimo e3= new Emprestimo(servidor, revista2);
		Emprestimo e4= new Emprestimo(aluno2, livro3);
		Emprestimo e5= new Emprestimo(aluno3, revista);
		
		
		bib.addEmprestimo(e1);
		System.out.println(e1.retornarDadosEmprestimo());
		bib.addEmprestimo(e2);
		System.out.println(e2.retornarDadosEmprestimo());
		bib.addEmprestimo(e3);
		System.out.println(e3.retornarDadosEmprestimo());
		bib.addEmprestimo(e4);
		System.out.println(e4.retornarDadosEmprestimo());
		bib.addEmprestimo(e5);
		System.out.println(e5.retornarDadosEmprestimo());
		
		

		System.out.println("\n");
		System.out.println("Alunos: " + "\n" + aluno.matricula + "; " + aluno.nome + "; " + aluno.tps);
		System.out.println(aluno2.matricula + "; " + aluno2.nome + "; " + aluno2.tps);
		System.out.println(aluno3.matricula + "; " + aluno3.nome + "; " + aluno3.tps);
	
		System.out.println("\n");
		System.out.println("Servidores: " + "\n" + servidor.matricula + "; " + servidor.nome + "; " + servidor.tps);
		System.out.println(servidor2.matricula + "; " + servidor2.nome + "; " + servidor2.tps);
		
		System.out.println("\n");
		System.out.println("Professores: " + "\n" + professor.matricula + "; " + professor.nome + "; " + professor.tps);
		System.out.println(professor2.matricula + "; " + professor2.nome + "; " + professor2.tps);
		
			
		
		System.out.println("\n");
		System.out.println("Livros: " + "\n" + livro.titulo + "; " + livro.ano + "; " + livro.autor + "; " + livro.quantidadeDisponivel);
		System.out.println(livro2.titulo + "; " + livro2.ano + "; " + livro2.autor + "; " + livro2.quantidadeDisponivel);
		System.out.println(livro3.titulo + "; " + livro3.ano + "; " + livro3.autor + "; " + livro3.quantidadeDisponivel);
		System.out.println(livro4.titulo + "; " + livro4.ano + "; " + livro4.autor + "; " + livro4.quantidadeDisponivel);
		
		System.out.println("\n");
		System.out.println("Artigos: " + "\n" + artigo.titulo + "; " + artigo.ano + "; " + artigo.autor + "; " + artigo.quantidadeDisponivel);
		System.out.println(artigo2.titulo + "; " + artigo2.ano + "; " + artigo2.autor + "; " + artigo2.quantidadeDisponivel);
		
		
		System.out.println("\n");
		System.out.println("Revistas: " + "\n" + revista.titulo + "; " + revista.ano + "; " + revista.autor + "; " + revista.quantidadeDisponivel);
		System.out.println(revista2.titulo + "; " + revista2.ano + "; " + revista2.autor + "; " + revista2.quantidadeDisponivel);
	}

}
