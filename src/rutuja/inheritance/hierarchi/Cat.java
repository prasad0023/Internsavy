package rutuja.inheritance.hierarchi;

public class Cat extends Animal {
    public void meow() {
        System.out.println("I am in meow");
    }

    public static void main(String[] args) {
        Cat c=new Cat();
        c.meow();
        c.eat();

    }
}