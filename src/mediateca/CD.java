package mediateca;

import java.util.Objects;

public class CD implements Supporto{
    private final Titolo titolo;
    private final Anno annoEdizione;
    private final Anno annoAcquisto;
    private final Nominativo autore;
    private final Genere<CD> genere;

    public CD(Titolo titolo, Anno annoEdizione, Anno annoAcquisto, Nominativo autore, GenereCD genere) {
        this.titolo = titolo;
        this.annoEdizione = annoEdizione;
        this.annoAcquisto = annoAcquisto;
        this.autore = autore;
        this.genere = genere;
    }


    @Override
    public Titolo getTitolo() {
        return titolo;
    }

    @Override
    public Anno annoEdizione() {
        return annoEdizione;
    }

    @Override
    public Anno acquisto() {
        return annoAcquisto;
    }

    @Override
    public Nominativo getAutore() {
        return autore;
    }

    @Override
    public Genere getGenere() {
        return genere;
    }

    public String toString(){
        return getTitolo().titolo()+" "+getAutore().nome()+" "+annoEdizione().anno();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof CD cd)) return false;
        return Objects.equals(titolo, cd.titolo) && Objects.equals(annoEdizione, cd.annoEdizione) && Objects.equals(annoAcquisto, cd.annoAcquisto) && Objects.equals(autore, cd.autore) && Objects.equals(genere, cd.genere);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titolo, annoEdizione, annoAcquisto, autore, genere);
    }
}
