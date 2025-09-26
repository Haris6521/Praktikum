// TriangleType.java
public class TriangleType {
    public static String classify(int a, int b, int c) {
        // sisi harus positif
        if (a <= 0 || b <= 0 || c <= 0) return "bukan segitiga";

        // cek ketidaksamaan segitiga
        if (!(a + b > c && a + c > b && b + c > a)) {
            return "bukan segitiga";
        }

        // sama sisi
        if (a == b && b == c) return "sama sisi";

        // cek siku-siku: gunakan kuadrat sisi (hindari floating)
        int[] s = new int[]{a, b, c};
        java.util.Arrays.sort(s);
        if (s[0]*s[0] + s[1]*s[1] == s[2]*s[2]) return "siku-siku";

        // sama kaki
        if (a == b || a == c || b == c) return "sama kaki";

        // selanjutnya
        return "segitiga sembarang";
    }
}
