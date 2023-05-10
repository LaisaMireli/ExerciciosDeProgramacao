package Lista4Questão9;

public class Circulo  extends Forma{
	
	private double raio;
	private double pi;

	public Circulo(double altura, double base, double raio) {
		super(altura, base);
		this.raio = raio;
		this.pi = 3.14;
		
	}
	
	public double calcularArea() {
		double area;
		area = pi * raio * raio;
		return area;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public String toString () {
		
		return "\nCirculo\n";
	}

}
