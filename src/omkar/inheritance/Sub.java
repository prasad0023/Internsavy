package omkar.inheritance;

public class Sub extends Super {
    public void test3(){
        System.out.println("i im in test3() class class sub");
    }


    public static void main(String[] args) {
        Sub obj = new Sub();
        obj.test1();
        obj.test2();
        obj.test3();


    }

}