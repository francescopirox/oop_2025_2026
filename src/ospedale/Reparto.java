package ospedale;

public interface Reparto extends Comparable<Reparto>{
    CodiceReparto codice();
    NomeReparto nome();
    CapacitaPazienti capacita();
    int medici();
    Superficie superficie();
    Criticita criticita();

    default int compareTo(Reparto r){
        return r.codice().toString().compareTo(this.codice().toString());
    }
}
