package modeloDeNegocio;

import javax.swing.ImageIcon;

public class RoboFada extends Robo {

	public RoboFada(String nome) {
		super(nome);
	}
	public ImageIcon getIcon() {
        
        return new ImageIcon("fada.png");
    }
}
