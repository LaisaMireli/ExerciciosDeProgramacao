package BibliotecaTecProg;

public class Artigos extends PublicacaoTecProg{

	public Artigos(String titulo, int anoP, String autor, int quantidadeD) {
		super(titulo, anoP, autor, quantidadeD);
		this.tipo = "Artigos";
	}

}
