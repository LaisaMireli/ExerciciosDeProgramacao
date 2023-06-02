package Prova1;

public class Torre extends Robo {

	public Torre(int id, String nome, int posicaoy, int posicaox, Plano plano) {
		super(id, nome, posicaoy, posicaox, plano);
		
		tipoRobo = '!';
	}
	
	public void avancar (int passos) {
			
		if(passos < 1 || passos > 2) {
			
			System.out.println("\nA torre [!] só anda até 2 passos pra cima ou para baixo\n");
			return;
		}
		
		for (int i = 0; i < passos; i++) {
	        Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);
	        Celula novaCelula = plano.retornarCelula(posicaox, posicaoy - 1);

	        if (celulaAtual != null && celulaAtual.listaDeRobos != null && novaCelula != null) {
	        	
	        	celulaAtual.listaDeRobos.remove(this);
	            novaCelula.listaDeRobos.add(this);
	            posicaoy -= 1;
	        } 
	        else {
	        	System.out.println();  	
	        }
	    }
		
	   }
	

		public void retroceder (int passos) {
			
			if(passos < 1 || passos > 2) {
				
				System.out.println("\nA torre [!] só anda até 2 passos pra cima ou para baixo\n");
				return;
			}
			
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
}
