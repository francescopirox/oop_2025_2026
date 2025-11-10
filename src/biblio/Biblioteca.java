package biblio;

import java.util.*;

public interface Biblioteca extends Iterable<Libro>{
    void aggiungiLibro(Libro l);
    void rimuoviLibro(String titolo);
    List<Libro> cercaPerAutore(String cognome);
    default List<Libro> ordinaPerTitolo(){
        List<Libro> ret= new ArrayList<>();
        for(Libro l: this){
            ret.add(l);
        }
        ret.sort(Comparator.comparing(Libro::getTitolo));
        return ret;
    }
    List<Libro> ordinaPerAnno();
    default void prestaLibro(String titolo, String utente){
        for(Libro l: this){
            if(l.getTitolo().equals(titolo))
                l.presta(utente);
        }
    }
    default void restituisciLibro(String titolo){
        for(Libro l: this){
            if(l.getTitolo().equals(titolo))
                l.restituisci();
        }
    }

}
