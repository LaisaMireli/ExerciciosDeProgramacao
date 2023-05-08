package BibliotecaTecProg;

public class Alunos extends Clientes{
	
	private double descontoLivro = 10.0/100.0;
    private double descontoRevista = 100.0/100.0;
    private double descontoArtigo = 50.0/100.0;
    private int doacaoTPs = 50;


	public Alunos(String nome, int matricula) {
		super(nome, matricula);
		this.tipo = "Aluno";
		this.tps = 0;
	}
	
	public int verificarDias() {
		return 10;
	}


	public double calcularCustoEmTPs() {
		
		double custo = tps;


	    if (getClass().equals(Livros.class)) {
	        custo -= custo * descontoLivro;
	    } else if (getClass().equals(Revistas.class)) {
	        custo -= custo * descontoRevista;
	    } else if (getClass().equals(Artigos.class)) {
	        custo -= custo * descontoArtigo;
	    }
	    return custo;
	}


	public void realizarDoacao(Biblioteca biblioteca) {
		
		 if (tps >= doacaoTPs) {
		        PublicacaoTecProg publicacaoDoada = new PublicacaoDoada("A volta dos que não foram", 2334, "Maguila", 1);
		        biblioteca.realizarDoacao(publicacaoDoada);
		        tps = tps % doacaoTPs;
		    }
	}


	public int maximoEmprestimo() {
		return 5;
	}


}
