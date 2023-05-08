package BibliotecaTecProg;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Clientes aluno = new Alunos (": Laisa\n", 5533);
		Clientes aluno1 = new Alunos (": Yan\n", 7744);
		
		Clientes professor = new Professores (": Jozeane\n", 5433);
		Clientes professor1 = new Professores (": Manuel\n", 7553);
		
		Clientes servidor = new Servidores (": Mauricio\n", 1111);
		Clientes servidor1 = new Servidores (": Joao\n", 222);
		
		
		PublicacaoTecProg livro = new Livros ("Matemática", 1899, "Pitágoras", 5);
		PublicacaoTecProg livro1 = new Livros ("Geografia", 1459, "Jesus", 6);
		
		PublicacaoTecProg revista = new Livros ("Magazine", 1566, "Neymar", 2);
		PublicacaoTecProg revista1 = new Livros ("Playboy", 1353, "Belzebu", 7);
		
		PublicacaoTecProg artigo= new Livros ("A historia das tranças do homem careca", 2332, "Bartolomeu", 8);
		PublicacaoTecProg artigo1 = new Livros ("Interestellar", 2017, "Tarantino", 9);
		
		PublicacaoTecProg tccs = new Livros ("Partiulas Quanticas", 2030, "Pires", 10);
		PublicacaoTecProg tccs1 = new Livros ("Computaçao", 2022, "Fischer", 11);
		
		
		Biblioteca biblioteca = new Biblioteca();
		Emprestimo e = new Emprestimo (aluno, tccs1);
		Emprestimo e1 = new Emprestimo (professor1, revista1);
		Emprestimo e2 = new Emprestimo (servidor, livro1);
		
		biblioteca.addEmprestimo(e);
		System.out.println(e.mostrarDadosEmprestimo());
		biblioteca.addEmprestimo(e1);
		System.out.println(e1.mostrarDadosEmprestimo());
		biblioteca.addEmprestimo(e2);
		System.out.println(e2.mostrarDadosEmprestimo());
		
		Biblioteca biblioteca1 = new Biblioteca();
		 
		ArrayList<Clientes> listaClientes = biblioteca.getClientes();
	
		biblioteca1.exibirClientes(listaClientes);	
		biblioteca1.exibirListagemAcervo();
		
	}

	



}
