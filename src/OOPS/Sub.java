package OOPS;

public class Sub extends Super{
    int a = 10;
    public void inBien(){
        System.out.println(super.a);
    }

    public Sub() {
        System.out.println("Luong Thanh Nguyen");
    }
    public void in(){
        super.inName();
    }

    public static void main(String[] args) {
        Sub s = new Sub();
        s.inBien();
        s.in();
    }

}
