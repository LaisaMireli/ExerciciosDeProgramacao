package Lista4Questão6;

public class MainIngresso {

	public static void main(String[] args) {

		Ingresso ingresso = new Ingresso (100, 15);
		IngressoVip vip = new IngressoVip(100, 50);
		Evento evento = new Evento(ingresso);
		
		System.out.println(ingresso.toString());
		System.out.println(vip.toString());
		
		System.out.println(evento.vendaDeIngressos(7));

		System.out.println(evento.vendaDeIngressos(44));
		
		
		
		
	

	}

}
