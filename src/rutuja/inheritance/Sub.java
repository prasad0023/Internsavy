package rutuja.inheritance;

public class Sub extends Super{
    public void test3(){
        System.out.println("I am in test3()");
    }

    public static void main(String[] args) {
        Sub obj=new Sub();
        obj.test1();
        obj.test2();
        obj.test3();
    }
}
