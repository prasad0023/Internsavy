package rutuja.polymorphism;

public class Overloading {
    public int add(int x,int y){
        return x+y;
    }
    public int add(int x,int y,int z){
        return x+y+z;
    }
    public int add(int x,int y,int z,int a){
        return x+y+z+a;
    }

    public static void main(String[] args) {
        Overloading obj=new Overloading();
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10,20,30));
        System.out.println(obj.add(10,20,30,40));
    }
}
