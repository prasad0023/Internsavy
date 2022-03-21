package mahesh;

public class InstanceBlock {
    //public int a;
    //
    {
        System.out.println("i am in instance block");
    }

    public InstanceBlock(){
        System.out.println("i am in constructor");
    }

    public static void main(String[] args) {
        InstanceBlock obj = new InstanceBlock();
        InstanceBlock obj2 = new InstanceBlock();


    }


}
