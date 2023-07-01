package RobôsAoResgate;

import javax.swing.ImageIcon;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.util.ArrayList;

import modeloDeNegocio.Bug;
import modeloDeNegocio.*;
import modeloDeNegocio.Celula;
import modeloDeNegocio.Entidades;
import modeloDeNegocio.Robo;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class PainelDoPlano extends JPanel {

	private JPanel painelBotoes;
	JButton robo1;
	JButton robo2;
	JButton robo3;
	private Robo roboSelecionado;

	public PainelDoPlano() {

		criarBotões();
	}

	public JPanel criarBotões() {

		// setLayout(new FlowLayout());
		painelBotoes = new JPanel(new GridLayout(8, 8));
		painelBotoes.setPreferredSize(new Dimension(550, 550));
		painelBotoes.setBackground(Color.WHITE);

		int margem = 10;
		painelBotoes.setBorder(new EmptyBorder(margem, margem, margem, margem));

		add(painelBotoes);

		ArrayList<Celula> listaCelulas = new ArrayList<>();
		ArrayList<Entidades> listaEntidades = new ArrayList<>();
		ArrayList<Robo>listaRobos = new ArrayList<>();
		boolean[][] positions = new boolean[8][8];

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				JButton botao = new JButton();
				Celula celula = new Celula(i, j, listaRobos);	
				
				celula.getBotao().addActionListener(new ActionListener() {
				    @Override
				    public void actionPerformed(ActionEvent e) {
				    	System.out.println("Botão clicado");
				        if (roboSelecionado != null) {
				            roboSelecionado.setPosicaoRobox(celula.getX());
				            roboSelecionado.setPosicaoRoboy(celula.getY());
				            System.out.println("Robô " + roboSelecionado.getNome() + " adicionado à célula [" + celula.getX() + "," + celula.getY() + "]");
				            celula.adicionarRoboSelecionado(roboSelecionado); 
				        }
				    }
				});
				
				if ((i == 5 && j == 5) || (i == 6 && j == 7) || (i == 3 && j == 4) || (i == 7 && j == 7)
						|| (i == 4 && j == 1) || (i == 1 && j == 5) || (i == 7 && j == 2) || (i == 0 && j == 3)) {
					Bug bug = new Bug(celula);
					ImageIcon bugIcon = new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\JogoDoRobo\\icones\\erro.png");
					botao.setIcon(bugIcon);
					celula.setEntidade(bug);
					botao.addActionListener(new eventoEncontrouBug());

				}
				if ((i == 0 && j == 0) || (i == 2 && j == 1) || (i == 3 && j == 5) || (i == 6 && j == 2)
						|| (i == 7 && j == 0) || (i == 4 && j == 7) || (i == 1 && j == 3) || (i == 5 && j == 3)) {
					Aluno aluno = new Aluno(celula);
					ImageIcon AlunoIcon = new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\JogoDoRobo\\icones\\leitura.png");
					botao.setIcon(AlunoIcon);
					celula.setEntidade(aluno);
					botao.addActionListener(new eventoEncontrouAluno());

				}
				if ((i + j) % 2 == 0) {
					botao.setBackground(Color.WHITE);
				} else {
					botao.setBackground(new Color(255, 228, 225));
				}

				celula.setBotao(botao);
				listaCelulas.add(celula);

				painelBotoes.add(botao);
			}
		}
		return painelBotoes;
	}

	public JPanel getPainelBotoes() {
		return painelBotoes;
	}

	public void setPainelBotoes(JPanel painelBotoes) {
		this.painelBotoes = painelBotoes;
	}

	public class eventoEncontrouAluno implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			UIManager.put("Button.background", new Color(255, 228, 225));
			ImageIcon alunoIcon = new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\JogoDoRobo\\icones\\feliz.png");
			JOptionPane.showMessageDialog(null, "Você encontrou um aluno!", "Mensagem", JOptionPane.INFORMATION_MESSAGE,
					alunoIcon);

		}
	}

	public class eventoEncontrouBug implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			UIManager.put("Button.background", new Color(255, 228, 225));
			ImageIcon bugIcon = new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\JogoDoRobo\\icones\\alerta.png");
			JOptionPane.showMessageDialog(null, "Você encontrou um bug!", "Mensagem", JOptionPane.INFORMATION_MESSAGE,
					bugIcon);
		}
	}
	
}
