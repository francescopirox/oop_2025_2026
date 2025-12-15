package mediateca;

public class Libro extends SupportoAstratto {
    private final Genere<Libro> genere;

    public Libro(Titolo titolo, Anno annoEdizione, Anno annoAcquisto, Nominativo autore, Genere<Libro> genere) {
        super(titolo, annoEdizione, annoAcquisto, autore);
        this.genere = genere;
    }

    @Override
    public Genere getGenere() {
        return genere;
    }
}
