
/**
 * Clase Rectangulo_JSG. Calcula el �rea y el per�metro del rect�ngulo
 * Subclase de la superclase FiguraGeometrica_JSG
 * @author Jaime Sansano Garc�a
 * @version 1.2
 *
 */
public class Rectangulo_JSG extends FiguraGeometrica_JSG {
	private double l1;
	private double l2;
	
	/**
	 * Constructor de la clase Rectangulo_JSG
	 * @param tipoFigura Atributo String de la superclase
	 * @param lG Valor double del lado mayor
	 * @param lP Valor double del lado menor
	 */
	public Rectangulo_JSG(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Implementaci�n del m�todo abstracto de la superclase area()
	 * @return l1 * l2 Double con el �rea del rect�ngulo
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Implementaci�n del m�todo abstracto de la superclase perimetro()
	 * @return (2 * l1) + (2 * l2) Double con el per�metro del rect�ngulo
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
