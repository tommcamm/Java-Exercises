package Simulazione3;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestCasellario {

    // Test su CassettaPosta

    // Creazione
    @Test
    public void testCassettaPostaCreazione() {
        CassettaPosta cp1 = new CassettaPosta("Pippo", 6);
        String stato = cp1.toString();
        assertTrue(stato.contains("Pippo"));
        assertTrue(stato.contains("6"));
        assertTrue(stato.contains("0"));

        CassettaPosta cp2 = new CassettaPosta("Paperino");
        stato = cp2.toString();
        assertTrue(stato.contains("Paperino"));
        assertTrue(stato.contains("5"));
        assertTrue(stato.contains("0"));
    }

    // inserisci
    @Test
    public void testCassettaPostaInserisci() {
        CassettaPosta cp1 = new CassettaPosta("Pippo", 2);
        assertTrue(cp1.inserisciLettera());
        assertTrue(cp1.inserisciLettera());
        assertFalse(cp1.inserisciLettera());

        String stato = cp1.toString();
        assertTrue(stato.contains("Pippo"));
        assertTrue(stato.contains("2"));
        assertTrue(stato.contains("2"));

        cp1 = new CassettaPosta("Pippo", 3);
        assertTrue(cp1.inserisciLettera());
        assertTrue(cp1.inserisciLettera());

        stato = cp1.toString();
        assertTrue(stato.contains("Pippo"));
        assertTrue(stato.contains("2"));
        assertTrue(stato.contains("3"));
    }

    // rimuovi
    @Test
    public void testCassettaPostaPrelevaPosta() {
        CassettaPosta cp1 = new CassettaPosta("Pippo", 3);
        assertTrue(cp1.inserisciLettera());
        assertTrue(cp1.inserisciLettera());

        String stato = cp1.toString();
        assertTrue(stato.contains("Pippo"));
        assertTrue(stato.contains("3"));
        assertTrue(stato.contains("2"));

        assertEquals(2, cp1.prelevaPosta());

        stato = cp1.toString();
        assertTrue(stato.contains("Pippo"));
        assertTrue(stato.contains("3"));
        assertTrue(stato.contains("0"));
    }

    // Equals
    @Test
    public void testCassettaPostaEquals() {
        CassettaPosta cp1 = new CassettaPosta("Pippo", 6);
        CassettaPosta cp2 = new CassettaPosta("Paperino");
        CassettaPosta cp3 = new CassettaPosta("Pippo", 6);
        CassettaPosta cp4 = new CassettaPosta("Pippo", 6);
        CassettaPosta cp5 = new CassettaPosta("Pippo", 7);

        assertFalse(cp1.equals(cp2));
        assertTrue(cp1.equals(cp3));
        assertFalse(cp1.equals(null));
        assertTrue(cp1.equals(cp1));
        assertTrue(cp3.equals(cp4));
        assertTrue(cp1.equals(cp5));
    }

    // Test su Casellario

    // Inserimento con oggetto
    @Test
    public void testCasellarioInserisciConOggetto() {
        Casellario c1 = new Casellario(3);
        // Test no nomi ripetuti
        assertTrue(c1.aggiungiCassettaPosta(new CassettaPosta("Pippo", 6)));
        assertFalse(c1.aggiungiCassettaPosta(new CassettaPosta("Pippo", 5)));
        assertFalse(c1.aggiungiCassettaPosta(new CassettaPosta("Pippo", 5)));

        // Test riempimento
        assertTrue(c1.aggiungiCassettaPosta(new CassettaPosta("Paperino", 3)));
        assertTrue(c1.aggiungiCassettaPosta(new CassettaPosta("Stitch", 3)));
        assertFalse(c1.aggiungiCassettaPosta(new CassettaPosta("Pluto", 5)));

        // Test con null
        Casellario c2 = new Casellario(3);
        assertFalse(c2.aggiungiCassettaPosta(null));

    }

    // Inserimento con valori
    @Test
    public void testCasellarioInserisciConValori() {
        Casellario c1 = new Casellario(3);
        // Test no nomi ripetuti
        assertTrue(c1.aggiungiCassettaPosta("Pippo", 6));
        assertFalse(c1.aggiungiCassettaPosta("Pippo", 5));
        assertFalse(c1.aggiungiCassettaPosta("Pippo", 5));

        // Test riempimento
        assertTrue(c1.aggiungiCassettaPosta("Paperino", 3));
        assertTrue(c1.aggiungiCassettaPosta("Stitch", 3));
        assertFalse(c1.aggiungiCassettaPosta("Pluto", 5));

        // Test con null
        Casellario c2 = new Casellario(3);
        assertFalse(c2.aggiungiCassettaPosta(null));

    }

    // Rimuovi
    @Test
    public void testCasellarioRimuovi() {
        Casellario c1 = new Casellario(3);
        assertTrue(c1.aggiungiCassettaPosta("Pippo", 6));
        assertTrue(c1.aggiungiCassettaPosta("Paperino", 3));
        assertTrue(c1.aggiungiCassettaPosta("Stitch", 3));

        assertTrue(c1.rimuovi(new CassettaPosta("Paperino", 3)));
        assertFalse(c1.rimuovi(new CassettaPosta("Pluto", 3)));

        // verificare poi l'inserimento con buchi
        assertTrue(c1.aggiungiCassettaPosta("Paperino", 5));
    }
}
