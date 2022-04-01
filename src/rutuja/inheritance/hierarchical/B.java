package rutuja.inheritance.hierarchical;

public class B extends A {
    public void add3(){
        System.out.println("I am in add3()");
    }
    public void add4(){
        System.out.println("I am in add4()");
    }

    public static void main(String[] args) {
        B obj2=new B();
        obj2.add3();
        obj2.add4();
        obj2.add1();
        obj2.add2();
    }
}
