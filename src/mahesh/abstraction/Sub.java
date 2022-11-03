package mahesh.abstraction;

public class Sub extends Demo{


    @Override
    void show1() {
        System.out.println("i am in show1()");
    }

    @Override
    protected void display() {
        System.out.println("i am in display()");

    }
    
    public static void main(String[] args) {
        Sub obj = new Sub();
        obj.show();
        obj.display();
        obj.show1();
        Demo obj1 = new Sub();
        obj1.display();
        obj1.show1();
        obj1.show();
    }
}
