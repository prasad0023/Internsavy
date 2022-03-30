package omkar.overloading;

public class Overloading1 {
    public float sum(float a, float b) {
        return a + b;
    }
    public float sum(int a,float b,float c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Overloading1 obj1 =new Overloading1();
        System.out.println(obj1.sum(10.10f,34.33f));
        System.out.println(obj1.sum(10,90.25f,77.77f));
    }
}
