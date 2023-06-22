package OOPS;

import java.util.logging.SocketHandler;

public class TestInterface {
    public static void main(String[] args) {
        System.out.println("Test Interface MayTinhBotui: ");
        FX500 fx500 = new FX500();
        Cal500 cal500 = new Cal500();
        System.out.println("5+3="+ fx500.cong(5,3));
        System.out.println("5*3="+ cal500.nhan(5,3));
        System.out.println("test sắp xếp:");
        double[] arr = new double[]{2,5,78,54,540};
        SXChen chen = new SXChen();
        chen.sxTang(arr);
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Giam ");
        double[] arr1= new double[] {2,8,7,6,9};
        SXChon giamchon = new SXChon();
        giamchon.sxGiam(arr1);
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]+ " ");
        }
        System.out.println();
    }
}
