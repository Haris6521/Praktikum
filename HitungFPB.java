public class HitungFPB {
    public static int hitungFPB(int x, int y) {
        // gunakan nilai absolut agar robust untuk input negatif
        x = Math.abs(x);
        y = Math.abs(y);

        // kasus khusus: jika x=0 dan y=0, kita kembalikan 0 (tidak terdefinisi)
        if (x == 0 && y == 0) return 0;
        if (x == 0) return y; 
        if (y == 0) return x;

        // tentukan pembagi awal
        int pembagi = Math.min(x, y);

        // lakukan looping sesuai flowchart
        while (!(x % pembagi == 0 && y % pembagi == 0)) {
            pembagi = pembagi - 1;
        }

        // jika keluar loop, berarti pembagi cocok
        return pembagi;
    }
}
