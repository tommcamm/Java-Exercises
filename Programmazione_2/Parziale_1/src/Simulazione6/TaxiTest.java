package Simulazione6;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaxiTest {

	@Test
	public void testCostruttore1() {
		Corsa c1 = new Corsa("Via Pirelli");
		assertEquals(0, c1.calcolaTariffa(), 0.05);
		assertEquals("Via Pirelli", c1.getDestinazione());
		assertEquals(0.5, c1.getCostoKm(), 0.05);
	}

	@Test
	public void testCostruttore2() {
		Corsa c1 = new Corsa("Via Pirelli", 1.2);
		assertEquals(0, c1.calcolaTariffa(), 0.01);
		assertEquals("Via Pirelli", c1.getDestinazione());
		assertEquals(1.2, c1.getCostoKm(), 0.01);
	}
	
	//KmPercorsi
	@Test
	public void testKmPercorsi1() {
		Corsa c1 = new Corsa("Via Pirelli", 1.2);
		c1.aggiungiKm(-1);
		assertEquals(0, c1.getKmPercorsi(), 0.01);
	}

	//calcolaTariffa
	@Test
	public void testCalcolaTariffa1() {
		Corsa c1 = new Corsa("Via Pirelli", 1.2);
		c1.aggiungiKm(10);
		double costo = c1.calcolaTariffa();
		assertEquals(12.0, costo, 0.01);
	}

	//calcolaTariffa
	@Test
	public void testCalcolaTariffa2() {
		Corsa c1 = new Corsa("Via Pirelli", 1.2);
		assertEquals(10, c1.calcolaTariffa(10), 0.01); //solo supplemento

		c1.aggiungiKm(10);
		assertEquals(22, c1.calcolaTariffa(10), 0.05); //12 per km percorsi + 10 supplemento
	}

	//************* TAXI

	@Test
	public void testNuovaCorsa() {
		Taxi t = new Taxi();
		assertEquals(0, t.getTotaleCorseEffettuate());
		//destinazione deve essere diversa da null e diversa dalla stringa vuota. Inoltre non devono esserci corse già in atto.
		assertTrue(t.isLibero());
		assertFalse(t.nuovaCorsa(null));
		assertTrue(t.isLibero());
		assertFalse(t.nuovaCorsa(""));
		assertTrue(t.isLibero());
		assertTrue(t.nuovaCorsa("Via Pirelli"));
		assertFalse(t.isLibero());
		assertFalse(t.nuovaCorsa("Via Plana"));
		assertFalse(t.isLibero());
	}

	@Test
	public void testTerminaCorsa1() {
		Taxi t = new Taxi();
		t.nuovaCorsa("Via Pirelli");		
		assertEquals(0, t.getTotaleCorseEffettuate());
		t.terminaCorsa(10);
		assertEquals(1, t.getTotaleCorseEffettuate());
	}

	@Test
	public void testTrovaCorsa() {
		Taxi t = new Taxi();
		Corsa c1 = t.trovaCorsaConCostoMaggiore("Via Pirelli");
		assertNull(c1);
		t.nuovaCorsa("Via Pirelli");		
		t.terminaCorsa(10);
		Corsa c2 = t.trovaCorsaConCostoMaggiore("Via Pirelli");
		assertEquals(5, c2.calcolaTariffa(), 0.1);
	}

	@Test
	public void testMaxCorse() {
		Taxi t = new Taxi();
		//il numero di corse deve essere inferiore a 5
		t.nuovaCorsa("Via Pirelli");
		t.terminaCorsa(10);
		assertEquals(1, t.getTotaleCorseEffettuate());
		t.nuovaCorsa("Viale Sarca");
		t.terminaCorsa(10);
		assertEquals(2, t.getTotaleCorseEffettuate());
		t.nuovaCorsa("Viale Monza");
		t.terminaCorsa(10);
		assertEquals(3, t.getTotaleCorseEffettuate());
		t.nuovaCorsa("Viale Zara");
		t.terminaCorsa(10);
		assertEquals(4, t.getTotaleCorseEffettuate());
		t.nuovaCorsa("Viala Fulvio Testi");
		t.terminaCorsa(10);
		assertEquals(5, t.getTotaleCorseEffettuate());
		assertFalse(t.nuovaCorsa("Via Innovazione"));		
		assertEquals(5, t.getTotaleCorseEffettuate());
	}

	@Test
	public void trovaCorsaConCostoMaggiore() {
		Taxi t = new Taxi();
		t.nuovaCorsa("Via Pirelli");
		t.terminaCorsa(10); //costo 5
		t.nuovaCorsa("Viale Sarca");
		t.terminaCorsa(20); //costo 10
		t.nuovaCorsa("Via Pirelli");
		t.terminaCorsa(30); //costo 15

		//ne esiste una sola uguale 
		Corsa trovata = t.trovaCorsaConCostoMaggiore(new String("Viale Sarca"));
		assertEquals(10, trovata.calcolaTariffa(), 0.01);
		assertEquals("Viale Sarca", trovata.getDestinazione());
		
		//due sono uguali e quella più cara e' la seconda
		trovata = t.trovaCorsaConCostoMaggiore(new String("Via Pirelli"));
		assertEquals(15, trovata.calcolaTariffa(), 0.01);
		assertEquals("Via Pirelli", trovata.getDestinazione());

		//non ne esiste una uguale
		trovata = t.trovaCorsaConCostoMaggiore(new String("Via Innovazione"));
		assertNull(trovata);		
	}
}
