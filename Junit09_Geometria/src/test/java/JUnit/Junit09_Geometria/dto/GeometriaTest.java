package JUnit.Junit09_Geometria.dto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GeometriaTest {
	
	Geometria geometria;
	
	@BeforeAll
	public static void testBeforeClass() {
		System.out.println("BeforeClass");
	}
	
	@BeforeEach
	public void before() {
		System.out.println("Before");
		geometria = new Geometria();
	}
	
	@Test
	public void testGeometInit() {
		Geometria geometria_1 = new Geometria(3);
		Geometria geometria_2 = new Geometria(3);
		assertEquals(geometria_1.getId(), geometria_2.getId());
	}
	
	@Test
	public void testGeometria() {
		Geometria geometria_9 = new Geometria(9);
		assertEquals(geometria.getId(), geometria_9.getId());
	}

	@Test
	public void testAreaCuadrado() {
		int resultado = geometria.areacuadrado(4);
		int esperado = 16;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaCirculo() {
		double resultado = geometria.areaCirculo(5);
		final double PI=3.1416;
		double esperado = 25*PI;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaTriangulo() {
		int resultado = geometria.areatriangulo(2,4);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaRectangulo() {
		int resultado = geometria.arearectangulo(5,4);
		int esperado = 20;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaPenatgono() {
		int resultado = geometria.areapentagono(8,7);
		int esperado = 28;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaRombo() {
		int resultado = geometria.arearombo(6,6);
		int esperado = 18;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaRomboide() {
		int resultado = geometria.arearomboide(7,7);
		int esperado = 49;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAreaTrapecio() {
		int resultado = geometria.areatrapecio(5,5,3);
		int esperado = 15;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testFigura() {
		
		assertEquals("cuadrado", geometria.figura(1));
		assertEquals("Circulo", geometria.figura(2));
		assertEquals("Triangulo", geometria.figura(3));
		assertEquals("Rectangulo", geometria.figura(4));
		assertEquals("Pentagono", geometria.figura(5));
		assertEquals("Rombo", geometria.figura(6));
		assertEquals("Romboide", geometria.figura(7));
		assertEquals("Trapecio", geometria.figura(8));
		assertEquals("Default", geometria.figura(0));
		
	}
	
	@Test
	public void testSetId() {
		geometria.setId(25);
		int esperado = 25;
		assertEquals(esperado, geometria.getId());
	}
	
	@Test
	public void testGetNom() {
		assertEquals("Default", geometria.getNom());
	}
	
	@Test
	public void testSetNom() {
		geometria.setNom("Marc");
		assertEquals("Marc", geometria.getNom());
	}
	
	@Test
	public void testGetArea() {
		assertEquals(0.0, geometria.getArea());
	}
	
	@Test
	public void testSetArea() {
		geometria.setArea(20.0);
		assertEquals(20.0, geometria.getArea());
	}
	
	@Test
	public void testToString() {
		geometria.setId(25);
		geometria.setNom("Jose");
		geometria.setArea(20.0);
		assertEquals(geometria.toString(), "Geometria [id=25, nom=Jose, area=20.0]");
	}
	
	@AfterEach
	public void after() {
		System.out.println("after()");
		geometria = null;
	}
	
	@AfterAll
	public static void testAfterClass() {
		System.out.println("AfterClass");
	}
		
		
}
