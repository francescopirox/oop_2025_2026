package ospedale;

public abstract class RepartoAbstract implements Reparto{


    @Override
    public String toString() {
        return "Reparto" + this.nome() + " "+ this.codice();
    }

    @Override
    public boolean equals(Object o) {
        if(o==this)
            return true;
        if(o == null)
            return false;
        if(!(o instanceof RepartoAbstract reparto))
            return false;
        return reparto.codice().equals(this.codice());
    }

    @Override
    public int hashCode() {
        return this.codice().hashCode();
    }

    public RepartoAbstract() {
    }
}
