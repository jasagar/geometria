
/**
 * Clase Rectangulo_JSG. Calcula el área y el perímetro del rectángulo
 * Subclase de la superclase FiguraGeometrica_JSG
 * @author Jaime Sansano García
 * @version 1.2
 *
 */
public class Rectangulo_JSG extends FiguraGeometrica_JSG {
	private double l1;
	private double l2;
	
	/**
	 * Constructor de la clase Rectangulo_JSG
	 * @param tipoFigura String con el tipo de figura
	 * @param lG double con el valor del lado mayor
	 * @param lP double con el valor del lado menor
	 */
	public Rectangulo_JSG(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Implementación del método abstracto area() de la superclase FiguraGeometrica_JSG
	 * @return double con el valor del área del rectángulo
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Implementación del método abstracto perimetro() de la superclase FiguraGeometrica_JSG
	 * @return double con el valor del perímetro del rectángulo
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
