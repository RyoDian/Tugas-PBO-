import java.util.ArrayList;
import java.util.Iterator;

public class Mahasiswa {
    private String nama;
    private String nim;
    private ArrayList<Double> nilai;

    public Mahasiswa(String nama, String nim, ArrayList<Double> nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public double hitungIPK() {
        double total = 0;
        for (double n : nilai) {
            total += n;
        }
        return total / nilai.size();
    }

    public void tambahNilai(double n) {
        nilai.add(n);
    }
    
    public void hapusNilai(double n) {
        nilai.remove(n);
    }
    
    public void tampilkanNilai() {
        System.out.println("Nilai " + nama + ":");
        Iterator<Double> iterator = nilai.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
