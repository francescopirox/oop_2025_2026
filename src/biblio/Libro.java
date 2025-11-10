package biblio;

public interface Libro extends Comparable<Libro>{
    String getTitolo();
    Autore getAutore();
    int getAnnoPubblicazione();
    boolean isDisponibile();
    void presta(String utente);
    void restituisci();
    default int compareTo(Libro l){
        return this.getTitolo().compareTo(l.getTitolo());
    }
}
