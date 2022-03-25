package prasad.method;

public class ObjectCreation {
    public ObjectCreation(){
        System.out.println("i am in default constructor");
    }
    public void Display(){
        System.out.println("Iam in Display method");
    }

    public static void main(String[] args) {
        ObjectCreation obj = new ObjectCreation();
        obj.Display();
        System.out.println("***********************************");
        new ObjectCreation();           //nameless Object
        System.out.println("***********************************");
        new ObjectCreation().Display();
    }
}
