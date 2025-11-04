package Palestra;

import java.util.Objects;
import java.util.regex.*;
public class CodiceCorso {
    private String cod;
    private String pre;
    private int num;
    private String fin;



    CodiceCorso(String pre, int num, String fin){
        if(pre.length() != 2 ){
            char[] vec= new char[pre.length()];
            pre.getChars(0,pre.length(),vec,0);
            for(char c: vec){
                if(c<65||c>90)
                    throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Pre not valid");

        }
        if( num <0 || num > 1000) {
            throw new IllegalArgumentException("Numero non valido");

        }
        if(fin.length() != 1){
            throw new IllegalArgumentException("Fin not valid");
        }

    }

    @Override
    public boolean equals(Object o) {
        if(this == null) return false;
        if (this == o) return true;
        if (!(o instanceof CodiceCorso)) return false;
        CodiceCorso that=(CodiceCorso)o;
        return num == that.num &&
                pre.equals(that.pre) &&
                fin.equals(that.fin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pre, num, fin);
    }
}
