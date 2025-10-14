package Palestra;

import java.util.Objects;

public abstract class AbstractCorso extends Object implements Corso{

    @Override
    public String toString() {
        return this.nome()+" "+this.capacitàMassima()+" "+this.Intensita();
    }

    public boolean equals(Object o){
        if(o == null) return false;
        if(o==this) return true;
        if(!(o instanceof AbstractCorso that)) return false;
        return this.codice().equals(that.codice());
    }

    public int hashCode(){
        return codice().hashCode();

    }

}
