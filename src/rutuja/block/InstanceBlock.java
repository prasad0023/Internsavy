package rutuja.block;

public class InstanceBlock {
    {
        //Instance Block
        System.out.println("I am in Instance Block");
    }
    {
        //Instance Block2
        System.out.println("I am in Instance Block 2");
    }
    public InstanceBlock(){
        System.out.println("I am in constructor Instance Block");
    }
    public void display(){
        System.out.println("I am in display method()");
    }

    public static void main(String[] args) {
        InstanceBlock obj=new InstanceBlock();
        InstanceBlock obj2=new InstanceBlock();

        //nameless object
        new InstanceBlock().display();
    }


}
