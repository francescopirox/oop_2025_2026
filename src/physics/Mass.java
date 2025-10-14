package physics;

public class Mass {
    private double m;

    public Mass(double m) {
        if (m>=0.0) {
            this.m = m;
        }
        else{
            this.m =0.0;
        }
    }

    public double getM() {
        return m;
    }

    @Override
    public String toString() {
        return "Mass{" +
                "m=" + m +
                '}';
    }
}
