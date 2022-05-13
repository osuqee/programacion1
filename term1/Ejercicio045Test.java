package primera;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Ejercicio045Test {

	@Test
	public void testSuma() {
		int resultado = Ejercicio045.suma(2, 3);
		int esperado = 5;
		assertEquals(esperado, resultado);
	}
}
