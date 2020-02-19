package examen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class FechaTest {
	
	Fecha fecha = new Fecha();

	@Test
	void test1() {
		String resultado = Fecha.getFechaConFormato(1);
		String esperado = "2020/02";
		assertEquals(resultado, esperado);
	}
	
	@Test
	void test2() {
		String resultado = Fecha.getFechaConFormato(2);
		String esperado = "02/2020";
		assertEquals(resultado, esperado);
	}
	
	@Test
	void test3() {
		String resultado = Fecha.getFechaConFormato(3);
		String esperado = "02/20";
		assertEquals(resultado, esperado);
	}

	@Test
	void test4() {
		String resultado = Fecha.getFechaConFormato(6);
		String esperado = "ERROR";
		assertEquals(resultado, esperado);
	}
	
}
