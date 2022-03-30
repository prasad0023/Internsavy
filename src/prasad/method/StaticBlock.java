package prasad.method;

public class StaticBlock {
    int a;
    int b;
    int c;
    static int d;
    static int e;
    static {
        System.out.println(d);
        System.out.println(e);
        System.out.println("I am in static block");
    }
    static {
        System.out.println(d);
        System.out.println(e);
        System.out.println("I am in second static block ");
    }

    public static void main(String[] args) {
        StaticBlock Sb1 = new StaticBlock();
        StaticBlock Sb2 = new StaticBlock();
    }
}
