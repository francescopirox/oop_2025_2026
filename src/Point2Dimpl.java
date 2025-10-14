public class Point2Dimpl implements Point2D{
    private double x=0.0;
    private double y=0.0;

    public Point2Dimpl(){}


    public Point2Dimpl(double x, double y){
        this.x=x;
        this.y=y;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }
//questo è un commento
    /*

    questo è un commento multilinea
     */

    /**
     * questa è documentazione
     * @return
     */
    @Override
    public String toString() {
        return "Point2Dimpl{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
