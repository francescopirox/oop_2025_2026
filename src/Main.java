import geom.Cartesian3DPoint;
import geom.Point3D;
import geom.Punto3DUtil;
import physics.Mass;
import physics.Mat3Dpoint;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Point2Dimpl p1=new Point2Dimpl(0.1,0.2);
        Point2Dimpl p2=new Point2Dimpl(0.3,0.4);
        System.out.println(p1 +" \n"+p2);

        StudenteImpl s1=new StudenteImpl(1,"Pippo",1.0,'A');
        System.out.println(s1);

        Point3D p=new Cartesian3DPoint(0.1,0.2,0.3);
        Mat3Dpoint m3d= new Mat3Dpoint(p,new Mass(5));

        Punto3DUtil.getMiddlePoint(new Mat3Dpoint[]{m3d});
    }
}