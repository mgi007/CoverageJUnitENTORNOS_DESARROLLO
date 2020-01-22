package PRACTICAS_JUnit_EclEmma;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubscripcionTest {

	@Test
	public void testprecioPorMes() {
	double esperado=100;
	Subscripcion s = new Subscripcion(200,2) ;
	double resultado = s.precioPorMes();
	assertEquals(esperado, resultado,0) ;
	}
	
	@Test
	public void testprecioPorMes2() {
	double esperado=67;
	Subscripcion s = new Subscripcion(200,3) ;
	double resultado= s.precioPorMes();
	assertEquals(esperado, resultado, 1) ;
	}
	
	@Test
	public void testCancel() {
		int esperado = 0;
		Subscripcion s = new Subscripcion(200,4);
		s.cancel();
		int resultado = (int) s.precioPorMes();
		assertEquals(esperado, resultado, 0);
	}
	
	@Test
	public void testPrecioPorMes3() {
		int esperado = 0;
		Subscripcion s = new Subscripcion(-5,4);
		int resultado = (int) s.precioPorMes();
		assertEquals(esperado, resultado, 0);
	}
	
}
