package physics;

import geom.Cartesian3DPoint;

public class Material3DPoint {
    private Mass m;
    private Cartesian3DPoint point;

    public Mass getM() {
        return m;
    }

    public Cartesian3DPoint getPoint() {
        return point;
    }

    public Material3DPoint(Mass m, Cartesian3DPoint point) {
        if (m != null && point != null) {
            this.m = m;
            this.point = point;
        }
        else{
            //todo
        }


    }
}
