package caulenhdkhien;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class VDWhile {
    // chuyen doi tu thap phan sang nhi phan
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        n = sc.nextInt();
        String nhiPhan = "";
        while (n>0) {

            nhiPhan = (n%2) + nhiPhan;
            n = n/2;


        }
        System.out.println("He nhi phan: " + nhiPhan );
    }
}
