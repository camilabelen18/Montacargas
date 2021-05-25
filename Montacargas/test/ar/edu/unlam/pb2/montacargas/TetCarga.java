package ar.edu.unlam.pb2.montacargas;

import static org.junit.Assert.*;

import org.junit.Test;

public class TetCarga {

	@Test
	public void testQueSePuedaCrearUnaCarga() {
		Integer peso = 200;
		Carga carga = new Carga(peso);	
		
		assertNotNull(carga);
	}
	
	@Test
	public void testQueSePuedaVerificarElValorDelPeso() {
		Integer peso = 200;
		Integer valorEsperado = 200;
		Carga carga = new Carga(peso);	
		Integer valorObtenido = carga.getPeso();
		
		assertEquals(valorEsperado,valorObtenido);
	}

}
