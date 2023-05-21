package Lista4Questão17;

import java.util.Scanner;

public class ExecutaJogo {
	
	public void jogarJogoDaVelha (){	
		
	 Scanner scanner = new Scanner(System.in);
     JogoDaVelha jogo = new JogoDaVelha();
     String posicao;

     int jogadas = 0;

     System.out.println("\n--Jogo da Velha--\n");
     jogo.Posicao();

     boolean jogoFinalizado = false;

     do {
         System.out.println("\nJogador 1, informe uma posição válida: \n");
         posicao = scanner.next();

         while (!jogo.preenchido(posicao)) {
             System.out.println("\nPosição inválida, tente novamente: \n");
             System.out.println("\nJogador 1, informe uma posição válida: \n");
             posicao = scanner.next();
         }

         jogo.jogar(posicao, "X");
         jogadas++;
         jogo.Posicao();
       

         if (!jogo.ganhador(jogadas).equals("null")) {
          
             jogoFinalizado = true;
         } else {
             System.out.println("\nJogador 2, informe uma posição válida: \n");
             posicao = scanner.next();

             while (!jogo.preenchido(posicao)) {
                 System.out.println("\nPosição inválida, tente novamente: \n");
                 System.out.println("\nJogador 2, informe uma posição válida: \n");
                 posicao = scanner.next();
             }

             jogo.jogar(posicao, "O");
             jogadas++;
             jogo.Posicao();
         
             if (!jogo.ganhador(jogadas).equals("null")) {
                 jogoFinalizado = true;
             }
         }
     } while (!jogoFinalizado);
     System.out.println(jogo.ganhador(jogadas));
     
     jogarNovamente();
 }
	
	
	public void jogarNovamente() {
		
		 	Scanner scanner = new Scanner(System.in);
		    String jogarDeNovo;

		    System.out.println("Você deseja jogar novamente?\nSim/Não\n");

		    boolean respostaValida = false;
		    do {
		        jogarDeNovo = scanner.next();

		        if (jogarDeNovo.equalsIgnoreCase("Sim") || jogarDeNovo.equalsIgnoreCase("S")) {
		            respostaValida = true;
		            jogarJogoDaVelha();
		        } else if (jogarDeNovo.equalsIgnoreCase("Não") || jogarDeNovo.equalsIgnoreCase("N")) {
		            respostaValida = true;
		            System.out.println("Obrigado por jogar! Até a próxima.");
		           
		            
		        } else {
		            System.out.println("Escolha inválida! Digite novamente: ");
		        }
		    } while (!respostaValida);
	}
}