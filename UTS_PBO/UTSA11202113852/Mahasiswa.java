package UTSA11202113852;

public class Mahasiswa{
    String nim;
    String nama;
    int semester;
    int usia;
    String krs[];

    public Mahasiswa(String nim, String nama, int semester, int usia, String[] krs) {
        this.nim = nim;
        this.nama = nama;
        this.semester = semester;
        this.usia = usia;
        this.krs = krs;
    }

    float hitungRataNilai(int[] nilai) {
        int totalNilai = 0;
        for (int n : nilai) {
            totalNilai += n;
        } 
        return (float) totalNilai / nilai.length;
    }

    void infoMahasiswa() {
    	System.out.println("\n== CETAK DATA ==");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Semester: " + semester);
        System.out.println("Usia: " + usia);
    }

    void infoKrsMahasiswa() {
        System.out.println("KRS:");
        for (String matakuliah : krs) {
            System.out.println("- " + matakuliah);
        }
    }
}

