package OOPS;

public class Static {
    int id;
    String school;
    static int room = 401;

    public Static(int id, String school) {
        this.id = id;
        this.school = school;
    }



    void display(){
        System.out.println(id+" "+school+ " "+ room);
    }

    public static void main(String[] args) {
        Static p = new Static(1,"FPT");
        p.display();
        Static q = new Static(2,"HANU");
        q.display();

    }
}
