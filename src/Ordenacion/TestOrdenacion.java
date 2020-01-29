package Ordenacion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestOrdenacion {

    Ordenacion ordenacion = new Ordenacion();

    //////////////////////////////////////////////////////////
    
    /**
     * Test ordenar 3 números iguales
     */
  
	@Test
	void test1() {
		String resultado = Ordenacion.ordenar3(8,8,8);
		String esperado = "8, 8, 8";
		assertEquals(resultado, esperado);
	}
	
//////////////////////////////////////////////////////////
	
	/**
	 * Test ordenar 2 números iguales
	 */
//////////////////////////////////////////////////////////
	
	/**
	 * TESTS ORDENAR CUANDO num1 = num2
	 */
	
	// Test que ordena cuando num1 = num2 Y num2 > num3
	@Test
	void test2() {
		String resultado = Ordenacion.ordenar3(8,8,2);
		String esperado = "8, 8, 2";
		assertEquals(resultado, esperado);
	}
	
	// Test que ordena cuando num1 = num2 Y num2 < num3
	@Test
	void test3() {
		String resultado = Ordenacion.ordenar3(8,8,12);
		String esperado = "12, 8, 8";
		assertEquals(resultado, esperado);
	}
	
	//////////////////////////////////////////////////////////
	
	/**
	 *  TESTS ORDENAR CUANDO num1 = num3
	 */
	
	// Test que ordena cuando num1 = num3 Y num1 > num2
	@Test
	void test4() {
		String resultado = Ordenacion.ordenar3(8,2,8);
		String esperado = "8, 8, 2";
		assertEquals(resultado, esperado);
	}
	
	// Test que ordena cuando num1 = num3 Y num1 < num2
	@Test
	void test5() {
		String resultado = Ordenacion.ordenar3(8,12,8);
		String esperado = "12, 8, 8";
		assertEquals(resultado, esperado);
	}
	
	///////////////////////////////////////////////////////////
	
	/**
	 *  TESTS ORDENAR CUANDO num2 = num3
	 */
	
	// Test que ordena cuando num2=num3 Y num2>num1
	@Test
	void test6() {
		String resultado = Ordenacion.ordenar3(2,8,8);
		String esperado = "8, 8, 2";
        assertEquals(resultado, esperado);;

	}
	
	// Test que ordena cuando num2=num3 Y num2<num1
	@Test
	void test7() {
		String resultado = Ordenacion.ordenar3(12,8,8);
		String esperado = "12, 8, 8";
        assertEquals(resultado, esperado);

	}
	
	///////////////////////////////////////////////////////////
	
	/**
	 * Test ordenar 3 números diferentes
	 */
	
	// Test que ordena cuando num1>num2 Y num2>num3
	@Test
	void test8() {
		String resultado = Ordenacion.ordenar3(1,4,8);
		String esperado = "8, 4, 1";
        assertEquals(resultado, esperado);
	}
	
	// Test que ordena cuando num1<num2 Y num2>num3 Y num1>num3
	@Test
	void test9() {
		String resultado = Ordenacion.ordenar3(1,8,4);
		String esperado = "8, 4, 1";
        assertEquals(resultado, esperado);
	}
	
	// Test que ordena cuando num1<num2 Y num1<num3 Y num1<num3
	@Test
	void test10() {
		String resultado = Ordenacion.ordenar3(4,1,8);
		System.out.println();
		String esperado = "8, 4, 1";
        assertEquals(resultado, esperado);
	}
	
	// Test que ordena cuando num1<num2 Y num2>num3 Y num1<num3
	@Test
	void test11() {
		String resultado = Ordenacion.ordenar3(4,8,1);
		String esperado = "8, 4, 1";
        assertEquals(resultado, esperado);
	}
	
	// Test que ordena cuando num3>num2 Y num2>num1
	@Test
	void test12() {
		String resultado = Ordenacion.ordenar3(8,4,1);
		String esperado = "8, 4, 1";
        assertEquals(resultado, esperado);
	}
	
	// Test que ordena cuando num1>num2 Y num2<num3 Y num1>num3
	@Test
	void test13() {
		String resultado = Ordenacion.ordenar3(8,1,4);
		String esperado = "8, 4, 1";
        assertEquals(resultado, esperado);
	}

}
