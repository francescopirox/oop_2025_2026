package biblio;

public class LibroConGenere extends LibroConcreto{
    private Genere genere;

    public LibroConGenere(String titolo, Autore autore, int annoDiPubblicazione, boolean isDisponibile, Genere genere) {
        super(titolo, autore, annoDiPubblicazione, isDisponibile);
        this.genere=genere;
    }

    public Genere getGenere() {
        return genere;
    }
}
