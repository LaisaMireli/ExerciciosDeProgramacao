package BibliotecaTecProg;

 public abstract class PublicacaoTecProg {
	  
	private String titulo;
	private int anoP;
	private String autor; 
	private int quantidadeD;
	protected String tipo;
	
	public PublicacaoTecProg (String titulo, int anoP, String autor, int quantidadeD) {
		super();
		this.anoP = anoP;
		this.autor = autor;
		this.quantidadeD = quantidadeD;
		this.titulo = titulo;
		
		System.out.println("Titulo: " + this.getTitulo() + "\nAno de publicacao: " 
		+ this.anoP + "\nAutor: " + this.autor + "\nQuantidade: " + this.quantidadeD + "\n");
		
	}
	

	public int getAnoP() {
		return anoP;
	}

	public void setAnoP(int anoP) {
		this.anoP = anoP;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getQuantidadeD() {
		return quantidadeD;
	}

	public void setQuantidadeD(int quandiadeD) {
		this.quantidadeD = quandiadeD;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
