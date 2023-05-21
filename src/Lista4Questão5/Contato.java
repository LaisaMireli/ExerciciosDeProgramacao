package Lista4Questão5;

public class Contato {
	
	private double codigo;
	private String nome;
	protected String email;
	private String endereco;
	private String observacao;
	private int telefone;
	
	
	
	public String toString () {
		
		return "\nCódigo: " + this.codigo + "\nNome: " + this.nome + "\nEmail: " + this.email + "\nEndereço: " + this.endereco+ "\nObservação:"
		+ this.observacao + "\nTelefone: " + this.telefone;
	}
	
	
	
	public boolean verificarPreenchimento() {
		if(this.codigo == 0|| this.email == null || this.endereco == null || this.nome == null || this.observacao == null || this.telefone == 0){
			return false;
		}else {
			
			return true;
		}
	}
	
	
	
	public Contato duplicarContato() {
		
		return new Contato(this.codigo, this.nome, this.email, this.telefone);
	}
	
	
	
	private Contato (double codigo) {
		this.codigo = codigo;
	}
	
	private Contato (double codigo, String nome) {
		
		this.codigo = codigo;
		this.nome = nome;
		
	}
	
	private Contato (double codigo, String nome, String email) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		
	}
	
	private Contato(int telefone) {
	    this.telefone = telefone;
	    
	}
	private Contato (double codigo, String nome, String email, int telefone) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		
	}
	
	
	Contato (double codigo, String nome, String email, int telefone, String endereco, String observacao) {
		
		if(codigo >= 1000 && codigo <= 9999) {
			this.codigo = codigo;
		}
		else {
			
			System.out.println("\nCódigo inválido\nContato: " + nome);
		}
		
		this.nome = nome;
		
		this.email = email;
		
		if(telefone >= 10000000 && telefone <= 99999999) {
			this.telefone = telefone;
		}
		else {
			
			System.out.println("\nTelefone inválido\nContato: " + nome);
		}
		
		this.observacao = observacao;
		this. endereco = endereco;
			
	}



	public double getCodigo() {
		return codigo;
	}



	public void setCodigo(double codigo) {
		this.codigo = codigo;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getTelefone() {
		return telefone;
	}



	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
}
