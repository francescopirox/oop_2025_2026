package biblio;

import java.util.Iterator;
import java.util.List;
import java.util.*;
public class BiblioConcreta implements Biblioteca{
    private List<Libro> catalogo= new ArrayList<Libro>();
    private HashSet<Autore> autori;

    @Override
    public void aggiungiLibro(Libro l) {
        if(l != null)
            catalogo.add(l);
    }

    @Override
    public void rimuoviLibro(String titolo) {
        for(Libro l: catalogo)
            if(l.getTitolo().equalsIgnoreCase(titolo))
                catalogo.remove(l);
    }

    @Override
    public List<Libro> cercaPerAutore(String cognome) {
        List<Libro> ret=new ArrayList<>();
        for(Libro l: catalogo)
            if(l.getAutore().Cognome().equalsIgnoreCase(cognome))
                ret.add(l);

        return ret;
    }

    @Override
    public List<Libro> ordinaPerTitolo() {
        List<Libro> ret=new ArrayList<>(catalogo);
        Collections.sort(ret);
        return ret;
    }

    @Override
    public List<Libro> ordinaPerAnno() {
        List<Libro> ret=new ArrayList<>(catalogo);
        ret.sort((Libro l1,Libro l2) -> l1.getAnnoPubblicazione()-l2.getAnnoPubblicazione() );
        return ret;
    }

    @Override
    public void prestaLibro(String titolo, String utente) {
        throw new UnsupportedOperationException("");
    }

    @Override
    public void restituisciLibro(String titolo) {
        throw new UnsupportedOperationException("");
    }

    @Override
    public Iterator<Libro> iterator() {
        return catalogo.iterator();
    }
}
