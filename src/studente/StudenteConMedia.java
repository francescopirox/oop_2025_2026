package studente;

public class StudenteConMedia extends StudenteImpl{

    private registroPersonale registroPersonale;
    public StudenteConMedia(int matricola, String getNome, double mediaVoti, char inizialeCorso) {
        super(matricola, getNome, mediaVoti, inizialeCorso);
        registroPersonale= new registroPersonale();
    }

    @Override
    public double getMediaVoti() {
        return registroPersonale.media();
    }

    public void addVoti(String s,int voto){
      registroPersonale.addVoto(s,voto);
    }



}
