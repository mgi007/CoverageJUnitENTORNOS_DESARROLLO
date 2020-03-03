package miguelClasesPOO;

public class Triangulo extends Figura {
 
	public Triangulo(double base, double altura){
		super(base, altura);
	}
	
	public double calcularArea(double base, double altura) {
		double area = (base * altura) / 2;
		return area;
	}
}
