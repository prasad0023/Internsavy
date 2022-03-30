package akash.hierarchical;

public class B extends A {
    public void test3(){
        System.out.println("I am in test3() method");
    }
    public void test4(){
        System.out.println("I am in test4() method");
    }

    public static void main(String[] args) {
        B obj=new B();
        obj.test1();
        obj.test2();
        obj.test3();
        obj.test4();
    }
}
