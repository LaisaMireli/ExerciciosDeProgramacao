package Prova1;

public class Cavalo extends Robo{

	public Cavalo(int id, String nome, int posicaoy, int posicaox, Plano plano) {
		super(id, nome, posicaoy, posicaox, plano);
		
		tipoRobo = '#';
	}
	
		public void avancar (int passos) {
				
				
			for (int i = 0; i < passos; i++) {
		        Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);
		        Celula novaCelula = plano.retornarCelula(posicaox - 1, posicaoy - 1);
	
		        if (celulaAtual != null && celulaAtual.listaDeRobos != null && novaCelula != null) {
		        	celulaAtual.listaDeRobos.remove(this);
		            novaCelula.listaDeRobos.add(this);
		            posicaoy -= 1;
		            posicaox -= 1;
		        } else {
		        	System.out.println();  	
		        }
		    }
	
	}
		
		public void retroceder (int passos) {
			
			
			for (int i = 0; i < passos; i++) {
		        Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);
		        Celula novaCelula = plano.retornarCelula(posicaox + 1, posicaoy + 1);
	
		        if (celulaAtual != null && celulaAtual.listaDeRobos != null && novaCelula != null) {
		        	celulaAtual.listaDeRobos.remove(this);
		            novaCelula.listaDeRobos.add(this);
		            posicaoy += 1;
		            posicaox += 1;
		        } 
		        else {
		        	System.out.println();  	
		        }
		    }
			
		   }
		
}
