import java.util.Scanner;

public class AksiNilai{

    public static void main (String [] args ){
        Scanner input = new Scanner(System.in);
        String ulang = "Y";
        while (ulang.equals("Y")){
            Nilai objNilai = new Nilai();
        objNilai.inputNilai();
        objNilai.cetakNilai();
            System.out.println("Ulangi lagi kah ? [Y/T]");
            ulang= input.next();
        }

    }

    

}

