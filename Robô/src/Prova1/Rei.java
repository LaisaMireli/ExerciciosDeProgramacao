package Prova1;

public class Rei extends Robo {

	public Rei(int id, String nome, int posicaoy, int posicaox, Plano plano) {
		super(id, nome, posicaoy, posicaox, plano);
		
		tipoRobo = 'º';
	}//se move para cima/baixo, esquerda/direita mas apenas uma casa por vez
	
	public void subirRei (int passos) {
		
		if(passos > 1) {
			
			System.out.println("\nO rei [º] só anda até 1 casa por vez\n");
			return;
		}
			
			for (int i = 0; i < passos; i++) {
		        Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);
		        Celula novaCelula = plano.retornarCelula(posicaox, posicaoy - 1);
	
		        if (celulaAtual != null && celulaAtual.listaDeRobos != null && novaCelula != null) {
		        	
		        	celulaAtual.listaDeRobos.remove(this);
		            novaCelula.listaDeRobos.add(this);
		            posicaoy -= 1;
		        } else {
		        	System.out.println();  	
		        }
		    }
			
		}
		
		public void descerRei (int passos) {
			
			if(passos > 1) {
				
				System.out.println("\nO rei [º] só anda até 1 casa por vez\n");
				return;
			}
			
			for (int i = 0; i < passos; i++) {
		        Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);
		        Celula novaCelula = plano.retornarCelula(posicaox, posicaoy + 1);
	
		        if (celulaAtual != null && celulaAtual.listaDeRobos != null && novaCelula != null) {
		        	//esta deixando nulo mesmo quando tem o robo, fazer um if pra caso tenha um robo no deixar nulo
	
		        	celulaAtual.listaDeRobos.remove(this);
		            novaCelula.listaDeRobos.add(this);
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

		        if (celulaAtual != null && celulaAtual.listaDeRobos != null && novaCelula != null) {
		        	//esta deixando nulo mesmo quando tem o robo, fazer um if pra caso tenha um robo no deixar nulo
		        	celulaAtual.listaDeRobos.remove(this);
		            novaCelula.listaDeRobos.add(this);
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

		        if (celulaAtual != null && celulaAtual.listaDeRobos != null && novaCelula != null) {
		        	//esta deixando nulo mesmo quando tem o robo, fazer um if pra caso tenha um robo no deixar nulo
		        	celulaAtual.listaDeRobos.remove(this);
		            novaCelula.listaDeRobos.add(this);
		            posicaox -= 1;
		        } else {
		        	System.out.println();  	
		        }
		    }
			
		}

}
