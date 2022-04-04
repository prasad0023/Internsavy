package akash.hierarchical;

public class C extends A {
    public void test5(){
        System.out.println("I am in test5() method");
    }
    public void test6(){
        System.out.println("I am in test6() method");
    }

    public static void main(String[] args) {
        C obj=new C();
        obj.test1();
        obj.test2();
        obj.test5();
        obj.test6();
    }
}
