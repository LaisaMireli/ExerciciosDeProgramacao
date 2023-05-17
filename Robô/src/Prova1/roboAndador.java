package Prova1;

public class roboAndador extends Robo {

	public roboAndador(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		
		tipoRobo = '+';
		
	}
	
	public void subirAndador (int passos) {
		
		for (int i = 0; i < passos; i++) {
	        Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);
	        Celula novaCelula = plano.retornarCelula(posicaox, posicaoy - 1);

	        if (celulaAtual != null && celulaAtual.robo != null && novaCelula != null) {
	       
	            novaCelula.robo = this;
	            posicaoy -= 1;
	        } else {
	        	System.out.println();  	
	        }
	    }
		
	}
	
	public void descerAndador (int passos) {
		for (int i = 0; i < passos; i++) {
	        Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);
	        Celula novaCelula = plano.retornarCelula(posicaox, posicaoy + 1);

	        if (celulaAtual != null && celulaAtual.robo != null && novaCelula != null) {
	        	//esta deixando nulo mesmo quando tem o robo, fazer um if pra caso tenha um robo no deixar nulo

	            novaCelula.robo = this;
	            posicaoy += 1;
	        } else {
	        	System.out.println();  	
	        }
	    }
		
	}
	

}
