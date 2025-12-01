package magazzino;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Magazzino implements Iterable<Materiale>{
    private List<Materiale> lista= new LinkedList<>();


    public void addMateriale(Materiale m){
        if(m!=null)
            lista.add(m);
    }

    public void removeMateriale(int index){
        if(index>=0) {
            lista.remove(index);
        }
    }

    public Iterator<Materiale> iterator(){
        return lista.iterator();
    }

}
