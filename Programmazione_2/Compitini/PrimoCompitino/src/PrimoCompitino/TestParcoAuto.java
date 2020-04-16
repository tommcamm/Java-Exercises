package PrimoCompitino;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestParcoAuto {

    @Test
    public void testDatiAuto() {
        Auto datiAuto = new Auto("AA000BB");
        assertEquals(0, datiAuto.getKmPercorsi());
        assertEquals("AA000BB", datiAuto.getTarga());
    }

    @Test
    public void testDatiAutoBis() {
        Auto datiAuto = new Auto("AA000CC", 100);
        assertEquals(100, datiAuto.getKmPercorsi());
        assertEquals("AA000CC", datiAuto.getTarga());
    }

    @Test
    public void testDatiAutoAggiornaKm() {
        Auto datiAuto = new Auto("AA000BB");
        assertFalse(datiAuto.aggiornaKm(-1));
        assertEquals(0, datiAuto.getKmPercorsi());
        assertTrue(datiAuto.aggiornaKm(100));
        assertEquals(100, datiAuto.getKmPercorsi());
        assertTrue(datiAuto.aggiornaKm(150));
        assertEquals(250, datiAuto.getKmPercorsi());
    }

    @Test
    public void testDatiAutoEquals()   {
        Auto datiAuto1 = new Auto("AA000BB");
        Auto datiAuto2 = new Auto("AA000BB", 1);
        Auto datiAuto3 = new Auto(new String("AA000BB"), 1);
        Auto datiAuto4 = new Auto("AA000CC", 1);
        assertFalse(datiAuto1.equals(null));
        assertTrue(datiAuto1.equals(datiAuto2));
        assertTrue(datiAuto2.equals(datiAuto3));
        assertFalse(datiAuto2.equals(datiAuto4));
    }

    @Test
    public void testParcoAutoInserisci() {
        ParcoAuto parcoAuto = new ParcoAuto(2);
        assertFalse(parcoAuto.inserisciNuovaAuto(null));
        assertTrue(parcoAuto.inserisciNuovaAuto("AA000BB"));
        assertFalse(parcoAuto.inserisciNuovaAuto("AA000BB"));
        assertFalse(parcoAuto.inserisciNuovaAuto(new String("AA000BB")));
        assertTrue(parcoAuto.inserisciNuovaAuto("AA000CC"));
        assertFalse(parcoAuto.inserisciNuovaAuto("AA000DD"));
    }

    @Test
    public void testParcoAutoTrova() {
        ParcoAuto parcoAuto = new ParcoAuto(2);
        assertNull(parcoAuto.trovaAuto(new Auto("AA000BB")));
        parcoAuto.inserisciNuovaAuto("AA000BB");
        Auto datiAuto = parcoAuto.trovaAuto(new Auto("AA000BB"));
        assertNotNull(datiAuto);
        assertEquals("AA000BB", datiAuto.getTarga());
        assertEquals(0, datiAuto.getKmPercorsi());
    }

    @Test
    public void testParcoAutoRientro() {
        ParcoAuto parcoAuto = new ParcoAuto(10);
        parcoAuto.inserisciNuovaAuto("AA000BB");

        assertFalse(parcoAuto.rientroAuto(null));

        Auto datiAutoInRientro1 = new Auto("AA000BB", 3000);
        assertTrue(parcoAuto.rientroAuto(datiAutoInRientro1));
        Auto datiAuto = parcoAuto.trovaAuto(new Auto("AA000BB"));
        assertEquals(3000, datiAuto.getKmPercorsi());

        assertTrue(datiAuto != datiAutoInRientro1);

        Auto datiAutoInRientro2 = new Auto("AA000BB", 3500);
        assertTrue(parcoAuto.rientroAuto(datiAutoInRientro2));
        datiAuto = parcoAuto.trovaAuto(new Auto("AA000BB"));
        assertEquals(3500, datiAuto.getKmPercorsi());
    }

    @Test
    public void testParcoAutoRientroBis() {
        ParcoAuto parcoAuto = new ParcoAuto(10);
        parcoAuto.inserisciNuovaAuto("AA000BB");

        assertTrue(parcoAuto.rientroAuto("AA000BB", 3000));
        Auto datiAuto = parcoAuto.trovaAuto(new Auto("AA000BB"));
        assertEquals(3000, datiAuto.getKmPercorsi());

        assertFalse(parcoAuto.rientroAuto("AA000BB", 2999));
        assertTrue(parcoAuto.rientroAuto("AA000BB", 3001));

        assertFalse(parcoAuto.rientroAuto("AA000CC", 3000));
    }
}