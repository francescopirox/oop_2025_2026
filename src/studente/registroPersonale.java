package studente;

import java.util.HashMap;
import java.util.Map;

public class registroPersonale {

    private final Map<String,Integer> libretto=new HashMap<>();


    public void addVoto(String esame, int voto){

        Integer res=libretto.get(esame);
        if (res != null || esame == null) {
            throw new IllegalArgumentException("Voto già inserito");
        }
        libretto.put(esame,voto);

    }

    public double media(){
        double d=0.0;
        for(Integer i: libretto.values()){
            d+=i;
        }
        return d/(double) libretto.values().size();
    }


}
