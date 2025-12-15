package mediateca;

public record Anno(int anno) {
    public Anno{
        if (anno < 1453 || anno >2100)
            throw new IllegalArgumentException("Anno errato");
    }
}
