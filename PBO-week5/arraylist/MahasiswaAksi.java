import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MahasiswaAksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        ArrayList<Double> nilai = new ArrayList<>();
        System.out.print("Masukkan IPS (pisahkan dengan spasi): ");
        String[] nilaiString = input.nextLine().split(" ");
        for (String n : nilaiString) {
            nilai.add(Double.parseDouble(n));
        }

        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, nilai);
        System.out.println("Nama: " + mahasiswa.getNama() + ", NIM: " + mahasiswa.getNim() + ", IPK: " + mahasiswa.hitungIPK());

        System.out.print("Masukkan nilai baru: ");
        double nilaiBaru = input.nextDouble();
        mahasiswa.tambahNilai(nilaiBaru);
        System.out.println("Nilai baru berhasil ditambahkan.");

        System.out.print("Masukkan nilai yang ingin dihapus: ");
        double nilaiHapus = input.nextDouble();
        mahasiswa.hapusNilai(nilaiHapus);
        System.out.println("Nilai berhasil dihapus.");

        mahasiswa.tampilkanNilai();
         System.out.println("Nama: " + mahasiswa.getNama() + ", NIM: " + mahasiswa.getNim() + ", IPK: " + mahasiswa.hitungIPK());
    }
}
