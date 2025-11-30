package ospedale;

import java.util.Iterator;
import java.util.NoSuchElementException;

public interface Ospedale extends Iterable<Reparto>{
    void aggiungiReparto(Reparto r);
    default boolean rimuoviReparto(Reparto r) {
        Iterator<Reparto> it = this.iterator();
        while(it.hasNext()){
            if(it.next().equals(r)    ){
                it.remove();
                return true;
            }
            return false;
        }
        return false;
    }



    //return false;

    default Reparto getReparto(int index){
        if(index <0)
            throw new IllegalArgumentException();
        int i=0;
        for(Reparto r: this) {
            if (i == index)
                return r;
            i++;
        }
        throw new NoSuchElementException();
    }
    default double calcolarappMediciPz(){
        int med=0;
        int pz=0;
        for(Reparto r: this){
            med += r.medici();
            pz += r.capacita().capacita();}
        return med/pz;
    }
    default boolean controlloGenerale(){
        return false;
    }

}
