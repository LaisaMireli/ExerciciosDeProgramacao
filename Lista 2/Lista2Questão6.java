package Lista2;
import java.util.Scanner;
public class Lista2Questão6 {


	public static void main(String[] args) {
		
		 int [][] matriz = {{1,2,3},
	 			    {2,3,6},
				    {3,6,9}};

         int linhas = matriz.length;
         int colunas = matriz[0].length;
         int simetrica = 0;

         for(int i = 0; i < linhas; i++) {
	         for(int j = 0; j < colunas; j++) {
		         if(linhas  == colunas) {
		 	        simetrica++;
                 }
	
             }

         } 
         
         System.out.println(simetrica); 
         
         if(simetrica == linhas * colunas) {
	        System.out.println("É simétrica");
         }
         else {
	        System.out.println("Não é simétrica");
	 
         }
	
    }
	
}
