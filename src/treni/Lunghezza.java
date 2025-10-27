package treni;

public record Lunghezza(double lunghezza) {
    public Lunghezza{
        if (lunghezza < 5.0 || lunghezza>35)
            throw new IllegalArgumentException("Lunghezza non valida");
    }
}
