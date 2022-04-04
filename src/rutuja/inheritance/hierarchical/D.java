package rutuja.inheritance.hierarchical;

public class D extends A{
    public void add7(){
        System.out.println("I am in add7()");
    }
    public void add8() {
        System.out.println("I am in add8()");
    }

    public static void main(String[] args) {
        D obj=new D();
        obj.add7();
        obj.add8();
        obj.add1();
        obj.add2();
    }
}
