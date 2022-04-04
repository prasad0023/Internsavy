package rutuja;

import java.util.Stack;

public class StaticVariable {
    int a;
    static int b;
    public void display(){
        System.out.println("a is ="+a);
        System.out.println("b is ="+b);
    }
    public static void display1(){
        System.out.println("b is ="+b);
    }

    public static void main(String[] args) {
        StaticVariable obj=new StaticVariable();
        obj.display();
        StaticVariable.display1();

    }
}
