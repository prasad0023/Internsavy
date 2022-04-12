package mahesh.method.overriding;

public class Sub extends Super{

    public void display(){
        super.display();
        //System.out.println("sub class method");
    }

    public static void main(String[] args) {
       Super obj = new Super();
       obj.display();
       Sub obj1 = new Sub();
       //obj1.display();
       obj1.display();
       Super obj2 = new Sub();
       obj2.display();

    }
}
