package Lista4Questao101112;

public class Pessoa {
	
	private String nome;
	private int cpf;
	private int idade;
	
	
	public Pessoa(String nome, int cpf, int idade){
		
		this.cpf = cpf;
		this.idade = idade;
		this.nome = nome;
		
		
	}
	public String toString () {
		
		return "\nNome: " + this.nome + "\nCpf: " + this.cpf + "\nIdade: " + this.idade;
 		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
