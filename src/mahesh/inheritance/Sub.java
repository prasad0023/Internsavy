package mahesh.inheritance;

public class Sub extends Super{
    int a=30,c=40;
    public void test3(){
        System.out.println(a);
       // System.out.println(super.a);
        System.out.println("i am in test3()");
    }

    public static void main(String[] args) {
        Sub obj = new Sub();
        obj.test1();
        obj.test2();
        obj.test3();

    }
}
