package usa.airforce;

public class AntiAir {
    public static double[] solve(double x, double y, double vx, double vy, double v) {
        double a = vx * vx + vy * vy - v * v;
        double b = 2 * x * vx + 2 * y * vy;
        double c = x * x + y * y;
        double t;
        if (a == 0) {
            t = -c / b;
        } else {
            double d = Math.pow(b, 2) - 4 * a * c;
            if (d < 0) return new double[]{-1, -1};
            double t1, t2;
            t1 = (-b + Math.sqrt(d)) / (2 * a);
            t2 = (-b - Math.sqrt(d)) / (2 * a);
            if (t1 < 0 && t2 < 0) return new double[]{-1, -1};
            t = Math.max(t1, t2);
        }
        return new double[]{x + t * vx, y + t * vy};
    }
}
