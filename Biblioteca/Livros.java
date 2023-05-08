package BibliotecaTecProg;

public class Livros extends PublicacaoTecProg{

	public Livros(String titulo, int anoP, String autor, int quantidadeD) {
		super(titulo, anoP, autor, quantidadeD);
		this.tipo = "Livro";
	}

}
