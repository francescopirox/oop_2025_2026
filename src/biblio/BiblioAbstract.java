package biblio;

import java.util.*;

public abstract class BiblioAbstract implements Biblioteca{


    @Override
    public String toString() {
        String ret="Biblioteca:";
        List<Libro> lista =this.ordinaPerTitolo();
       for(Libro l: lista ){
           ret += l.toString();
           ret += "\n";
       }

       return ret;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(obj == this)
            return true;
        if(! (obj instanceof BiblioAbstract biblioAbstract))
            return false;
        return biblioAbstract.ordinaPerTitolo().equals(this.ordinaPerTitolo());
    }

    @Override
    public int hashCode(){
        return this.ordinaPerTitolo().hashCode();
    }
}
