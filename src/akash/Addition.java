package akash;

import prasad.inheritance.A;

public class Addition extends A {
    public void sum(){
        int a=10;
        int b=20;
       int sum=a+b;
        System.out.println("The Sum is ="+sum);
    }

    public static void main(String[] args) {
        Addition obj= new Addition();
        new Addition().sum();
        System.out.println(obj.hashCode());


    }
}
