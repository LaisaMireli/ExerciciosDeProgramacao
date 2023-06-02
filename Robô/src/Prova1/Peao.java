package Prova1;

public class Peao extends Robo {

	public Peao(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		
		tipoRobo = '=';
		
	}
	public void avancar (int passos) {
		
		if(passos > 1) {
			
			System.out.println("\nO peão [=] só anda até 1 passo por vez\n");
			return;
		}
		
		for (int i = 0; i < passos; i++) {
	        Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);
	        Celula novaCelula = plano.retornarCelula(posicaox + 1, posicaoy);

	        if (celulaAtual != null && celulaAtual.listaDeRobos != null && novaCelula != null) {
	        	celulaAtual.listaDeRobos.remove(this);
	            novaCelula.listaDeRobos.add(this);
	            posicaox += 1;
	            if (!celulaAtual.listaDeEntidades.isEmpty()) {
	                AlunoBug entidade = celulaAtual.listaDeEntidades.get(0);
	                System.out.println("Você encontrou um " + entidade.tipoEntidade + "!");
	                celulaAtual.listaDeEntidades.remove(entidade);
	            }
	        } else {
	        	System.out.println();  	
	        }
	    }
		
	}
	
	public void retroceder (int passos) {
		
		if(passos > 1) {
			
			System.out.println("\nO peão [=] só anda até 1 passo por vez\n");
			return;
		}
		
		for (int i = 0; i < passos; i++) {
	        Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);
	        Celula novaCelula = plano.retornarCelula(posicaox - 1, posicaoy);

	        if (celulaAtual != null && celulaAtual.listaDeRobos != null && novaCelula != null) {
	        	celulaAtual.listaDeRobos.remove(this);
	            novaCelula.listaDeRobos.add(this);
	            posicaox -= 1;
	        } else {
	        	System.out.println();  	
	        }
	    }
		
	}
	

}
