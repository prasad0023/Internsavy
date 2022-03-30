package akash.multilevelInheritance;

public class Akash4 extends Akash3{
    public void test7(){
        System.out.println("I am in test7 Method");
    }
    public void test8(){
        System.out.println("I am in test8 Method");
    }

    public static void main(String[] args) {
        Akash4 obj= new Akash4();
        int a;
        obj.test1();
        obj.test2();
        obj.test3();
        a=obj.test4();
        System.out.println(a);
        obj.test5();
        obj.test6();
        obj.test7();
        obj.test8();
    }
}
