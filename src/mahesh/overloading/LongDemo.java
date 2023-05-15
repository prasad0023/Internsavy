package mahesh.overloading;

public class LongDemo {
   public void add(int x,int y){
        System.out.println(" first");
    }
    public void add(long x,long y) {
        System.out.println("long");

    }
   /* public void add(int x,long y){
        System.out.println("int long");
    }
    public void add(long x,int y){
        System.out.println("long int");
    } */

    public static void main(String[] args) {
        LongDemo obj= new LongDemo();
        obj.add(10,20);
    }
}
