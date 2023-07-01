package modeloDeNegocio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class Celula {

	private int x;
	private int y;
	private JButton botao = new JButton();
	public ArrayList<Celula> listaCelulas;
	public ArrayList<Robo> listaDeRobos;
	public ArrayList<Entidades> listaDeEntidades;
	private Entidades entidade;
	private Robo roboSelecionado;
	


	public Celula(int x, int y,  ArrayList<Robo> listaRobos) {
		this.x = x;
		this.y = y;
		adicionarOuvinteEvento();
		listaCelulas = new ArrayList<>();
		listaCelulas.add(this); 

	}
	
	private void adicionarOuvinteEvento() {
	    botao.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            if (roboSelecionado != null) {
	                roboSelecionado.setPosicaoRobox(x);
	                roboSelecionado.setPosicaoRoboy(y);
	                System.out.println("Robô " + roboSelecionado.getNome() + " adicionado à célula [" + x + "," + y + "]");
	                adicionarRobo(roboSelecionado); 
	            }
	        }
	    });
	    }
	
	
	public void adicionarRoboSelecionado(Robo robo) {
        listaDeRobos.add(robo);
       
    }
	
	 
	 public void adicionarRobo(Robo robo) {
		    listaDeRobos.add(robo);
		}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public JButton getBotao() {
		return botao;
	}

	public void setBotao(JButton botao) {
		this.botao = botao;
	}

	public void setEntidade(Entidades entidade) {
		this.entidade = entidade;
	}

	public Entidades getEntidade() {
		return entidade;
	}

	public void setEntidade(Aluno aluno) {

	}

	public void setEntidade(Bug bug) {

	}

}
