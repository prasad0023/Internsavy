package akash.constructor;

public class NoParamConstructor {
    int a;
    float b;
    //No parameter/args Constructor
    public NoParamConstructor(){
        a=20;
        b=34;
        System.out.println("a is ="+a);
        System.out.println("b is ="+b);
    }
    public void NoParameterConstructor(){
        System.out.println("I am in NoParameterConstructor() method");

    }

    public static void main(String[] args) {
        NoParamConstructor obj = new NoParamConstructor();
        obj.NoParameterConstructor();
    }



}
