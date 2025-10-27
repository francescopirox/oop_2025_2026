import java.util.Objects;

public class Persona implements Comparable<Persona>{
    private String nome;
    private String cognome;

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Persona persona)) return false;
        return Objects.equals(nome, persona.nome) && Objects.equals(cognome, persona.cognome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cognome);
    }

    @Override
    public int compareTo(Persona o) {
        String nomeCompleto=nome+cognome;
        String altroNomeCompleto=o.nome+o.cognome;
        return nomeCompleto.compareTo(altroNomeCompleto);
    }
}
