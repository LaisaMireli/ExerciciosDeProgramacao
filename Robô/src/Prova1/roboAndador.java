package Prova1;

import java.util.Scanner;

public class roboAndador extends Robo {

	
	public roboAndador(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		
		tipoRobo = '+';	
	}
	
	public void avancar (int passos) {
		
		    if (passos >= 0) {
		    	
		        for (int i = 0; i < passos; i++) {
		            Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);

		            if (celulaAtual == null) {
		                return;
		            }

		            Celula novaCelula = plano.retornarCelula(posicaox, posicaoy - 1);

		            if (novaCelula != null) {
		                celulaAtual.listaDeRobos.remove(this);
		                novaCelula.listaDeRobos.add(this);
		                posicaoy -= 1;
		                
		                if (!celulaAtual.listaDeEntidades.isEmpty()) {
			                AlunoBug entidade = celulaAtual.listaDeEntidades.get(0);
			                System.out.println("Você encontrou um " + entidade.tipoEntidade + "!");
			                celulaAtual.listaDeEntidades.remove(entidade);
			            }
		            }
		        }
		        
		    } else {
		        System.out.println("Digite um número inteiro.");
		 }
}
	
	
	public void retroceder (int passos) {
		
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
