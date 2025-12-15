package mediateca;

public record RecordCD(Nominativo getAutore, Anno acquisto ,Anno annoEdizione, GenereCD getGenere, Titolo getTitolo) implements Supporto{

}
