package prasad.inheritance;

public class D extends C {
    public void Test7() {
        System.out.println("I am in Test7() Method");
    }

    public void Test8() {
        System.out.println("I am in Test8() Method");
    }

    public static void main(String[] args) {
        D obj = new D();
        obj.Test1();
        obj.Test2();
        obj.Test3();
        obj.Test4();
        obj.Test5();
        obj.Test6();
        obj.Test7();
        obj.Test8();
    }
}