package omkar.inheritance.hierarchical;

public class Child1 extends Hierarchical{
    public void childClass1(){
        System.out.println(" i am in childClass1");
    }
       public static void main(String[]args){
        Child1 obj = new Child1();
        obj.ParentClass();
        obj.childClass1();
        }
}
