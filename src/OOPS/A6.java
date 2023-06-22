package OOPS;

public class A6 implements printable, run{
    @Override
    public void print() {
        System.out.println("luong van manh");
    }

    public static void main(String[] args) {
        A6 a = new A6();
        a.print();
        a.chaybo();
    }

    @Override
    public void chaybo() {
        System.out.println("Chay nhu cho");
    }
}
