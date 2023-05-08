package BibliotecaTecProg;

import java.util.ArrayList;


public class Biblioteca {
	
	 private ArrayList<PublicacaoTecProg> acervo;
	 private ArrayList<Clientes> clientes;
	
	private ArrayList <Emprestimo> listaEmprestimo;
	
	public Biblioteca () {
		listaEmprestimo = new ArrayList <Emprestimo>();
		acervo = new ArrayList <PublicacaoTecProg>();
		clientes = new ArrayList <Clientes> ();
		
	}
	
	public void addEmprestimo (Emprestimo e) {
		
		listaEmprestimo.add(e);
	}
	
	public ArrayList <Emprestimo> getListaEmprestimo(){
		
		return listaEmprestimo;
	}
	
	public void realizarDoacao(PublicacaoTecProg publicacaoDoada) {
	    Emprestimo emprestimo = new Emprestimo(null, publicacaoDoada);
	    listaEmprestimo.add(emprestimo);
	    System.out.println("Doação realizada com sucesso!");
	}
	
	public void exibirListagemAcervo() {
        for (PublicacaoTecProg publicacao : acervo) {
            String tipo = publicacao.getTipo();
            String titulo = publicacao.getTitulo();
            int ano = publicacao.getAnoP();
            String autor = publicacao.getAutor();
            int quantidade = publicacao.getQuantidadeD();

            System.out.println(tipo + ": " + titulo + "; " + ano + "; " + autor + "; " + quantidade);
        }
    }
	
	public void exibirClientes(ArrayList<Clientes> lista) {
        for (Clientes cliente : lista) {
            System.out.println(cliente.toString());
        }
    }

    public static Biblioteca getBiblioteca() {
        return null;
    }
	

	public ArrayList<PublicacaoTecProg> getAcervo() {
		return acervo;
	}

	public void setAcervo(ArrayList<PublicacaoTecProg> acervo) {
		this.acervo = acervo;
	}

	public ArrayList<Clientes> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Clientes> clientes) {
		this.clientes = clientes;
	}

	public void setListaEmprestimo(ArrayList<Emprestimo> listaEmprestimo) {
		this.listaEmprestimo = listaEmprestimo;
	}

}
