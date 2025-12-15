package mediateca;

public record Titolo(String titolo) {
    public Titolo {
        if (titolo == null)
            throw new IllegalArgumentException();
        if( !titolo.matches("[\\w]+"))
            throw new IllegalArgumentException();;
    }

}
