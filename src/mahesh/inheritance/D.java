package mahesh.inheritance;

import java.util.Date;

public class D extends C {
    public void test7(){
        System.out.println("i am in test7()");
    }
    public void test8(){
        System.out.println("i am in test8()");
    }

    public static void main(String[] args) {
        D obj = new D();
        int a;
        obj.test1();
        obj.test2();
        obj.test3();
        a=obj.test4();
        System.out.println(a);
       // System.out.println(obj.test4());
        obj.test5();
        obj.test6();
        obj.test7();
        obj.test8();



    }
}
