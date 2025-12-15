package mediateca;

import java.util.Objects;

public abstract class SupportoAstratto implements Supporto{
    private final Titolo titolo;
    private final Anno annoEdizione;
    private final Anno annoAcquisto;
    private final Nominativo autore;

    public SupportoAstratto(Titolo titolo, Anno annoEdizione, Anno annoAcquisto, Nominativo autore) {
        this.titolo = titolo;
        this.annoEdizione = annoEdizione;
        this.annoAcquisto = annoAcquisto;
        this.autore = autore;
    }



    @Override
    public boolean equals(Object o) {
        if (!(o instanceof SupportoAstratto that)) return false;
        return Objects.equals(titolo, that.titolo) && Objects.equals(annoEdizione, that.annoEdizione) && Objects.equals(annoAcquisto, that.annoAcquisto) && Objects.equals(autore, that.autore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titolo, annoEdizione, annoAcquisto, autore);
    }

    @Override
    public String toString() {
        return "SupportoAstratto{" +
                "titolo=" + titolo +
                ", annoEdizione=" + annoEdizione +
                ", annoAcquisto=" + annoAcquisto +
                ", autore=" + autore +
                '}';
    }

    @Override
    public Titolo getTitolo() {
        return this.titolo;
    }

    @Override
    public Anno annoEdizione() {
        return this.annoEdizione;
    }

    @Override
    public Anno acquisto() {
        return this.annoAcquisto;
    }

    @Override
    public Nominativo getAutore() {
        return this.autore;
    }

}
