package Prova1;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {
	
	private ArrayList<Robo> listaDeRobos;
	private ArrayList<AlunoBug> listaDeEntidades;
  	private Plano plano;
 
  	Plano p = new Plano();
  	Menu menu = new Menu();
  
 
	public Jogo() {
		
		listaDeEntidades = new ArrayList <>();
		menu.exibirMenu();
		p.escolherTamanhoPlano();
		movimentarPeca();
		
	}
		
	public void movimentarPeca() {
		
		Scanner leitor = new Scanner(System.in);
		roboAndador andador = new roboAndador(0, "Andador", 1, 1, p);
		Peao peao = new Peao (0, "Peao", 1, 1, p);
		Torre torre = new Torre (0, "Torre", 1, 1, p);
		Bispo bispo = new Bispo (0, "Bispo", 1, 1, p);
		Cavalo cavalo = new Cavalo (0, "Cavalo", 1, 1, p);
		Rei rei = new Rei (0, "Rei", 1, 1, p);
		Rainha rainha = new Rainha (0, "Rainha", 1, 1, p);
	
		p.exibirPlano();	
				
		
		System.out.println("\nDigite quantos Alunos você quer no plano?");
		int alunos = leitor.nextInt();
		
		for (int i =0; i < alunos; i++ ){		
			Alunos aluno = new Alunos(p);		
			listaDeEntidades.add(aluno);		
		}

		System.out.println("\nDigite quantos Bugs você quer no plano?");
		int bugs = leitor.nextInt();
		
		for (int j =0; j < bugs; j++ ){	
			Bugs bug = new Bugs(p);		
			listaDeEntidades.add(bug);		
		}
		
		
		p.exibirPlano();	
		
		boolean respostaValida = false;
	
		do {	
        	  System.out.println("\nEscolha um robô");
        	  String player = leitor.nextLine();
        	  
        	  if (player.equalsIgnoreCase("sair")) {
        		  System.out.println("Obrigada por jogar!");
                  respostaValida = true; 
                  
              } else if (player.equalsIgnoreCase("andador")) {
                System.out.println("Escolha o movimento: Avançar (1) ou Retroceder (2)\n");

                String movimento = leitor.nextLine();

                if (movimento.equalsIgnoreCase("1")) {
                    System.out.println("Quantas casas?");
                    int passos = leitor.nextInt();
                    leitor.nextLine();
                    andador.avancar(passos);
           
                    p.exibirPlano();
                    
                } else if (movimento.equalsIgnoreCase("2")) {
                    System.out.println("Quantas casas?");
                    int passos = leitor.nextInt();
                    leitor.nextLine(); 
                    andador.retroceder(passos);
                    p.exibirPlano();
                }
                
                achouEntidade(andador.retornaCelulaAtual());
             
                }
            
  
            else if (player.equalsIgnoreCase("peao")) {
            	 System.out.println("Escolha o movimento: Avançar (1) ou Retroceder (2)\n");

                 String movimento = leitor.nextLine();
                 if (movimento.equalsIgnoreCase("1")) {
                     System.out.println("Quantas casas?");
                     int passos = leitor.nextInt();
                     leitor.nextLine();
                     peao.avancar(passos);
                     p.exibirPlano();
                     
                 } else if (movimento.equalsIgnoreCase("2")) {
                     System.out.println("Quantas casas?");
                     int passos = leitor.nextInt();
                     leitor.nextLine(); 
                     peao.retroceder(passos);
                     p.exibirPlano();
                 }
                 achouEntidade(peao.retornaCelulaAtual());
            } 
            
            
            else if (player.equalsIgnoreCase("Torre")) {
           	 System.out.println("Escolha o movimento: Avançar (1) ou Retroceder (2)\n");

             String movimento = leitor.nextLine();
             if (movimento.equalsIgnoreCase("1")) {
                 System.out.println("Quantas casas?");
                 int passos = leitor.nextInt();
                 leitor.nextLine();
                 torre.avancar(passos);
                 p.exibirPlano();
                 
             } else if (movimento.equalsIgnoreCase("2")) {
                 System.out.println("Quantas casas?");
                 int passos = leitor.nextInt();
                 leitor.nextLine(); 
                 torre.retroceder(passos);
                 p.exibirPlano();
             }
             achouEntidade(torre.retornaCelulaAtual());
            }
            
            
            else if (player.equalsIgnoreCase("Bispo")) {
              	 System.out.println("Escolha o movimento: Avançar (1) ou Retroceder (2)\n");

                String movimento = leitor.nextLine();
                if (movimento.equalsIgnoreCase("1")) {
                    System.out.println("Quantas casas?");
                    int passos = leitor.nextInt();
                    leitor.nextLine();
                    bispo.avancar(passos);
                    p.exibirPlano();
                    
                } else if (movimento.equalsIgnoreCase("2")) {
                    System.out.println("Quantas casas?");
                    int passos = leitor.nextInt();
                    leitor.nextLine(); 
                    bispo.retroceder(passos);
                    p.exibirPlano();
                }
                achouEntidade(bispo.retornaCelulaAtual());

               }
            
            
            else if (player.equalsIgnoreCase("Cavalo")) {
             	 System.out.println("Escolha o movimento: Avançar (1) ou Retroceder (2)\n");

               String movimento = leitor.nextLine();
               if (movimento.equalsIgnoreCase("1")) {
                   System.out.println("Quantas casas?");
                   int passos = leitor.nextInt();
                   leitor.nextLine();
                   cavalo.avancar(passos);
                   p.exibirPlano();
                   
               } else if (movimento.equalsIgnoreCase("2")) {
                   System.out.println("Quantas casas?");
                   int passos = leitor.nextInt();
                   leitor.nextLine(); 
                   cavalo.retroceder(passos);
                   p.exibirPlano();
               }
               achouEntidade(cavalo.retornaCelulaAtual());
        
              }
            
            
            else if (player.equalsIgnoreCase("Rei")) {
            	
            System.out.println("Escolha o movimento: Avançar (1) ou Retroceder (2)\n");
            String movimento = leitor.nextLine();
            
              if (movimento.equalsIgnoreCase("1")) {
            	  System.out.println("Direita (1) ou esquerda (2)?");
            	  movimento = leitor.nextLine();
            	  
            	  	if(movimento.equalsIgnoreCase("1")) {
            	  		System.out.println("Quantas casas?");
            	  		int passos = leitor.nextInt();
            	  		leitor.nextLine();
            	  		rei.direitaRei(passos);
            	  		p.exibirPlano();
            	  	}
            	  	else if(movimento.equalsIgnoreCase("2")) {
            	  		System.out.println("Quantas casas?");
            	  		int passos = leitor.nextInt();
            	  		leitor.nextLine();
            	  		rei.esquerdaRei(passos);
            	  		p.exibirPlano();
            	  	}
                  
              } else if (movimento.equalsIgnoreCase("2")) {
            	  System.out.println("Cima (1) ou Baixo (2)?");
            	  movimento = leitor.nextLine();
            	  
	          	  	if(movimento.equalsIgnoreCase("1")) {
	          	  		System.out.println("Quantas casas?");
	          	  		int passos = leitor.nextInt();
	          	  		leitor.nextLine();
	          	  		rei.subirRei(passos);
	          	  		p.exibirPlano();
	          	  	}
	          	  	else if(movimento.equalsIgnoreCase("2")) {
	          	  		System.out.println("Quantas casas?");
	          	  		int passos = leitor.nextInt();
	          	  		leitor.nextLine();
	          	  		rei.descerRei(passos);
	          	  		p.exibirPlano();
	          	  	}
	          	  	
	          	   achouEntidade(rei.retornaCelulaAtual());
	              }
     
              
              
             } else if (player.equalsIgnoreCase("Rainha")) {
             	
                 System.out.println("Escolha o movimento: Avançar (1) ou Retroceder (2)\n");
                 String movimento = leitor.nextLine();
                 
                   if (movimento.equalsIgnoreCase("1")) {
                 	  System.out.println("Direita (1) ou esquerda (2)?");
                 	  movimento = leitor.nextLine();
                 	  
                 	  	if(movimento.equalsIgnoreCase("1")) {
                 	  		System.out.println("Quantas casas?");
                 	  		int passos = leitor.nextInt();
                 	  		leitor.nextLine();
                 	  		rainha.direitaRainha(passos);
                 	  		p.exibirPlano();
                 	  	}
                 	  	else if(movimento.equalsIgnoreCase("2")) {
                 	  		System.out.println("Quantas casas?");
                 	  		int passos = leitor.nextInt();
                 	  		leitor.nextLine();
                 	  		rainha.esquerdaRainha(passos);
                 	  		p.exibirPlano();
                 	  	}
                       
                   } else if (movimento.equalsIgnoreCase("2")) {
                 	  System.out.println("Cima (1) ou Baixo (2)?");
                 	  movimento = leitor.nextLine();
                 	  
     	          	  	if(movimento.equalsIgnoreCase("1")) {
     	          	  		System.out.println("Quantas casas?");
     	          	  		int passos = leitor.nextInt();
     	          	  		leitor.nextLine();
     	          	  		rainha.subirRainha(passos);
     	          	  		p.exibirPlano();
     	          	  	}
     	          	  	else if(movimento.equalsIgnoreCase("2")) {
     	          	  		System.out.println("Quantas casas?");
     	          	  		int passos = leitor.nextInt();
     	          	  		leitor.nextLine();
     	          	  		rainha.descerRainha(passos);
     	          	  		p.exibirPlano();
     	          	  	}
     	              }
                   achouEntidade(rainha.retornaCelulaAtual());
                  }
            
            else {
                System.out.println("Robô inválido. Tente novamente");
            }
        }while(!respostaValida);
	}
	
	public void achouEntidade(Celula celula) {
		
		if(celula.listaDeEntidades.size()!=0) {
			if(celula.listaDeEntidades.get(0).tipoEntidade == '¢') {
				System.out.println("\nVocê encontrou um aluno! \n+ 10 pontos");
			}
			else if (celula.listaDeEntidades.get(0).tipoEntidade == '¨') {
				System.out.println("\nVocê encontrou um bug :( \n- 15 pontos");
			}
		}
			
	}
}
	
