package mediateca;

public record Nominativo(String nome) {
    public Nominativo{
        if(nome == null)
            throw new IllegalArgumentException();
        if(!nome.matches("[A-Za-z]")){
            throw new IllegalArgumentException();
        }

    }
}
