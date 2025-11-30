package ospedale;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class OspedaleLC implements Ospedale{

    private final class Nodo{
        private Nodo next;
        private Reparto r;

        Nodo(Reparto r){
            this.r=r;
        }
    }

    private Nodo head = null;
    private Nodo tail = null;
    private int size = 0;

    @Override
    public void aggiungiReparto(Reparto r) {
        Nodo daIns=new Nodo(r);
        if(head == null){
            head=tail=daIns;
            return;

        }
        //Nodo prox=head;
        //while(prox != null){
        //    prox=prox.next
        //}
        //prox.next=daIns;
        tail.next=daIns;
        tail = daIns;
        size ++;

    }




    public Iterator<Reparto> iterator() {

        return new Iterator<Reparto>() {

            Nodo cur = null;   // ultimo nodo restituito
            Nodo pre = null;   // nodo precedente
            boolean removable = false;

            @Override
            public boolean hasNext() {
                if (cur == null)
                    return head != null;        // prima chiamata
                return cur.next != null;        // c’è un prossimo nodo
            }

            @Override
            public Reparto next() {
                if (!hasNext())
                    throw new NoSuchElementException();

                removable = true;

                if (cur == null) {
                    cur = head;                 // primo elemento
                } else {
                    pre = cur;                  // avanza
                    cur = cur.next;
                }

                return cur.r;
            }

            @Override
            public void remove() {
                if (!removable)
                    throw new IllegalStateException();

                size--;

                // RIMOZIONE IN TESTA
                if (pre == null) {
                    head = cur.next;
                    if (head == null)
                        tail = null;            // lista diventata vuota
                }
                // RIMOZIONE IN CODA
                else if (cur == tail) {
                    tail = pre;
                    pre.next = null;
                }
                // RIMOZIONE IN MEZZO
                else {
                    pre.next = cur.next;
                }

                // Dopo la rimozione, l’iteratore arretra
                cur = pre;
                removable = false;
            }
        };
    }
}
