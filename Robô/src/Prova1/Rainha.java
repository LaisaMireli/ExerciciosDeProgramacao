package Prova1;

public class Rainha extends Robo{

	public Rainha(int id, String nome, int posicaoy, int posicaox, Plano plano) {
		super(id, nome, posicaoy, posicaox, plano);
		
		tipoRobo = '§';
	}//se move para cima/baixo, esquerda/direita quantas casa quiser por vez
	
	public void subirRainha (int passos) {
			
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
		
		public void descerRainha (int passos) {
			
			for (int i = 0; i < passos; i++) {
		        Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);
		        Celula novaCelula = plano.retornarCelula(posicaox, posicaoy + 1);
	
		        if (celulaAtual != null && celulaAtual.listaDeRobos != null && novaCelula != null) {
	
		        	celulaAtual.listaDeRobos.remove(this);
		            novaCelula.listaDeRobos.add(this);		            
		            posicaoy += 1;
		        } else {
		        	System.out.println();  	
		        }
		    }
			
		}
		public void direitaRainha (int passos) {
			
			for (int i = 0; i < passos; i++) {
		        Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);
		        Celula novaCelula = plano.retornarCelula(posicaox + 1, posicaoy);

		        if (celulaAtual != null && celulaAtual.listaDeRobos != null && novaCelula != null) {
		        
		        	celulaAtual.listaDeRobos.remove(this);
		            novaCelula.listaDeRobos.add(this);
		            posicaox += 1;
		        } else {
		        	System.out.println();  	
		        }
		    }
			
		}
		
		public void esquerdaRainha (int passos) {

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
