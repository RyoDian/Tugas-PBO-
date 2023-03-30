import java.util.Scanner;
public class AksiJual {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jawab;
        do {
            System.out.print("Kode Barang  : ");
            String kode = input.nextLine();
            System.out.print("Nama Barang  : ");
            String nama = input.nextLine();
            System.out.print("Harga Barang : ");
            float harga = input.nextFloat();
            System.out.print("Jumlah Beli  : ");
            int jumlah = input.nextInt();

            Penjualan penjualan = new Penjualan(kode, nama, harga, jumlah);
            penjualan.cetakNota();

            System.out.print("\nInput data lagi [Y/T]? ");
            jawab = input.next();
            input.nextLine();
        } while (jawab.equalsIgnoreCase("Y"));
    }
}