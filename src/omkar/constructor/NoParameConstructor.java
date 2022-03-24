package omkar.constructor;

public class NoParameConstructor {
    public NoParameConstructor(){
        int a=10;
        int b=20;
        System.out.println("a is="+a);
    System.out.println("a is="+b);
    }
    public void NoParameConstructor(){
        System.out.println("i am in NoParameConstructor() method");
    }
    public static void main(String[] args) {
        NoParameConstructor obj = new NoParameConstructor();
        obj.NoParameConstructor();

    }
}
