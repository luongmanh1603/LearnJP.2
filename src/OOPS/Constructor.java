package OOPS;

public class Constructor {
    //constructor co tham so va mac dinh
    int id;
    String name;

    public Constructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println(id+" "+ name);
    }

    public static void main(String[] args) {
        Constructor st = new Constructor(1,"manh");
        st.display();
    }
}
