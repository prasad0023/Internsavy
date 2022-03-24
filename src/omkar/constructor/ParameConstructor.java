package omkar.constructor;

public class ParameConstructor {
    int a;
    float b;

    public ParameConstructor(int a, float b) {

        this.a = a;
        this.b = b;

    }

    public void Display() {
        System.out.println("a is=" + a);
        System.out.println("a is=" + b);
    }

    public static void main(String[] args) {
        ParameConstructor pc = new ParameConstructor(10, 20.5f);
        pc.Display();
    }
}
