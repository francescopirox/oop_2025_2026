package biblio;

import java.util.*;

public class BiblioPrestiti extends BiblioConcreta{
    Map<String, List<Libro>> prestiti=new HashMap<>();

    @Override
    public void prestaLibro(String titolo, String utente) {
       List<Libro> inPrestito=prestiti.get(utente);
       if(inPrestito==null){
           List<Libro> ret=new ArrayList<>();
           for(Libro l:this){
               if(l.getTitolo().equalsIgnoreCase(titolo)) {
                   l.presta(utente);
                   ret.add(l);
                   inPrestito.add(l);
                   break;
               }


           }


       }
       else{
           for(Libro l:this){
               if(l.getTitolo().equalsIgnoreCase(titolo)) {
                   l.presta(utente);
                   inPrestito.add(l);
                   break;
               }

           }

       }
    }

    @Override
    public void restituisciLibro(String titolo) {
        for(List<Libro> list :prestiti.values()){
            for(Libro l:list){
                if(l.getTitolo().equalsIgnoreCase(titolo)) {
                    l.restituisci();
                    list.remove(l);
                }
            }
        }
    }



}
