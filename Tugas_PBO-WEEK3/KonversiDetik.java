import java.util.Scanner;

public class KonversiDetik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String ulangi;
        do {
            System.out.print("Masukkan jumlah detik: ");
            int detik = input.nextInt();

            int hari = detik / 86400;
            detik %= 86400;

            int jam = detik / 3600;
            detik %= 3600;

            int menit = detik / 60;
            detik %= 60;

            System.out.println("Hasil konversi:");
            System.out.printf("%d hari\n", hari);
			System.out.printf("%d jam\n", jam);
			System.out.printf("%d menit\n", menit);
			System.out.printf("%d detik\n", detik);
			

            System.out.print("Input data lagi [Y/T]? ");
            ulangi = input.next();
        } while (ulangi.equalsIgnoreCase("Y"));
    }
}
