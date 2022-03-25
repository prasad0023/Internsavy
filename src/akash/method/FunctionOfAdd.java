package akash.method;

import java.util.Scanner;

public class FunctionOfAdd {
    public static int calculateAddition(int a , int b){

        System.out.println("I am in displayOutput method");
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The addition of a and b is"+calculateAddition(a,b));

    }
}
