package OOPS;

public class This {
    // tham chieu toi bien insstance cua lop hien tai, neu trung ten voi constructor
    // goi constructor cua lop hien tai
    //goi phuong thuc cua lop hien tai

    int id;
    String name;
    String city;

    public This(int id, String name) {
        this.id = id;
        this.name = name;
    }

    This(int id, String name, String city) {
        this(id,name);
        this.city = city;
    }
    void display(){
        System.out.println(id+" "+name +" "+ city);


    }

    public static void main(String[] args) {
        This t = new This(2,"dai");
        This o = new This(222,"manh","hanoi");
        o.display();
        t.display();
    }
}
