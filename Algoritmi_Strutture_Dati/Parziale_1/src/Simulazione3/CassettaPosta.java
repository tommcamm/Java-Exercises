package Simulazione3;

import java.util.Objects;

public class CassettaPosta {
    private int numeroLettere;
    private final int numeroLettereMax;
    private final String nome;

    public CassettaPosta(String nome, int numeroLettereMax) {
        this.numeroLettereMax = numeroLettereMax;
        this.nome = nome;
    }

    public CassettaPosta(String nome) {
        this.numeroLettereMax = 5;
        this.nome = nome;
    }

    public boolean inserisciLettera() {
        if (numeroLettere >= numeroLettereMax) return false;
        numeroLettere++;
        return true;
    }

    public int prelevaPosta() {
        int lettere = numeroLettere;
        numeroLettere = 0;
        return lettere;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CassettaPosta that = (CassettaPosta) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public String toString() {
        return "CassettaPosta{" +
                "numeroLettere=" + numeroLettere +
                ", numeroLettereMax=" + numeroLettereMax +
                ", nome='" + nome + '\'' +
                '}';
    }
}
