package treni;

public class Motrice extends VagoniAbstract{

    private Trazione trazione;


    public Motrice(Massa massa, Massa massaFrenata, Velocità velocità, Identificatore identificatore, Lunghezza lunghezza, Massa capacità, String descrizione) {
        super(massa,massaFrenata,velocità,identificatore,lunghezza);

        if(massa.massa()< capacità.massa())
            throw new IllegalArgumentException();

        this.trazione=new Trazione(capacità,descrizione);
    }

    public Trazione getTrazione() {
        return trazione;
    }

    @Override
    public int compareTo(Vagoni v) {
        return super.compareTo(v);
    }

    @Override
    public int hashcode() {
        return 0;
    }

    class Trazione{
        private Massa capacità;
        private String tipo;

        public Trazione(Massa capacità, String tipo) {
            this.capacità = capacità;
            this.tipo = tipo;
        }

        public Massa capacità() {
            return capacità;
        }

        public String tipo() {
            return tipo;
        }
    }
}
