package BibliotecaTecProg;

public	abstract class Clientes implements ValidacaoEmprestimo{
	
 		protected String nome ;
 		protected int matricula;
 		protected double tps;
 		protected String tipo;
 		

	public Clientes(String nome, int matricula) {
		super();
 		this.matricula = matricula;
 		this.nome = nome;
 		this.tps = 0;
 		
	}


	public int matricula() {
		
		return matricula;
	}


	public static Object getBiblioteca() {
	
		return null;
	}


	
	

}
