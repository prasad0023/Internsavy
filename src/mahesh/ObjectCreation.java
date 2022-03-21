package mahesh;

public class ObjectCreation {
    public ObjectCreation(){
        System.out.println("i am in a default constructor");
    }
    public void display(){
        System.out.println("i am in a display method");
    }
    public static void main(String[] args) {
        ObjectCreation obj = new ObjectCreation();
        obj.display();
        System.out.println("************************************************");
        // nameless object
        new ObjectCreation();
        System.out.println("*************************************************");

        new ObjectCreation().display();

    }
}
