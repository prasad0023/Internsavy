package omkar;

public class InstanceBlock {
    //these is 1st Instance Block
    {
        System.out.println("i am in Instance Block");
    }
    //these is 2nd Instance Block
    {
        System.out.println("i am in Instance Block2");
    }
      // here create default constructor
    public InstanceBlock() {
        System.out.println("i am in constructor");
    }
       // create method
    public void display() {
        System.out.println("i am in display method");
    }


    public static void main(String[] args) {
        InstanceBlock IB = new InstanceBlock();
        InstanceBlock IB2 = new InstanceBlock();
        IB.display();
  // we create new object that time 1st instance block call before constructor.
        //contructor call only one time but instance block call every time.
    }
}