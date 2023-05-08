package BibliotecaTecProg;

public class Revistas extends PublicacaoTecProg {

	public Revistas(String titulo, int anoP, String autor, int quantidadeD) {
		super(titulo, anoP, autor, quantidadeD);
		this.tipo = "Revistas";
	}

}
