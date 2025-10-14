package Palestra;

public class Test {
    public static void main(String[] args) {
        CodiceCorso cc=new CodiceCorso("AA",100,"B");
        Orario o=new Orario("LUN",12,"30");
        Cardio c=new Cardio(cc,"Spinning",21,2,50,o,Intensita.alta);
        System.out.println(c+" "+c.orario());
    }
}
