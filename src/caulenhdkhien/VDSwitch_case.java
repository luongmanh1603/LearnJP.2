package caulenhdkhien;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;


public class VDSwitch_case {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thang");
        n = sc.nextInt();
        switch (n) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(n+"la thang co 31 ngay");
                break;
            case 2:
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("thang" + n +"la thang co 30 ngay");
                break;


        }
    }


}
