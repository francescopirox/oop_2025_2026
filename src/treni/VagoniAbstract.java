package treni;

public abstract class VagoniAbstract implements Vagoni{
    private Massa massa;
    private Massa massaFrenata;
    private Velocità velocità;
    private Identificatore identificatore;
    private Lunghezza lunghezza;


    public VagoniAbstract(Massa massa, Massa massaFrenata, Velocità velocità, Identificatore identificatore, Lunghezza lunghezza) {
        if(massaFrenata.massa()>massa.massa() || massa.massa()>255 || massa.massa()<1)
            throw new IllegalArgumentException("Massa Frenata non valida");
        this.massa = massa;
        this.massaFrenata = massaFrenata;
        this.velocità = velocità;
        this.identificatore = identificatore;
        this.lunghezza = lunghezza;
    }

    @Override
    public String toString() {
        return "Vagoni{ "+identificatore().identificatore()+", lunghezza: "+
                lunghezza().lunghezza()+" }";
    }
    @Override
    public boolean equals(Object o){
        if(o == null)
            return false;
        if(o == this){
            return true;
        }
        if(! (o instanceof VagoniAbstract )){
            return false;
        }
        VagoniAbstract v=(VagoniAbstract) o;
        return v.identificatore().identificatore().equals(this.identificatore().identificatore());

    }

    @Override
    public int hashCode() {
        return identificatore().identificatore().hashCode();
    }

    @Override
    public Identificatore identificatore() {
        return identificatore;
    }

    @Override
    public Massa massa() {
        return massa;
    }

    @Override
    public Massa massaFrenata() {
        return massaFrenata;
    }

    @Override
    public Velocità velocità() {
        return velocità;
    }

    @Override
    public Lunghezza lunghezza() {
        return lunghezza;
    }

}
