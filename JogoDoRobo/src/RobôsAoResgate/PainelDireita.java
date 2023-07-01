package RobôsAoResgate;

import javax.swing.JPanel;
import javax.swing.UIManager;

import modeloDeNegocio.Celula;
import modeloDeNegocio.Robo;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class PainelDireita extends JPanel {

	private JButton robo1;
	private JButton robo2;
	private JButton robo3;
	private JButton verificar;
	private JButton ProxJogada;
	private JButton sairDoJogo;
	private JPanel pontuacao;
	private JPanel total;
	private JPanel robos;
	private JPanel botoesRobos;
	private JPanel botoes1;
	private JPanel botoes2;
	private JPanel botoes3;
	private Robo roboSelecionado;
	
	public PainelDireita() {

		setLayout(new GridLayout(7, 4));
		PainelPontuacao();
		PainelTotal();
		painelRobos();
		painelBotoesRobos();
		painelBotoes();
		painelProxJogada();
		painelSair();
	}

	public void PainelPontuacao() {

		pontuacao = new JPanel();
		pontuacao.setPreferredSize(new Dimension(225, 25));
		pontuacao.setBackground(Color.white);
		JLabel label = new JLabel("Pontuação:");
		JLabel label1 = new JLabel("0");
		pontuacao.setLayout(new GridLayout());
		pontuacao.add(label);
		pontuacao.add(label1);
		this.add(pontuacao);

	}

	public void PainelTotal() {

		total = new JPanel();
		total.setPreferredSize(new Dimension(225, 25));
		total.setBackground(Color.white);

		JLabel label2 = new JLabel("Total:");
		JLabel label3 = (new JLabel(new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\JogoDoRobo\\icones\\leitura.png")));
		JLabel label5 = new JLabel("0");
		JLabel label4 = (new JLabel(new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\JogoDoRobo\\icones\\erro.png")));
		JLabel label6 = new JLabel("0");

		total.setLayout(new GridLayout());
		total.add(label2);
		total.add(label3);
		total.add(label5);
		total.add(label4);
		total.add(label6);

		this.add(total);
	}

	public void painelRobos() {

		robos = new JPanel();
		robos.setPreferredSize(new Dimension(225, 25));
		robos.setBackground(Color.white);

		JLabel label = (new JLabel(new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\JogoDoRobo\\icones\\fadas.png")));
		JLabel label2 = new JLabel("0");
		JLabel label3 = (new JLabel(new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\JogoDoRobo\\icones\\sereia.png")));
		JLabel label4 = new JLabel("0");
		JLabel label5 = (new JLabel(new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\JogoDoRobo\\icones\\bruxa.png")));
		JLabel label6 = new JLabel("0");

		robos.setLayout(new GridLayout());
		robos.add(label);
		robos.add(label2);
		robos.add(label3);
		robos.add(label4);
		robos.add(label5);
		robos.add(label6);
		this.add(robos);
	}

	public void painelBotoesRobos() {

		botoesRobos = new JPanel();
		botoesRobos.setPreferredSize(new Dimension(225, 25));
		botoesRobos.setBackground(Color.white);

		ImageIcon fada = new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\JogoDoRobo\\icones\\fadas.png");
		ImageIcon sereia = new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\JogoDoRobo\\icones\\sereia.png");
		ImageIcon bruxa = new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\JogoDoRobo\\icones\\bruxa.png");

		robo1 = new JButton(fada);
		this.robo1.setBackground(Color.white);
		
		robo1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            roboSelecionado = new Robo("Robô 1");
	            System.out.println("Robô 1 selecionado");
	        }	        
	    });
				
		robo2 = new JButton(sereia);
		this.robo2.setBackground(Color.white);
		robo2.addActionListener(new ActionListener() {
	        
	        public void actionPerformed(ActionEvent e) {
	            roboSelecionado = new Robo("Robô 2");
	            System.out.println("Robô 2 selecionado");
	        }
	        
			
	    });
		
		robo3 = new JButton(bruxa);
		this.robo3.setBackground(Color.white);
		robo3.addActionListener(new ActionListener() {
	        
	        public void actionPerformed(ActionEvent e) {
	            roboSelecionado = new Robo("Robô 3");
	            System.out.println("Robô 3 selecionado");            
	        }
	        
	    });

		
		botoesRobos.setLayout(new GridLayout());

		botoesRobos.add(robo1);
		botoesRobos.add(robo2);
		botoesRobos.add(robo3);

		this.add(botoesRobos);
	}

	public void painelBotoes() {

		botoes1 = new JPanel();
		botoes1.setPreferredSize(new Dimension(225, 25));
		botoes1.setBackground(Color.white);

		verificar = new JButton("Verificar");
		this.verificar.setBackground(new Color(255, 228, 225));

		botoes1.setLayout(new GridLayout());
		botoes1.add(verificar);

		this.add(botoes1);
	}

	public void painelProxJogada() {

		botoes2 = new JPanel();
		botoes2.setPreferredSize(new Dimension(225, 25));
		botoes2.setBackground(Color.white);

		ProxJogada = new JButton("Próxima Jogada");
		this.ProxJogada.setBackground(new Color(255, 228, 225));

		botoes2.setLayout(new GridLayout());

		botoes2.add(ProxJogada);

		this.add(botoes2);
	}

	public void painelSair() {

		botoes3 = new JPanel();
		botoes3.setPreferredSize(new Dimension(225, 25));
		botoes3.setBackground(Color.white);

		sairDoJogo = new JButton("Sair");
		this.sairDoJogo.setBackground(new Color(255, 228, 225));

		sairDoJogo.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				UIManager.put("Button.background", new Color(255, 228, 225));
				ImageIcon aviso = new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\JogoDoRobo\\icones\\aviso.png");
				UIManager.put("OptionPane.questionIcon", aviso);

				Object[] options = { "Sim", "Não" };
				int confirmacao = JOptionPane.showOptionDialog(null, "Você deseja fechar o jogo?", "Confirmação",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

				if (confirmacao == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});

		botoes3.setLayout(new GridLayout());

		botoes3.add(sairDoJogo);

		this.add(botoes3);

	}

}
