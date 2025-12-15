package mediateca;

import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

public class test {
    public static void main(String[] args) {

        Supporto s1=new CD(new Titolo("Pino"),new Anno(1999), new Anno(2000), new Nominativo("VIVI"), GenereCD.valueOf("rock"));
        Supporto recordCD = new RecordCD(new Nominativo("VIVI"), new Anno(1999), new Anno(2000), GenereCD.valueOf("rock"), new Titolo("Pino"));
        Scaffale<CD> scaffale=new ScaffaleConcreto<CD>(100,10,GenereCD.rock);
        Scaffale<RecordCD> scaffale1=new ScaffaleConcreto<RecordCD>(100,10,GenereCD.rock);

        PrintWriter pw=new PrintWriter(System.out,true);
        List<Scaffale<? extends Supporto>> ll=new LinkedList<>();
        ll.add(scaffale);
        ll.add(scaffale1);
        MediaUtil.stampaReport(ll,pw);
    }
}
