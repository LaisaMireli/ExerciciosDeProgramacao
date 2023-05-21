package Prova1;

public class Cavalo extends Robo{

	public Cavalo(int id, String nome, int posicaoy, int posicaox, Plano plano) {
		super(id, nome, posicaoy, posicaox, plano);
		
		tipoRobo = '#';
	}
	
	public void direitaCimaCavalo (int passos) {
			
			for (int i = 0; i < passos; i++) {
		        Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);
		        Celula novaCelula = plano.retornarCelula(posicaox + 1, posicaoy - 1);
	
		        if (celulaAtual != null && celulaAtual.robo != null && novaCelula != null) {
		        	celulaAtual.robo = null;
		            novaCelula.robo = this;
		            posicaoy -= 1;
		            posicaox += 1;
		        } 
		        else {
		        	System.out.println();  	
		        }
		    }
			
		   }
		
	
		public void esquerdaCimaCavalo (int passos) {
				
				
			for (int i = 0; i < passos; i++) {
		        Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);
		        Celula novaCelula = plano.retornarCelula(posicaox - 1, posicaoy - 1);
	
		        if (celulaAtual != null && celulaAtual.robo != null && novaCelula != null) {
		        	//esta deixando nulo mesmo quando tem o robo, fazer um if pra caso tenha um robo no deixar nulo
		        	celulaAtual.robo = null;
		            novaCelula.robo = this;
		            posicaoy -= 1;
		            posicaox -= 1;
		        } else {
		        	System.out.println();  	
		        }
		    }
	
	}
		
		public void direitaBaixoCavalo (int passos) {
			
			
			for (int i = 0; i < passos; i++) {
		        Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);
		        Celula novaCelula = plano.retornarCelula(posicaox + 1, posicaoy + 1);
	
		        if (celulaAtual != null && celulaAtual.robo != null && novaCelula != null) {
		        	celulaAtual.robo = null;
		            novaCelula.robo = this;
		            posicaoy += 1;
		            posicaox += 1;
		        } 
		        else {
		        	System.out.println();  	
		        }
		    }
			
		   }
		
		public void esquerdaBaixoCavalo (int passos) {
			
			
			for (int i = 0; i < passos; i++) {
		        Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);
		        Celula novaCelula = plano.retornarCelula(posicaox - 1, posicaoy + 1);
	
		        if (celulaAtual != null && celulaAtual.robo != null && novaCelula != null) {
		        	celulaAtual.robo = null;
		            novaCelula.robo = this;
		            posicaoy += 1;
		            posicaox -= 1;
		        } 
		        else {
		        	System.out.println();  	
		        }
		    }
			
		   }
		

}
