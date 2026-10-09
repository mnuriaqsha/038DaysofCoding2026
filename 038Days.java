import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a = "1. Nasi Kuning = RP10,000,00";
        String b = "2. Gado Gado   = RP10,000,00";
        String c = "3. Nasi Ayam   = RP10,000,00";
        String d = "4. Ayam Geprek = RP10,000,00";
        String e = "5. Es Teh      = RP5,000,00";

        System.out.println("=== Daftar Menu Yang Tersedia ===\n");
        System.out.printf(" %s \n %s \n %s \n %s \n %s \n ", a, b, c, d, e);

        System.out.println("\nSilahkan Masukkan Pesanan Anda");
        int makanan = input.nextInt();

        if (makanan == 1) {
            System.out.println(a);
        } else if (makanan == 2) {
            System.out.println(b);
        } else if (makanan == 3) {
            System.out.println(c);
        } else if (makanan == 4) {
            System.out.println(d);
        } else {
            System.out.println(c);
        }
    }
}
