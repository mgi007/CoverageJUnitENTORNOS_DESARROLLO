

public class Rectangulo extends Figura{

	public Rectangulo(double base, double altura){
		super(base, altura);
	}
	
	public double calcularArea(double base, double altura) {
		double area = base * altura;
		return area;
	}
}
