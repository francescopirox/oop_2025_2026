package geom;

public interface Point3D {
    double getX();
    double getY();
    double getZ();
    default double distanza(Point3D point){
        return 0.0;
    }

}
