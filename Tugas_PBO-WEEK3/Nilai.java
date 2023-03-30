import java.util.Scanner;
public class Nilai {

    String nama , nim;
    float nilaiUTS , nilaiTugas , nilaiUAS ;
    float nilaiAkhir ; 
    char  nHuruf;
    String Predikat;
    float naTugas; 
    float naUTS; 
    float naUAS;

     public void inputNilai(){
    Scanner input = new Scanner (System.in);
    System.out.print(" Nama        = ");
    nama = input.nextLine();
    System.out.print(" NIM         = ");
    nim = input.nextLine();
    System.out.print(" Nilai Tugas = ");
    nilaiTugas = input.nextFloat();
    System.out.print(" Nilai UTS   = ");
    nilaiUTS = input.nextFloat();
    System.out.print(" Nilai UAS   = ");
    nilaiUAS = input.nextFloat();

    }

    public void gethitung(){
        naTugas = nilaiTugas * 0.2f ;
        naUTS   = nilaiUTS * 0.35f ;
        naUAS   = nilaiUAS * 0.45f ;
        nilaiAkhir = naTugas + naUAS + naUTS ;
    }    

    public char getNilHuruf(float nilai) {

         if (nilai >= 85) {
            nHuruf = 'A';
        } else if (nilai >= 70 && nilai < 85) {
            nHuruf = 'B';
        } else if (nilai >= 60 && nilai < 70) {
            nHuruf = 'C';
        } else if (nilai >= 40 && nilai < 60) {
            nHuruf = 'D';
        } else {
            nHuruf = 'E';
        }
        return nHuruf;
    }

    public String getPredikat(char Huruf)
    {
        switch( Huruf )
        {
            case 'A' : 
                Predikat = "Apik ";
                    break;
            case 'B' :
                Predikat = "Baik";
                    break;
            case 'C' : 
                Predikat = "Cukup";
                    break;
            case 'D' :
                Predikat = "Dablek";
                    break;
            default : 
                Predikat = "Elek ";
        } 
        return Predikat;
    }


    public void cetakNilai(){

     System.out.println(" Nama        = " + nama);
     System.out.println(" NIM         = " + nim );
     System.out.println(" Nilai Tugas = " + nilaiTugas + "  20% : " + nilaiTugas * 0.2f);
     System.out.println(" Nilai UTS   = " + nilaiUTS + "  30% : " + nilaiUTS * 0.35f);
     System.out.println(" Nilai UAS   = " + nilaiUAS + "  45% : " + nilaiUAS * 0.45f);
     gethitung();
     System.out.println(" Nilai Akhir = " + nilaiAkhir);
     System.out.println(" Nilai Huruf = " + getNilHuruf(nilaiAkhir));
     System.out.println(" Predikat    = " + getPredikat(nHuruf));
    }

}