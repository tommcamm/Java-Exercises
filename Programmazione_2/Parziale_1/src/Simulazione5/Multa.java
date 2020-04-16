package Simulazione5;

import java.util.Objects;

public class Multa {
    private String numeroVerbale;
    private int importo;
    private boolean pagata;

    public Multa(String numeroVerbale, int importo) {
        this.numeroVerbale = numeroVerbale;
        this.importo = importo;
        this.pagata = false;
    }

    public void paga(){
        this.pagata = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Multa multa = (Multa) o;
        return numeroVerbale.equalsIgnoreCase(multa.numeroVerbale);
    }

    @Override
    public String toString() {
        return "Multa{" +
                "numeroVerbale='" + numeroVerbale + '\'' +
                ", importo=" + importo +
                ", pagata=" + pagata +
                '}';
    }

    public String getNumeroVerbale() {
        return numeroVerbale;
    }

    public int getImporto() {
        return importo;
    }

    public boolean isPagata() {
        return pagata;
    }
}
