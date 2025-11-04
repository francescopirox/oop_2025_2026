package treni;

public interface Vagoni extends Comparable<Vagoni>{
    Identificatore identificatore();
    Massa massa();
    Massa massaFrenata();
    Velocità velocità();
    Lunghezza lunghezza();
    default int compareTo(Vagoni v){
        return identificatore().identificatore().compareTo(v.identificatore().identificatore());
    }

    int hashcode();
}
