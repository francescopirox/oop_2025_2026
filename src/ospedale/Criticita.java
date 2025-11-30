package ospedale;

public enum Criticita {
    BASSO(1),
    MEDIOBASSO(2),
    MEDIO(3),
    MEDIOALTO(4),
    ALTO(5);

    private final int livello;

    Criticita(int i) {
        this.livello=i;
    }
}
