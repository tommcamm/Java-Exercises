package Simulazione2;

import java.util.Objects;

public class Brano {
    private final String titolo;
    private final int durataInSecondi;

    public Brano(String titolo, int durataInSecondi) {
        this.titolo = titolo;
        this.durataInSecondi = durataInSecondi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brano brano = (Brano) o;
        return Objects.equals(titolo, brano.titolo);
    }

    @Override
    public String toString() {
        return "Brano{" +
                "titolo='" + titolo + '\'' +
                ", durataInSecondi=" + durataInSecondi +
                '}';
    }

    public String getTitolo() {
        return titolo;
    }

    public int getDurataInSecondi() {
        return durataInSecondi;
    }
}
