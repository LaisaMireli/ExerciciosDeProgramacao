package RobôsAoResgate;

import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;

public class PainelDeCima extends JPanel {

	private JButton Jogar;
	private JButton Relatorio;
	private JPanel painelInicial;
	PainelDoPlano painelDoPlano;
	PainelDireita painelDireita;
	PainelPrincipal painelPrincipal;
	

	private JButton criarBotao(String nome) {

		return new JButton(nome);
	}

	public PainelDeCima(PainelPrincipal painelPrincipal) {
		this.setLayout(new FlowLayout());
		
		this.painelPrincipal = painelPrincipal;
		painelDoPlano = new PainelDoPlano();
		painelInicial = new JPanel();
		painelInicial.setPreferredSize(new Dimension(800, 40));
		painelInicial.setLayout(new FlowLayout());
		painelInicial.setBackground(Color.white);

		JLabel label = new JLabel("Jogador:");
		painelInicial.add(label);

		JTextField textField = new JTextField(20);
		textField.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				atualizarEstadoBotao();
			}

			public void removeUpdate(DocumentEvent e) {
				atualizarEstadoBotao();
			}

			public void insertUpdate(DocumentEvent e) {
				atualizarEstadoBotao();
			}
		});
		painelInicial.add(textField);

		this.Jogar = this.criarBotao("Jogar");
		this.Jogar.setBackground(new Color(255, 228, 225));
		this.Jogar.setEnabled(false);
		this.Jogar.addActionListener(new eventoJogar());

		this.Relatorio = this.criarBotao("Relatório Do Jogo");
		this.Relatorio.setBackground(new Color(255, 228, 225));

		painelInicial.add(Jogar);
		painelInicial.add(Relatorio);
		this.add(painelInicial);

	}

	private void atualizarEstadoBotao() {
		JTextField textField = (JTextField) painelInicial.getComponent(1);
		String texto = textField.getText().trim();
		Jogar.setEnabled(!texto.isEmpty());
	}

	public class eventoJogar implements ActionListener {

		public void actionPerformed(ActionEvent e) {
					
			painelPrincipal.setVisible(true);

		}
	}
}
