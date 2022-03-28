package rutuja;

public class InstanceBlock {
    {
        //Instance Block
        System.out.println("I am in Instance Block");
    }
    {
        //Instance Block
        System.out.println("I am in Instance Block 2");
    }
    public InstanceBlock(){
        System.out.println("I am in contructor Instance Block");
    }
    public void display(){
        System.out.println("I am in display method");
    }

    public static void main(String[] args) {
        InstanceBlock obj=new InstanceBlock();
        InstanceBlock obj2=new InstanceBlock();

    }

}
