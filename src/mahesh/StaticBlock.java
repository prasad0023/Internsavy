package mahesh;

public class StaticBlock {
    int a;
    float b;
    static  int s;
    static {
        System.out.println(s);
        
        System.out.println(" i am in static block");
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        StaticBlock obj2 = new StaticBlock();
    }
}
