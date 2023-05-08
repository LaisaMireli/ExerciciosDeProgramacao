package BibliotecaTecProg;


public class Emprestimo  {
	
	private Clientes cliente;
	private PublicacaoTecProg publicacao;
	
	public Emprestimo (Clientes cliente, PublicacaoTecProg publicacao) {
		this.cliente = cliente;
		this.publicacao = publicacao;
		
	}
	
	public int pegarPublicacao () {
		int maximo = cliente.maximoEmprestimo();
	    int emprestimosRealizados = Biblioteca.getBiblioteca().getListaEmprestimo().size();
	    int publicacoesDisponiveis = maximo - emprestimosRealizados;

	    return publicacoesDisponiveis;
	}

	public String mostrarDadosEmprestimo() {
		double custoEmTPs = cliente.calcularCustoEmTPs();
		String saida = "";
		
		saida =  this.cliente.tipo +"" + this.cliente.nome + "\nMatricula: " + this.cliente.matricula() + "\n-" + this.publicacao.tipo + ": " + this.publicacao.getTitulo()
		+ "\nDias de empréstimo: " + cliente.verificarDias() + "\nCusto em TPs: " + custoEmTPs  + "\n";
		
		return saida;
	}


}
