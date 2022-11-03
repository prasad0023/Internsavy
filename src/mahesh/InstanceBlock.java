package mahesh;

public class InstanceBlock {
    //public int a;
    //


    public InstanceBlock(){
        System.out.println("i am in constructor");
    }
    {
        System.out.println("i am in instance block");
    }

    public static void main(String[] args) {
        InstanceBlock obj = new InstanceBlock();
        InstanceBlock obj2 = new InstanceBlock();


    }


}
