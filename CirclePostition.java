
public class CirclePostition {
    public static String getPosition(int r1, int r2, int x, int y) {
        if (r1 < 0 || r2 < 0) throw new IllegalArgumentException("Radius tidak boleh negatif");
        double d = Math.hypot(x, y); // sqrt(x^2 + y^2)
        if (d + r2 < r1) {
            return "inside";
        } else if (d - r2 > r1) {
            return "outside";
        } else {
            return "intersect";
        }
    }
}
