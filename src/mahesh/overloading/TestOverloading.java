package mahesh.overloading;

public class TestOverloading {
    public void add(int x,int y){
        System.out.println((x+y));
        System.out.println("i am in add(int,int)");
    }
    public void add(float x,int y){
        System.out.println((x+y));
        System.out.println("i am in add(float,int)");
    }
    public float add(float x, int y,int e){
        return x+y+e;
    }
    public void add(int x,float y){
        System.out.println((x+y));
        System.out.println("i am in add(int,float)");
    }
    public static void main(String[] args) {
        TestOverloading obj =new TestOverloading();
        int a =10;
        float b=20;
        obj.add(a,b);
       obj.add(b,a);
        obj.add(a,10);
        TestOverloading.main(a);
        System.out.println(obj.add(10.22f,11,55));
       b=obj.add(10.f,10,11);
        System.out.println(b);
    }

    public static void main(int x) {
        System.out.println("static main");
    }
}

