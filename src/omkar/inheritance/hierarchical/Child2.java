package omkar.inheritance.hierarchical;

public class Child2 extends Hierarchical {
    public void ChildClass2() {
        System.out.println("i am in Child class 2");
    }

    public static void main(String[] args) {
        Child2 obj = new Child2();
         obj.ParentClass();
         obj.ChildClass2();
    }
}