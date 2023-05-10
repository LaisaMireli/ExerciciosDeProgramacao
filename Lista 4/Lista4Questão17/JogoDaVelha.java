package Lista4Questão17;

import java.util.Scanner;

public class JogoDaVelha {
	
	private String[][] grade; 
	private String jogador1;
	private String jogador2;
	
	
	public JogoDaVelha(String jogador1, String jogador2) {
		
		grade = new String [3][3];
		
		for (int i = 0; i < grade.length; i++) {
            for (int j = 0; j < grade[i].length; j++) {
                grade[i][j] = " - ";
            
            }
          
        }
	
		
	}
	public void imprimirGrade() {
	    for (int i = 0; i < grade.length; i++) {
	        for (int j = 0; j < grade[i].length; j++) {
	            System.out.print(grade[i][j] + " ");
	        }
	        System.out.println();
	    }
	}

}
