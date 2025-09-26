// SquaresPosition.java
public class SquaresPosition {
    public static String getPosition(int x1, int y1, int s1, int x2, int y2, int s2) {
        if (s1 < 0 || s2 < 0) throw new IllegalArgumentException("Panjang sisi tidak boleh negatif");

        int left1 = x1;
        int right1 = x1 + s1;
        int top1 = y1;
        int bottom1 = y1 - s1;

        int left2 = x2;
        int right2 = x2 + s2;
        int top2 = y2;
        int bottom2 = y2 - s2;

        // cek inside: kotak2 sepenuhnya di dalam kotak1
        boolean inside = left2 >= left1 && right2 <= right1 && bottom2 >= bottom1 && top2 <= top1;
        if (inside) return "inside";

        // cek overlap (intersect) — kondisi overlap axis-aligned
        boolean overlap = !(right1 < left2 || right2 < left1 || top1 < bottom2 || top2 < bottom1);
        if (overlap) return "intersect";

        return "outside";
    }
}
