package rutuja.inheritance.hierarchical;

public class C extends A{
    public void add5(){
        System.out.println("I am in add5()");
    }
    public void add6(){
        System.out.println("I am in add6()");
    }

    public static void main(String[] args) {
        C obj2=new C();
        obj2.add5();
        obj2.add6();
        obj2.add1();
        obj2.add2();
    }
}
