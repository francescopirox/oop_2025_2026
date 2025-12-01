package magazzino;

import java.io.PrintWriter;
import java.io.Serializable;

public record Materiale(String nomeMateriale, int quanitità, double costoUnitario) implements Serializable {
    public String stampa(){
        return String.format("%s$%d$%f#",nomeMateriale,quanitità,costoUnitario);
    }

}
