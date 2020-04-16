package Simulazione3;

public class Casellario {
    private final CassettaPosta[] cassette;

    public Casellario(int numeroCassette) {
        cassette = new CassettaPosta[numeroCassette];
    }

    public boolean isPresente(CassettaPosta cassetta) {
        for (int i = 0; i < cassette.length; i++) {
            if (cassetta.equals(cassette[i])) return true;
        }
        return false;
    }

    public boolean aggiungiCassettaPosta(CassettaPosta cassetta) {
        if (cassetta == null) return false;
        if (isPresente(cassetta)) return false;
        for (int i = 0; i < cassette.length; i++) {
            if (cassette[i] == null) {
                cassette[i] = cassetta;
                return true;
            }
        }
        return false;
    }

    public boolean aggiungiCassettaPosta(String nome, int numeroLettere) {
        return aggiungiCassettaPosta(new CassettaPosta(nome, numeroLettere));
    }

    public boolean rimuovi(CassettaPosta cassetta) {
        if (cassetta == null) return false;
        for (int i = 0; i < cassette.length; i++) {
            if (cassetta.equals(cassette[i])) {
                cassette[i] = null;
                return true;
            }
        }
        return false;
    }
}
