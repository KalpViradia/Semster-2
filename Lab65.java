public class ThreeDPoint extends MyPoint {
    private double z;

    public ThreeDPoint() {
        this(0, 0, 0);
    }

    public ThreeDPoint(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    @Override
    public double distance(MyPoint point) {
        if (point instanceof ThreeDPoint) {
            ThreeDPoint other = (ThreeDPoint) point;
            return Math.sqrt(Math.pow(getX() - other.getX(), 2) +
                             Math.pow(getY() - other.getY(), 2) +
                             Math.pow(z - other.getZ(), 2));
        } else {
            return super.distance(point);
        }
    }
}

public class Lab65 {
    public static void main(String[] args) {
        ThreeDPoint p1 = new ThreeDPoint();
        ThreeDPoint p2 = new ThreeDPoint(10, 30, 25.5);
        System.out.println("Distance between p1 and p2: " + p1.distance(p2));
    }
}