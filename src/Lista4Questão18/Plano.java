package Lista4Questão18;

import java.util.ArrayList;
import java.util.Random;

public class Plano {
	
	private char [][] posicao = new char [5][5];
	
	public Plano() {
		preencherPosicoes('*');
		sortearPosicaoMoeda();
		
	}
	
	public String Posicao() {
		
	    for (int i = 0; i < getPosicao().length; i++) {
	        for (int j = 0; j < getPosicao().length; j++) {
	            if (j > 0) {
	                System.out.print(" ");
	            }
	            System.out.print(getPosicao()[i][j] + " ");
	        }
	        System.out.println();
	        if (i < getPosicao().length-1) {
	            System.out.print("");
	        }
	    }
	    return " ";
	}
	
	public void preencherPosicoes(char caractere) {
	    int meio = getPosicao().length / 2;
	    
	    for (int i = 0; i < getPosicao().length; i++) {
	        for (int j = 0; j < getPosicao()[i].length; j++) {
	        	
	            if (i == meio && j == meio) {
	                getPosicao()[i][j] = 'R';
	            } else {
	                getPosicao()[i][j] = caractere;
	            }
	        }
	    }
	}
	
	public void sortearPosicaoMoeda() {
		
        Random random = new Random();
        
        int x, y;
        int meio = getPosicao().length / 2;

        do {
            x = random.nextInt(getPosicao().length);
            y = random.nextInt(getPosicao().length);
            
        } while (x == meio && y == meio); 

        getPosicao()[x][y] = '$';
    }
	
	
	
	
		public char [][] getPosicao() {
			return posicao;
		}
		public void setPosicao(char [][] posicao) {
			this.posicao = posicao;
		}
}
		

