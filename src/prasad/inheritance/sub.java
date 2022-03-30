package prasad.inheritance;

import omkar.inheritance.Sub;

public class sub extends Super {
    public  void Test3(){
        System.out.println("I am in sub class in Test3() Method in sub class");
    }

    public static void main(String[] args) {
        Sub Obj = new Sub();
        Obj.test1();
        Obj.test2();
        Obj.test3();
    }
}
