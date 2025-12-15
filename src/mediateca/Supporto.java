package mediateca;

public interface Supporto extends Comparable<Supporto>{
    Titolo getTitolo();
    Anno annoEdizione();
    Anno acquisto();
    Nominativo getAutore();
    Genere getGenere();

    @Override
   default int compareTo(Supporto o){
       return getAutore().nome().compareTo(o.getAutore().nome());
    }

}
