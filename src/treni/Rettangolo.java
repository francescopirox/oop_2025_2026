package treni;

public record Rettangolo(int base, int altezza) implements Comparable<Rettangolo>{
    public Rettangolo{
        if(base <=0 || altezza <=0)
            throw new IllegalArgumentException();
    }
    public int area(){
        return base*altezza;
    }

    public int compareTo(Rettangolo r){
        return altezza-r.altezza;
    }

    public static void main(String[] args) {
        new Rettangolo(10,20).base();
    }
}
