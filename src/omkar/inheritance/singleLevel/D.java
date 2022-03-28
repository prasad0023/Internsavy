package omkar.inheritance.singleLevel;

public class D extends C{
    public void Test7 (){
        System.out.println("i am in test 7");
    }
    public void Test8(){
        System.out.println("i am in test 8");
    }

    public static void main(String[] args) {
         D obj = new D();
         int a;
         obj.Test1();
         obj.Test2();
         obj.Test3();
         obj.Test4();
        System.out.println(obj.Test4());
         obj.Test5();
         obj.test6();
         obj.Test7();
         obj.Test8();


    }
}
