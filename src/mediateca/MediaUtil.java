package mediateca;

import java.io.PrintWriter;
import java.util.List;

public class MediaUtil {
    static void stampaReport(List<? extends Scaffale<? extends Supporto>> scaffali, PrintWriter pw){
        for(Scaffale<? extends Supporto> scaffale: scaffali){
            for(Supporto s : scaffale){
                pw.println(s.toString());
            }
        }
    }
}
