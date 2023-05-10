package Lista4Questão9;

public class Forma {
	
	protected double area;
	private double altura;
	protected double base;
	
	public Forma(double altura, double base) {
		this.altura = altura;
		this.base = base;
	}
	
	public double calcularArea() {

		area = this.base * this.altura;
		System.out.println("" + area);
		
		return area;
	}
	

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	
}
