package Prova1;

public class Bispo extends Robo{

	public Bispo(int id, String nome, int posicaoy, int posicaox, Plano plano) {
		super(id, nome, posicaoy, posicaox, plano);
		
		tipoRobo = '&';
	}
	
	//para diferenciar do cavalo fiz o bispo andar apenas 2 passos por vez pela diagonal e o cavalo o quanto 
	//quiser dentro do plano
	
	public void direitaCimaBispo (int passos) {
		
		if(passos < 1 || passos > 2) {
			
			System.out.println("\nO bispo [&] só anda até 2 passos nas diagonais\n");
			return;
		}
		
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
	

	public void esquerdaCimaBispo (int passos) {
			
			if(passos < 1 || passos > 2) {
				
				System.out.println("\nO bispo [&] só anda até 2 passos nas diagonais\n");
				return;
			}
			
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
	
	public void direitaBaixoBispo (int passos) {
		
		if(passos < 1 || passos > 2) {
			
			System.out.println("\nO bispo [&] só anda até 2 passos nas diagonal\n");
			return;
		}
		
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
	
	public void esquerdaBaixoBispo (int passos) {
		
		if(passos < 1 || passos > 2) {
			
			System.out.println("\nO bispo [&] só anda até 2 passos nas diagonais\n");
			return;
		}
		
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
