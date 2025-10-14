package Palestra;

public class Intensita {
    public static Intensita bassa=new Intensita("bassa",1);
    public static Intensita media=new Intensita("media",2);
    public static Intensita alta=new Intensita("alta",3);
    private String intensita;
    private int numero;

    private Intensita(String intensita, int numero) {
        this.intensita = intensita;
        if(numero<0 || numero>5){
            throw new IllegalArgumentException("Numero Non valido");
        }
        this.numero = numero;
    }

    public String getIntensita() {
        return intensita;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return intensita;
    }
    public boolean equals(Object o){
        if (o== null) return false;
        if(o==this) return true;
        if(!(o instanceof Intensita that)) return false;
        if(that.numero!=numero) return false;
        return true;
    }

    public static void main(String[] args) {

    }
}
