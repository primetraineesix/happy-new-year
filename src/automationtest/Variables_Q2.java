package automationtest;

/**
 * Created by Jay Vaghani
 */
public class Variables_Q2 {
    int id;
    String name;

    public Variables_Q2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("This is id " + id);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Variables_Q2 obj = new Variables_Q2(101, "Jay");
        obj.display();

        Variables_Q2 obj1 = new Variables_Q2(102, "Prime");
        obj1.display();
    }


}
