package biblio;

import java.util.Objects;

public class LibroConcreto implements Libro{
    private String Titolo;
    private Autore Autore;
    private int AnnoDiPubblicazione;
    private boolean isDisponibile;
    private String prestatoA=null;

    public LibroConcreto(String titolo, Autore autore, int annoDiPubblicazione, boolean isDisponibile) {
        if(titolo==null || autore==null || annoDiPubblicazione<1700)
            throw new IllegalArgumentException("Libro non valido");
        Titolo = titolo.toLowerCase().trim();
        Autore = autore;
        AnnoDiPubblicazione = annoDiPubblicazione;
        this.isDisponibile = isDisponibile;
    }

    @Override
    public String getTitolo() {
        return Titolo;
    }

    @Override
    public Autore getAutore() {
        return Autore;
    }

    @Override
    public int getAnnoPubblicazione() {
        return AnnoDiPubblicazione;
    }

    @Override
    public boolean isDisponibile() {
        return isDisponibile;
    }

    @Override
    public void presta(String utente) {
        if(utente == null || ! isDisponibile)
            throw new IllegalArgumentException("");
        isDisponibile = false;
        prestatoA=utente;
    }

    @Override
    public void restituisci() {
        if(isDisponibile)
            throw new IllegalArgumentException("");
        isDisponibile=true;
        prestatoA= null;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof LibroConcreto that)) return false;
        return AnnoDiPubblicazione == that.AnnoDiPubblicazione &&
                Objects.equals(Titolo, that.Titolo) &&
                Objects.equals(Autore, that.Autore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Titolo, Autore, AnnoDiPubblicazione);
    }
}
