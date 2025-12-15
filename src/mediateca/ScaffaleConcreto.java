package mediateca;

import java.util.*;

public class ScaffaleConcreto<S extends Supporto> implements Scaffale<S>{
    private final int dimensioniMensola;
    private final List<S> scaffaleList = new LinkedList<S>();
    private final Genere<S> genere;
    private final int dimensioniScaffale;
    public ScaffaleConcreto(int dimensioneScaffale, int dimensioneMensola, Genere genere) {
        this.genere=genere;
        if(dimensioneMensola<0 || dimensioneScaffale <0)
            throw new IllegalArgumentException();
        this.dimensioniScaffale=dimensioneScaffale;
        this.dimensioniMensola=dimensioneMensola;
    }

    @Override
    public void add(S item) {
        if(this.scaffaleList.size()+1>dimensioniScaffale)
            throw new RuntimeException("No Space left on the shelf");

        if(!item.getGenere().equals(genere))
            throw new IllegalArgumentException();
        scaffaleList.add(item);
        Collections.sort(scaffaleList);
    }

    @Override
    public boolean remove(S item) {
        return scaffaleList.remove(item);
    }

    @Override
    public List<S> mensola(int index) {

        int indiceIniziale=index*dimensioniMensola;
        int indiceFinale=(index+1)*dimensioniMensola;
        List<S> lista= new LinkedList<>();
        for(int i=indiceIniziale; i<indiceFinale; i++){
        lista.add(scaffaleList.get(i));//if index in range
        }
        return lista;
        //return scaffaleList.subList(indiceIniziale,indiceFinale);
        //asssumo che esista metodo subList che ....
    }



    @Override
    public Iterator<S> iterator() {
        return scaffaleList.iterator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ScaffaleConcreto<?> that)) return false;
        return dimensioniMensola == that.dimensioniMensola && dimensioniScaffale == that.dimensioniScaffale && Objects.equals(scaffaleList, that.scaffaleList) && Objects.equals(genere, that.genere);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimensioniMensola, scaffaleList, genere, dimensioniScaffale);
    }

    @Override
    public String toString() {
        return "ScaffaleConcreto{" +
                "dimensioniMensola=" + dimensioniMensola +
                ", scaffaleList=" + scaffaleList +
                ", genere=" + genere +
                ", dimensioniScaffale=" + dimensioniScaffale +
                '}';
    }
}
