package biblio;

public class main {

    public static void main(String[] args) {
        LibroConGenere l=new LibroConGenere("nome", null, 1999,true,Genere.GIALLO);
        l.getGenere();
    }

}
