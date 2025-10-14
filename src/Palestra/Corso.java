package Palestra;

/***
 * Si definisca un’interfaccia Corso, che estenda Comparable, e che esponga
 * almeno i seguenti metodi:
 * CodiceCorso codice();
 * String nome();
 * int capacitaMassima();
 * int numeroIstruttori();
 * Orario orario();
 * int durataMinuti();
 * Intensita intensita();
 * Si modellino i tipi ausiliari CodiceCorso, Orario e Intensita. I
 * costruttori di tali tipi devono sollevare un’eccezione in caso di valori non
 * validi.
 *
 */

public interface Corso {
    CodiceCorso codice();
    String nome();
    int capacitàMassima();
    int numeroIstruttori();
    Orario orario();
    int durataMinuti();
    Intensita Intensita();
}
