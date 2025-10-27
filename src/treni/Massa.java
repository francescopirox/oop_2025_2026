package treni;

public record Massa(double massa) {
    public Massa{
        if(massa<0.0)
            throw new IllegalArgumentException();
    }


}
