package Palestra;

import java.util.Objects;

public class Cardio extends AbstractCorso {
    private CodiceCorso codice;
    private String nome;
    private int capacita;
    private int istruttori;
    private int durataMinuti;
    private Orario orario;
    private Intensita intensita;

    public Cardio(CodiceCorso codice, String nome, int capacita, int istruttori, int durataMinuti, Orario orario, Intensita intensita) {
        if (durataMinuti < 45 || istruttori < 2)
            throw new IllegalArgumentException("Valori sbagliati");
        this.codice = codice;
        this.nome = nome;
        this.capacita = capacita;
        this.istruttori = istruttori;
        this.durataMinuti = durataMinuti;
        this.orario = orario;
        this.intensita = intensita;
    }

    public CodiceCorso codice() {
        return codice;
    }

    public String nome() {
        return nome;
    }

    public int capacitàMassima() {
        return capacita;
    }

    public int numeroIstruttori() {
        return istruttori;
    }

    public int durataMinuti() {
        return durataMinuti;
    }

    public Orario orario() {
        return orario;
    }

    public Intensita Intensita() {
        return intensita;
    }


}