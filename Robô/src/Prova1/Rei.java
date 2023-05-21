package Prova1;

public class Rei extends Robo {

	public Rei(int id, String nome, int posicaoy, int posicaox, Plano plano) {
		super(id, nome, posicaoy, posicaox, plano);
		
		tipoRobo = 'º';
	}//se move para cima/baixo, esquerda/direita mas apenas uma casa
	
	public void subirRei (int passos) {
			
			for (int i = 0; i < passos; i++) {
		        Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);
		        Celula novaCelula = plano.retornarCelula(posicaox, posicaoy - 1);
	
		        if (celulaAtual != null && celulaAtual.robo != null && novaCelula != null) {
		        	celulaAtual.robo = null;
		            novaCelula.robo = this;
		            posicaoy -= 1;
		        } else {
		        	System.out.println();  	
		        }
		    }
			
		}
		
		public void descerRei (int passos) {
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
		public void direitaRei (int passos) {
			
			if(passos > 1) {
				
				System.out.println("\nO rei [º] só anda até 1 passo por vez\n");
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
		
		public void esquerdaRei (int passos) {
			
			if(passos > 1) {
				
				System.out.println("\nO rei [º] só anda até 1 passo por vez\n");
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
