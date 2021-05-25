package ar.edu.unlam.pb2.montacargas;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMontacarga {

	@Test
	public void testQueSePuedaCrearUnMontacarga() {
		Integer pesoMaximo = 100;
		Integer valorEsperado = 100;
		Montacarga montacarga = new Montacarga(pesoMaximo);
		Integer valorObtenido = montacarga.getPesoMaximo();

		
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void testQueSePuedanAgregarCargasAlMontacargas() {
		Integer pesoMaximo = 100;
		Carga carga1 = new Carga(70);	
		Carga carga2 = new Carga(60);
		
		Montacarga montacarga = new Montacarga(pesoMaximo);
		
		assertTrue(montacarga.agregarCargasAlMontacargas(carga1));
		assertTrue(montacarga.agregarCargasAlMontacargas(carga2));
	}
	
	@Test
	public void testQueSePuedaObtenerUnaCarga() {
		Integer pesoMaximo = 100;
		Carga carga1 = new Carga(10);	
		Carga carga2 = new Carga(20);
		
		Montacarga montacarga = new Montacarga(pesoMaximo);
		montacarga.agregarCargasAlMontacargas(carga1);
		montacarga.agregarCargasAlMontacargas(carga2);
		
		Carga cargaObtenida = montacarga.obtenerUnaCarga(carga2);
		
		assertEquals(cargaObtenida,carga2);
		
	}
	
	@Test
	public void testQueSePuedaDescargarTodasLasCargas() {
		Integer pesoMaximo = 100;
		Integer valorEsperado = 0;
		Carga carga1 = new Carga(10);	
		Carga carga2 = new Carga(20);
		
		Montacarga montacarga = new Montacarga(pesoMaximo);
		montacarga.agregarCargasAlMontacargas(carga1);
		montacarga.agregarCargasAlMontacargas(carga2);
	
		assertTrue(montacarga.eliminarCarga(carga1));
		assertTrue(montacarga.eliminarCarga(carga2));
		assertEquals(valorEsperado,montacarga.cantidadDeCargas());
	}
	
	@Test
	public void testQueSePuedaObtenerElPesoPromedioDeCargas() {
		Integer pesoMaximo = 100;
		Integer valorEsperado = 15;
		Carga carga1 = new Carga(10);	
		Carga carga2 = new Carga(20);
		
		Montacarga montacarga = new Montacarga(pesoMaximo);
		montacarga.agregarCargasAlMontacargas(carga1);
		montacarga.agregarCargasAlMontacargas(carga2);
	
		assertEquals(valorEsperado,montacarga.obtenerPesoPromedioDeCargas());
	}
	
}
