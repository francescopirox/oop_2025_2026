package Palestra;

import java.util.Objects;

public class Orario {
    private String giorno;
    private int orario;
    private String minuti;

    public Orario(String giorno, int orario, String minuti) {
        if(!(giorno.toUpperCase().equals("LUN") ||
                giorno.toUpperCase().equals("MAR") ))
            throw new IllegalArgumentException("Giorno non valido");
        if(orario < 0 || orario> 24)
            throw new IllegalArgumentException("Orario non valido");
        this.giorno = giorno;
        this.orario = orario;
        this.minuti = minuti;
    }

    @Override
    public String toString() {
        return "Orario{" +
                "giorno='" + giorno + '\'' +
                ", orario=" + orario +
                ", minuti='" + minuti + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Orario orario1)) return false;
        return orario == orario1.orario && Objects.equals(giorno, orario1.giorno) && Objects.equals(minuti, orario1.minuti);
    }

    @Override
    public int hashCode() {
        return Objects.hash(giorno, orario, minuti);
    }
}
