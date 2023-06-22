package OOPS;

public class Honda extends Phuongtien{
    @Override
    void run() {
        System.out.println("di bang may");
    }

    public static void main(String[] args) {
        Honda b = new Honda();
        b.run();
    }
}
