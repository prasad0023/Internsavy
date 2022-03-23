package omkar;
// here we declare StaticBlock Class
public class StaticBlock {
    int a;             //instance variable
    int b;             //instance variable
     int c;            //instance variable
      static int s;      // static variable
      static int s1;       // static variable

    // here we create one static block
    static{
        System.out.println(s);
        System.out.println("i am in static block");
    }
    //here we create second static block
    static{
        System.out.println(s1);
        System.out.println(" i am in static block 2");
    }

    // static block execute only one time
    public static void main(String[] args) {
        StaticBlock SB =new StaticBlock();
        StaticBlock SB2 = new StaticBlock();



    }
}
