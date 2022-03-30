package rutuja.inheritance.multi;

public class D extends C {
    public void test7(){
        System.out.println("I am in test7()");
    }
    public void test8(){
        System.out.println("I am in test8()");
    }

    public static void main(String[] args) {
        D obj=new D();
        obj.test1();
        obj.test2();
        obj.test3();
        obj.test4();
        obj.test5();
        obj.test6();
        obj.test7();
        obj.test8();

    }
}
