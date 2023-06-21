package OOPS;

public class Static {
   static int a = 0;
    int id;
    String school;
    static int room = 401;

    static void change(){
        //pth static co the truy cap va thay doi bien static
        // thuoc lop chu khong thuoc instance of lop
        // khong can tao obj
        room = 601;
    }
    public Static(int id, String school) {
        this.id = id;
        this.school = school;
    }



    void display(){
        System.out.println(id+" "+school+ " "+ room);
    }

    public static void main(String[] args) {
        Static.change();
        Static p = new Static(1,"FPT");
        p.display();
        Static q = new Static(2,"HANU");
        q.display();
        System.out.println(a);

    }
}
