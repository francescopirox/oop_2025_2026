public class StudenteImpl implements Studente{
    private int Matricola;
    private String Nome;
    private double MediaVoti;
    private char inizialeCorso;

    public StudenteImpl(int matricola, String getNome, double mediaVoti, char inizialeCorso) {
        this.Matricola = matricola;
        this.Nome = getNome;
        this.MediaVoti = mediaVoti;
        this.inizialeCorso = inizialeCorso;
    }

    @Override
    public int getMatricola() {
        return this.Matricola;
    }

    @Override
    public String getNome() {
        return this.Nome;
    }

    @Override
    public double getMediaVoti() {
        return this.MediaVoti;
    }

    @Override
    public char getInizialeCorso() {
        return this.inizialeCorso;
    }

    @Override
    public String toString() {
        return "StudenteImpl{" +
                "Matricola=" + Matricola +
                ", Nome='" + Nome + '\'' +
                ", MediaVoti=" + MediaVoti +
                ", inizialeCorso=" + inizialeCorso +
                '}';
    }
}
