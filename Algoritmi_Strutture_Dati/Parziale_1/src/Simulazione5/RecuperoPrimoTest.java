package Simulazione5;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecuperoPrimoTest {

	// Test su Multa
	// Creazione
	@Test
	public void testMultaCreazione() {
		Multa m1 = new Multa("MI123456", 100);
		assertEquals(100, m1.getImporto());
		assertEquals("MI123456", m1.getNumeroVerbale());
		assertFalse(m1.isPagata());
	}

	// Paga
	@Test
	public void testMultaPAga() {
		Multa m1 = new Multa("MI123456", 100);
		assertFalse(m1.isPagata());
		m1.paga();
		assertTrue(m1.isPagata());
	}

	// Equals
	@Test
	public void testMultaEquals() {
		Multa m1 = new Multa("MI123456", 100);
		Multa m2 = new Multa("MI123457", 100);
		Multa m3 = new Multa("MI123456", 100);
		Multa m4 = new Multa(new String("MI123456"), 100);
		Multa m5 = new Multa("mi123456", 100);
		Multa m6 = new Multa("mi123456", 50);

		assertFalse(m1.equals(null));
		assertTrue(m1.equals(m1));
		assertFalse(m1.equals(m2));
		assertTrue(m1.equals(m3));
		assertTrue(m1.equals(m4));
		assertTrue(m1.equals(m5));
		assertTrue(m5.equals(m6));
	}

	// Test su Polizia Municipale
	// Test aggiungiMulta con oggetto
	@Test
	public void testPoliziaMunicipaleAggiungiOggetto() {
		// aggiungo oggetto
		PoliziaMunicipale polizia = new PoliziaMunicipale("Milano", 1000);
		Multa m1 = new Multa("MI123456", 100);
		assertTrue(polizia.aggiungiMulta(m1));
		// aggiungo null
		assertFalse(polizia.aggiungiMulta(null));
		// aggiungo oggetto uguale
		Multa m2 = new Multa("MI123456", 50);
		assertFalse(polizia.aggiungiMulta(m2));
	}

	// Test aggiungiMulta con valori
	@Test
	public void testPoliziaMunicipaleAggiungiValori() {
		// aggiungo oggetto
		PoliziaMunicipale polizia = new PoliziaMunicipale("Milano", 1000);
		assertTrue(polizia.aggiungiMulta("MI123456", 100));
		// aggiungo valori non validi
		assertFalse(polizia.aggiungiMulta("MI123456", -1));
		assertFalse(polizia.aggiungiMulta(null, 100));
		assertFalse(polizia.aggiungiMulta("", 100));
		assertFalse(polizia.aggiungiMulta(null, -1));
		assertFalse(polizia.aggiungiMulta("", -1));
		// aggiungo oggetto uguale
		assertFalse(polizia.aggiungiMulta("MI123456", 50));
	}

	// Test multaInserita
	@Test
	public void testPoliziaMunicipaleMultaInserita() {
		// aggiungo oggetto
		PoliziaMunicipale polizia = new PoliziaMunicipale("Milano", 1000);
		assertTrue(polizia.aggiungiMulta(new Multa("MI123456", 100)));

		assertTrue(polizia.multaInserita(new Multa("MI123456", 100)));
		assertTrue(polizia.multaInserita(new Multa("MI123456", 50)));
		assertTrue(polizia.multaInserita(new Multa(new String("MI123456"), 100)));
		assertFalse(polizia.multaInserita(null));
	}

	// Test rimuoviMulta
	@Test
	public void testPoliziaMunicipaleRimuovi() {
		PoliziaMunicipale polizia = new PoliziaMunicipale("Milano", 100);
		Multa m1 = new Multa("MI123456", 100);
		Multa m2 = new Multa("MI123457", 50);
		Multa m3 = new Multa("MI123458", 100);
		assertTrue(polizia.aggiungiMulta(m1));
		assertTrue(polizia.aggiungiMulta(m2));
		assertTrue(polizia.aggiungiMulta(m3));

		assertEquals(m2, polizia.rimuoviMulta(m2));

		assertTrue(polizia.aggiungiMulta(m2));
		assertEquals(m2, polizia.rimuoviMulta(new Multa("MI123457", 50)));

		assertNull(polizia.rimuoviMulta(null));

		assertTrue(polizia.aggiungiMulta(m2));
		assertTrue(m2 == polizia.rimuoviMulta(new Multa("MI123457", 50)));
	}

	// Test rimuoviMulta
	@Test
	public void testPoliziaMunicipaleFatturato() {
		PoliziaMunicipale polizia = new PoliziaMunicipale("Milano", 100);
		Multa m1 = new Multa("MI123456", 100);
		Multa m2 = new Multa("MI123457", 50);
		Multa m3 = new Multa("MI123458", 100);
		assertTrue(polizia.aggiungiMulta(m1));
		assertTrue(polizia.aggiungiMulta(m2));
		assertTrue(polizia.aggiungiMulta(m3));
		assertEquals(0, polizia.fatturato());
	}
}
