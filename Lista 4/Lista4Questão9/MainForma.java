package Lista4Questão9;

public class MainForma {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado (2, 2);
		Retangulo retangulo = new Retangulo (3, 4);
		Circulo circulo = new Circulo (0, 0, 7);
		Triangulo triangulo = new Triangulo(6, 5);
		
		System.out.println(quadrado.toString());
		double areaQuadrado = quadrado.calcularArea();
		System.out.println("Área do quadrado: " + areaQuadrado);

		System.out.println(retangulo.toString());
		double areaRetangulo = retangulo.calcularArea();
		System.out.println("Área do retângulo: " + areaRetangulo);

		System.out.println(circulo.toString());
		double areaCirculo = circulo.calcularArea();
		System.out.println("Área do círculo: " + areaCirculo);

		System.out.println(triangulo.toString());
		double areaTriangulo = triangulo.calcularArea();
		System.out.println("Área do triângulo: " + areaTriangulo);

	}

}
