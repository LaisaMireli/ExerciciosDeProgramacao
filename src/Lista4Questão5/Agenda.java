package Lista4Questão5;

public class Agenda {
	
	private  Contato contatos;
    private String nomeAgenda;
    private String descricao;

    public Agenda(String nomeAgenda, String descricao) {
        this.nomeAgenda = nomeAgenda;
        this.descricao = descricao;

    }
    public Agenda (Contato contatos) {
    	
    	this.contatos = contatos;
    	
 
    }
    
    public String toString (){
    	
    	return "\nNome agenda: \n" + this.nomeAgenda + "\nDescrição: " + this.descricao;
    	
    	
    }
}
