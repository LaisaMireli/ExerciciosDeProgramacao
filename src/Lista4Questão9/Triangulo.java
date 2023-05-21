package Lista4Questão9;

public class Triangulo  extends Forma{

	public Triangulo(double altura, double base) {
		super(altura, base);
	
	}
	
	public double calcularArea() {
		
		double area;
		area = (getBase()*getAltura()/2);
		
		return area;
	}
	
	public String toString () {
		
		return "\nTriangulo\n";
	}

}
