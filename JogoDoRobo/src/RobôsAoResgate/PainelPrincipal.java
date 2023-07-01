package RobôsAoResgate;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class PainelPrincipal extends JPanel {
	
	private JPanel principalPainel;
	
	public PainelPrincipal() {
		
		setLayout(new BorderLayout());
	    
	    PainelDoPlano painelPlano = new PainelDoPlano();
	    add(painelPlano, BorderLayout.WEST);
	    
	    PainelDireita painelDireita = new PainelDireita();
	    add(painelDireita, BorderLayout.EAST);
	    
	    setVisible(false);
	}
	


}
