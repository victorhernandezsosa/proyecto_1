package victor.sosa.primer_proyecto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	@BeforeClass
	public static void configuracionInicial() {
		System.out.println("Método de tipo Setup, se ejecuta antes de cada prueba");
	}
   
	@Test
	public void testSuma1() {
		assertEquals(App.sumar(5.0, 6.0), 11.0, .0001);
	}
	
	@Test
	public void testSuma2() {
		assertTrue(App.sumar(4.5, 3.8) == 8.3);
	}
	
	@Test
	public void testSuma3() {
		assertTrue(App.sumar(0, 0) == 0);
	}
	
	@Test
	public void testSuma4() {
		assertTrue(App.sumar(-1, -1) == -2);
	}
	
	@Test
	public void testResta1() {
		assertTrue(App.restar(1.0,1.0) == 0.0);
	}
	
	@Test
	public void testResta2() {
		assertTrue(App.restar(2.0,1.0) == 1.0);
	}
	
	@Test
	public void testRestaNegativos() {
		assertTrue(App.restar(1.0,2.0) == -1.0);
	}
	
	@Test
	public void testRestaDecimales() {
		assertEquals(App.restar(2.9,2.8), 0.1, 0.0001);
	}
	
	@Test
	public void testMulti1() {
		assertEquals(App.multiplicar(3,3), 9, 0.0001);
	}
	
	@Test
	public void testMulti2() {
		assertEquals(App.multiplicar(0,3), 0, 0.0001);
	}
	
	@Test
	public void testMulti3() {
		assertEquals(App.multiplicar(4,0), 0, 0.0001);
	}
	
	@Test
	public void testMulti4() {
		assertEquals(App.multiplicar(-2,3), -6, 0.0001);
	}
	
	@Test
	public void testMulti5() {
		assertEquals(App.multiplicar(-5,-5), 25, 0.0001);
	}
	
	@Test
	public void testDivi1() {
		assertEquals(App.dividir(4,2), 2, 0.0001);
	}
	
	@Test
	public void testDivi2() {
		assertEquals(App.dividir(0.0,2.0), 0.0, 0.0001);
	}
	
	@Test
	public void testDivi3() {
		assertEquals(App.dividir(2.0,4.0), 0.5, 0.0001);
	}
	
	@Test
	public void testDivi4() {
		assertEquals(App.dividir(1.0,1.0), 1.0, 0.0001);
	}
	
	@Test
	public void testDivi5() {
		assertNull(App.dividir(5,0));
	}
	
	@AfterClass
	public static void finalizacionPruebas() {
		System.out.println("Método de tipo TearDown, se ejecuta despues de cada prueba");
	}
}

