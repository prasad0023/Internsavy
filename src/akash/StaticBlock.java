package akash;

public class StaticBlock {
     int a;
     float b;
     static int s;
    //Static Block
    static{
        //We cannot use non-static variable in static block like below,
        // System.out.println(a);
        System.out.println("I am in Static Block");
    }
    //Static Block 2
    static{
        System.out.println("I am in Static Block 2");
    }
    public void display(){
        System.out.println("I am in Display Method");
    }


    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        StaticBlock obj2 = new StaticBlock();

    }
}
