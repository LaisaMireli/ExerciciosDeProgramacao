package BibliotecaTecProg;

public class PublicacaoDoada extends PublicacaoTecProg {
	
	 private String doador;
	 
	public PublicacaoDoada(String titulo, int anoP, String autor, int quantidadeD) {
		super(titulo, anoP, autor, quantidadeD);
	
	}


	public String getDoador() {
        return doador;
    }

    public void setDoador(String doador) {
        this.doador = doador;
    }

}
