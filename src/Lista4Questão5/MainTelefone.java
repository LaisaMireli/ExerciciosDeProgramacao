package Lista4Questão5;

public class MainTelefone {

	public static void main(String[] args) {
	
		Agenda agenda = new Agenda ("Agenda da Laisa <3 \n", "\nAnotações/Faculdade\n");
		
		System.out.println(agenda.toString());
		
		Contato contato = new Contato (4444, "Luisa","luisa@gmaio.com" , 99561739, "Sao Paulo", "Gente boa");
		
		System.out.println(contato.toString());
		
		Contato contato2 = new Contato (666, "Joao", "joao@gmal.com", 0, "Ceara", "Legal");
		
		System.out.println(contato2.toString());
		
		System.out.println(contato.duplicarContato());
		
		
		
	}

}
