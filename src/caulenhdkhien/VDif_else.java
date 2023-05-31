package caulenhdkhien;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VDif_else {
    public static void main(String[] args) {
        // giai ptr bac 2
         double a,b,c,x1,x2,del;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao a");
        a = sc.nextDouble();
        System.out.println("Nhap vao b");
        b = sc.nextDouble();
        System.out.println("Nhap vao c");
        c = sc.nextDouble();

        del = Math.pow(b,2) - 4*a*c;
        if (a==0) {
            System.out.println("Ptr bac nhat");

        }        if (del<0){
            // del<0
            System.out.println("Ptr vo nghiem");
        } else if (del == 0) {
            //del = 0
            x2 = x1 = -b/(2*a);
            System.out.println("Nghiem kep " + x1);
        } else {
            x1 = (-b- Math.sqrt(del))/(2*a);
            x2 = (-b+ Math.sqrt(del))/(2*a);
            System.out.println(x1+"la n1");
            System.out.println(x2+"la n2");
        }
    }
}
