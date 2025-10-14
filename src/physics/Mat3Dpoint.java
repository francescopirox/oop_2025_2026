package physics;

import geom.Cartesian3DPoint;
import geom.Point3D;

public class Mat3Dpoint extends Cartesian3DPoint {
    private Mass m;
    public Mat3Dpoint(Point3D point, Mass m) {
        super(point);
    }

    public Mass getM() {
        return m;
    }
}
