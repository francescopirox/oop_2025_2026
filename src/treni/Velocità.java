package treni;

public record Velocità(int velocità) {
    public Velocità{
        if(velocità < 0)
            throw new IllegalArgumentException("Velocità non valida");
    }
}
