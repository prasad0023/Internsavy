package omkar.overloading;

public class Signature{
    public void add(int a,int b){
        System.out.println("hii");

    }
    public void add(int a,int b,int c){
        System.out.println("hello");
    }
    public  void add(int a,int b,int c,int d){

    }

    public float add(int a,float b){
        return a+b;
    }
    public double add(int a,float b,float c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Signature obj=new Signature();
        obj.add(10,20);
        System.out.println(obj.add(10,20f));
        System.out.println(obj.add(10,20f,30f));
    }
}
