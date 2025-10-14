package geom;

public class Punto3DUtil {
    public static double getMiddleX(Point3D[] list){
        double xm=0.0;
        for (int i=0;i<list.length;i++){
            xm+=list[i].getX();
        }
        return xm/list.length;
    }
    public static double getMiddleY(Point3D[] list){
        double ym=0.0;
        for (int i=0;i<list.length;i++){
            ym+=list[i].getY();
        }
        return ym/list.length;
    }

    public static double getMiddleZ(Point3D[] list){
        double zm=0.0;
        for (int i=0;i<list.length;i++){
            zm+=list[i].getZ();
        }
        return zm/list.length;
    }


    public static Point3D getMiddlePoint(Point3D[] list) {
        double xm=Punto3DUtil.getMiddleX(list);
        double ym=Punto3DUtil.getMiddleX(list);
        double zm=Punto3DUtil.getMiddleX(list);
        for(double d : list[0])

        return new Cartesian3DPoint(xm, ym, zm);
    }
}

