package prasad.method;

public class InstanceBlock {
    {
        System.out.println("I am in instance Block");
    }                                                       //instance block
    public InstanceBlock(){
        System.out.println("I am in  Constructor");
    }                                                       //constructor

    public static void main(String[] args) {
        InstanceBlock obj = new InstanceBlock();
        InstanceBlock obj1 = new InstanceBlock();
    }
}
