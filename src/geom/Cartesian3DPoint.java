package geom;

public class Cartesian3DPoint implements Point3D{
    private double x;
    private double y;
    private double z;

    public Cartesian3DPoint(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Cartesian3DPoint(Point3D point){
        if(point != null) {
            this.x = point.getX();
            this.y = point.getY();
            this.z = point.getZ();
        }
        else {
            //vedremo
        }
    }

    public double getZ() {
        return z;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }
}
