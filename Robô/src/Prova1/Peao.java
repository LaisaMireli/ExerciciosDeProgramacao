package Prova1;

public class Peao extends Robo {

	public Peao(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		
		tipoRobo = '=';
		
	}
	public void direitaPeao (int passos) {
		
		if(passos > 1) {
			
			System.out.println("\\nO peão [=] só anda até 1 passo por vez\n");
			return;
		}
		
		for (int i = 0; i < passos; i++) {
	        Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);
	        Celula novaCelula = plano.retornarCelula(posicaox + 1, posicaoy);

	        if (celulaAtual != null && celulaAtual.robo != null && novaCelula != null) {
	        	//esta deixando nulo mesmo quando tem o robo, fazer um if pra caso tenha um robo no deixar nulo
	            celulaAtual.robo = null;
	            novaCelula.robo = this;
	            posicaox += 1;
	        } else {
	        	System.out.println();  	
	        }
	    }
		
	}
	
	public void esquerdaPeao (int passos) {
		
		if(passos > 1) {
			
			System.out.println("\\nO peão [=] só anda até 1 passo por vez\n");
			return;
		}
		
		for (int i = 0; i < passos; i++) {
	        Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);
	        Celula novaCelula = plano.retornarCelula(posicaox - 1, posicaoy);

	        if (celulaAtual != null && celulaAtual.robo != null && novaCelula != null) {
	        	//esta deixando nulo mesmo quando tem o robo, fazer um if pra caso tenha um robo no deixar nulo
	            celulaAtual.robo = null;
	            novaCelula.robo = this;
	            posicaox -= 1;
	        } else {
	        	System.out.println();  	
	        }
	    }
		
	}
	

}
