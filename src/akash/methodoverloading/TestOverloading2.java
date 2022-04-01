package akash.methodoverloading;

public class TestOverloading2 {
    public float add(int x, float y) {
        return x + y;
    }

    public float add(int x, int y, float z) {
        return x + y + z;
    }

    public int add(int x, int y, int z, int a) {
        return x + y + z + a;
    }

    public static void main(String[] args) {
        TestOverloading2 obj = new TestOverloading2();
        //obj.add(10,20);
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
        System.out.println(obj.add(10, 20, 30, 40));
    }
}
