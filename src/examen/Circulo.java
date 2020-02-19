package examen;
/**
@author Miguel_García

@version clase_circulo1.1

@see https://aulavirtual33.educa.madrid.org/ies.goya.madrid/mod/assign/view.php?id=10405

*/


public class Circulo {
	double centroX;
	double centroY;
	double radio;

	/**
	@param cx:centro del círculo en la coordenada x; 
	@param cy:centro del círculo en la coordenada y;
	@param radio:radio del círculo
	@return Este método no retorna nada, es el constructor de la Clase Circulo.java
	*/
	public Circulo(double cx, double cy, double r) {
		centroX = cx;
		centroY = cy;
		radio = r;
	}

	/**
	 * @return el peímetro del círculo
	 */
	public double getPerimetro() {
		return 2 * 3.14159 * radio;
	}

	/**
	 * @return el área del círculo
	 */
	public double getArea() {
		return 3.14159 * radio * radio;
	}

	/**
	 * @return el diametro del círculo
	 */
	public double getDiametro() {
		return 2 * radio;
	}

	/**
	 * @param desplazamientoX: desplazamiento del círculo en la coordenada x
	 * @param desplazamientoY: desplazamiento del círculo en la coordenada y
	 */
	public void moverCirculo(double desplazamientoX, double desplazamientoY) {
		centroX = centroX + desplazamientoX;
		centroY = centroY + desplazamientoY;
	}

	/**
	 * @param escala: escala a la que queremos modificar el tamaño del círculo
	 */
	public void escalarCirculo(double escala) {
		radio = radio * escala;
	}
}

