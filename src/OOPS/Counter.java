package OOPS;

public class Counter {
    static int count = 1;

    public Counter() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

    }

}
