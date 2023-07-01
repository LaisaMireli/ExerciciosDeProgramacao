package RobôsAoResgate;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Janela extends JFrame {

	public Janela() {

		this.setTitle("Robôs ao Resgate");
	    this.setSize(800, 650);

	    ImageIcon icon = new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\JogoDoRobo\\icones\\ilha.png");
	    this.setIconImage(icon.getImage());
	    this.setLayout(new BorderLayout());
	    setResizable(false);
	    

	    PainelPrincipal painelPrincipal = new PainelPrincipal();
	    this.add(painelPrincipal, BorderLayout.CENTER);

	    PainelDeCima painelCima = new PainelDeCima(painelPrincipal);
	    add(painelCima, BorderLayout.NORTH);

	    
	    this.setBackground(Color.WHITE);
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    this.setVisible(true);

	}

}
