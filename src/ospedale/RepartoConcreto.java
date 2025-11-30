package ospedale;

public class RepartoConcreto extends RepartoAbstract {
    private final CapacitaPazienti capacitaPazienti;
    private final CodiceReparto codiceReparto;
    private final Criticita criticita;
    private final NomeReparto nomeReparto;
    private final Superficie superficie;
    private final int medici;

    public RepartoConcreto(CapacitaPazienti capacitaPazienti, CodiceReparto codiceReparto, Criticita criticita, NomeReparto nomeReparto, Superficie superficie, int medici) {
        this.capacitaPazienti = capacitaPazienti;
        this.codiceReparto = codiceReparto;
        this.criticita = criticita;
        this.nomeReparto = nomeReparto;
        this.superficie = superficie;
        this.medici = medici;
    }

    public CapacitaPazienti capacita() {
        return capacitaPazienti;
    }

    public CodiceReparto codice() {
        return codiceReparto;
    }

    public Criticita criticita() {
        return criticita;
    }

    public NomeReparto nome() {
        return nomeReparto;
    }

    public Superficie superficie() {
        return superficie;
    }

    public int medici() {
        return medici;
    }
}