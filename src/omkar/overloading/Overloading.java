package omkar.overloading;

public class Overloading {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a, int b,int c){
        return a+b+c;
    }
    public int add(int a,int b, int c,int d){
        return a+b+c+d;
    }

    public static void main(String[] args) {
        Overloading obj =new Overloading();
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10,20,30));
        System.out.println(obj.add(10,20,30,40));
    }
}
