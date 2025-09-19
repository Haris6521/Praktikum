import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Soal 2: Cari Bilangan Terkecil & Terbesar ===");
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        int terkecil = nums[0];
        int terbesar = nums[0];

        for (int i = 1; i < 4; i++) {
            if (nums[i] < terkecil) {
                terkecil = nums[i];
            }
            if (nums[i] > terbesar) {
                terbesar = nums[i];
            }
        }

        System.out.println("Bilangan terkecil: " + terkecil);
        System.out.println("Bilangan terbesar: " + terbesar);

        sc.close();
    }
}
