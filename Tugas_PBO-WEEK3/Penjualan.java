import java.util.Scanner;

public class Penjualan {
    private String kode;
    private String nama;
    private float harga;
    private int jumlah;
    private float totalPembelian;

    
    public Penjualan(String kode, String nama, float harga, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
        this.totalPembelian = harga * jumlah;
    }


    public float getTotalPembelian() {
        return totalPembelian;
    }

    
    public String getBonus() {
        String bonus = "";
        if (totalPembelian >= 500000 && jumlah > 5) {
            bonus = "Setrika";
        } else if (totalPembelian >= 100000 && jumlah > 3) {
            bonus = "Payung";
        } else if (totalPembelian >= 50000 || jumlah > 2) {
            bonus = "Ballpoint";
        }
        return bonus;
    }


    public void cetakNota() {
        System.out.println("Kode Barang  : " + kode);
        System.out.println("Nama Barang  : " + nama);
        System.out.println("Harga Barang : " + harga);
        System.out.println("Jumlah Beli  : " + jumlah);
        System.out.println("Total Harga  : " + totalPembelian);
        System.out.println("Bonus        : " + getBonus());
    }


}
