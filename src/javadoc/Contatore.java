package javadoc;

/**
 * questa classe è un contatore
 * @author francescopirox
 */
public class Contatore {
    private int num;


    public Contatore(int num) {
        this.num = num;
    }

    public Contatore() {
        this.num = 0;
    }
    /**
     * Incrementa il valore del contatore di 1.
     */
    public void aggiungi(){
        this.num +=1;
    }

    /**
     * Decrementa il valore del contatore di 1.
     */
    public void sottrai(){
        this.num -=1;
    }

    /**
     * Restituisce il valore attuale del contatore.
     *
     * @return il valore attuale
     */
    public int getNum() {
        return num;
    }
}
