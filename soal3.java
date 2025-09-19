import java.util.Random;
import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Soal 3: Tanya Jawab Substring ===");

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = sc.nextLine();

        if (kalimat.length() < 2) {
            System.out.println("Kalimat terlalu pendek untuk diambil substring.");
            sc.close();
            return;
        }

        Random rand = new Random();
        int start = rand.nextInt(kalimat.length() - 1);
        int end = rand.nextInt(kalimat.length() - start - 1) + start + 1;

        System.out.print("Apa substring dari indeks " + start + " hingga " + end + "? ");
        String jawaban = sc.nextLine();

        String benar = kalimat.substring(start, end);
        if (jawaban.equals(benar)) {
            System.out.println("\u2714 Benar! Keren, kamu jago string!");
        } else {
            System.out.println("\u2718 Kurang tepat. Jawaban yang benar: " + benar);
        }

        sc.close();
    }
}
