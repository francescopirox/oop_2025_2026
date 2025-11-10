package treni;

public class VagonePassegeri extends VagoniAbstract{

    public VagonePassegeri(Massa massa, Massa massaFrenata, Velocità velocità, Identificatore identificatore, Lunghezza lunghezza) {
        super(massa, massaFrenata, velocità, identificatore, lunghezza);
    }

    @Override
    public int compareTo(Vagoni v) {
        return super.compareTo(v);
    }

    @Override
    public int hashcode() {
        return 0;
    }
}
