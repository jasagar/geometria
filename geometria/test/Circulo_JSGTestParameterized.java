import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Circulo_JSGTestParameterized {
	private double radio;
	private String figura;
	private double area;
	private double perimetro;

	public Circulo_JSGTestParameterized (double rad, String fig, double are, double per) {
		radio = rad;
		figura = fig;
		area = are;
		perimetro = per;
	}
	
	@Parameters
	public static Collection<Object[]> valores(){
		return Arrays.asList(new Object[][] {{7.0, "círculo", 153.9384, 43.9824},{0.0, "círculo", 0, 0},{-3.0, "círculo", 28.2744, 18.8496}});		
	}

	@Test
	public void testArea() {
		double res;
		res = area;
		
		Circulo_JSG nuevoCirculo = new Circulo_JSG(radio, figura);
		double result = nuevoCirculo.area();
		
		assertEquals(res, result, 2);
	}

	@Test
	public void testPerimetro() {
		double res;
		res = perimetro;
		
		Circulo_JSG nuevoCirculo = new Circulo_JSG(radio, figura);
		double result = nuevoCirculo.perimetro();
		
		assertEquals(res, result, 2);
	}
}
