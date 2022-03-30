package omkar.inheritance.singleLevel;

public class D extends C{
    public void test(){
        System.out.println("i am in test 7");
    }
    public void test8(){
        System.out.println("i am in test 8");
    }

    public static void main(String[] args) {
         D obj = new D();
         int a;
         obj.Test1();
         obj.Test2();
         obj.test3();
         obj.Test4();
        System.out.println(obj.Test4());
         obj.test5();
         obj.test6();
         obj.test8();


    }
}
